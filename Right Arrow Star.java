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
		    for(int j=0;j<i+i;j++)
		    {
		        System.out.print(" ");
		    }
		    for(int k=i;k<m;k++)
		    {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		
		for(int i=m-1;i>0;i--)
	    {
	        for(int j=i+i-2;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int k=m-i;k>=0;k--)
            {
                System.out.print("*");
            }
            System.out.println();
	    }
	}
}
