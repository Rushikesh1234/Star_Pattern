/*
**Output**

     *
    ***
   *****
  *******
 *********
***********
 *********
  *******
   *****
    ***
     *
      
*/

public class Main
{
	public static void main(String[] args) {
		int m = 5, n = 5;

        for (int i=0;i<=m*2+1;i++)
        {
            if(i<m+1)
            {
                for(int k=m-i;k>0;k--)
                {
                    System.out.print(" ");
                }
                for(int j=0;j<=i*2;j++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                for(int k=m*2-i+1;k<=m;k++)
                {
                    System.out.print(" ");
                }
                for(int j=(m*2+1-i)*2;j>1;j--)
                {
                    System.out.print("*");
                }
            }
        	System.out.println();
        }
	}
}
