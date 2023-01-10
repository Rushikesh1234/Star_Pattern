/*

**Output**

    *****
   ****
  ***
 **
*
 **
  ***
   ****
    *****

*/

public class Main
{
	public static void main(String[] args) {
		
		int m=5,n=5;
		
		for(int i=0;i<m;i++)
		{
		    for(int j=i;j<m-1;j++)
		    {
		        System.out.print(" ");
		    }
		    for(int k=i;k<m;k++)
		    {
		        System.out.print("*");
		    }
		    System.out.println();
	    }
	    
	    for(int i=2;i<=m;i++)
	    {
	        for(int k=0;k<i-1;k++)
	        {
	            System.out.print(" ");
	        }
	        for(int l=0;l<i;l++)
	        {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}
}
