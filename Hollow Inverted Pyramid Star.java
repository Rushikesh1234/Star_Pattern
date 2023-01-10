/*

**Output**


*********
 *     *
  *   *
   * *
    *

*/


public class Main
{
	public static void main(String[] args) {
		int m = 5, n = 5;

        for (int i=0;i<m;i++)
        {
        	for(int k=0;k<i;k++)
        	{
        	    System.out.print(" ");
        	}
        	for(int j=m*2-i;j>i+1;j--)
        	{
        	    if(i != 0 && j > i+2 && j < m*2-i)
        	    {
        	        System.out.print(" ");
        	    }
        	    else
        	    {
        	        System.out.print("*");
        	    } 
        	}
        	System.out.println ();
        }
	}
}
