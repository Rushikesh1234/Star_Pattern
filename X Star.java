/*

**Output**

*      *
 *    * 
  *  *  
   **   
   **   
  *  *  
 *    * 
*      *

*/

public class Main
{
	public static void main(String[] args) {
		
		int m=8,n=9;
		
		for(int i=0;i<m;i++)
		{
		    for(int j=0;j<m;j++)
		    {
		        if(i==j || j == m-1-i)
		        {
		            System.out.print("*");
		        }
		        else
		        {
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		}
	}
}
