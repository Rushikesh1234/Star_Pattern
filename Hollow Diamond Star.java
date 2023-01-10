/*

**Output**

**********
****  ****
***    ***
**      **
*        *
**      **
***    ***
****  ****
**********

*/

public class Main
{
	public static void main(String[] args) {
		
		int m=5,n=5;
		
		for(int i=0;i<m;i++)
		{
		    for(int j=m-1-i;j>=0;j--)
		    {
		        System.out.print("*");
		    }
		    for(int k=0;k<i;k++)
		    {
		        System.out.print(" ");
		    }
		    for(int l=0;l<i;l++)
		    {
		        System.out.print(" ");
		    }
		    for(int o=m-1-i;o>=0;o--)
		    {
		        System.out.print("*");
		    }
		    
		    System.out.println();
		}
		
		for(int i=1;i<m;i++)
		{
		    for(int j=0;j<=i;j++)
		    {
		        System.out.print("*");
		    }
		    for(int k=i;k<m-1;k++)
		    {
		        System.out.print(" ");
		    }
		    for(int l=m-1-i;l>0;l--)
		    {
		        System.out.print(" ");
		    }
		    for(int o=0;o<=i;o++)
		    {
		        System.out.print("*");
		    }
		    
		    System.out.println();
		}
	}
}
