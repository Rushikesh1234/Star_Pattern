/*

**Output**

*****
 *  *
  * *
   **
    *

*/

public class Main
{
	public static void main(String[] args) {
		int m=5,n=5;
        
        for(int i=0;i<m;i++)
        {
            for(int k=0;k<i;k++)
            {
                System.out.print(" ");
            }
            for(int j=m-1-i;j>=0;j--)
            {
                if(i != 0 && j>0 && j<m-1-i)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }    
            }
            System.out.println();
        }    
	}
}
