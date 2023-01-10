/*


**Output**

    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *


*/


public class Main
{
	public static void main(String[] args) {
		int m = 5, n = 5;

        for (int i=0;i<m*2-1;i++)
        {
            if(i<m)
            {
                for(int k=m-1-i;k>0;k--)
                {
                    System.out.print(" ");
                }
                for(int j=0;j<=i;j++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                for(int k=i-m;k>=0;k--)
                {
                    System.out.print(" ");
                }
                for(int j=m*2-i;j>1;j--)
                {
                    System.out.print("*");
                }
            }
        	System.out.println ();
        }
	}
}
