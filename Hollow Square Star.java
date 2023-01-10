/*


**Output**

*****                                                                                                                         
*   *                                                                                                                         
*   *                                                                                                                         
*   *                                                                                                                         
***** 

*/

public class Main
{
	public static void main(String[] args) {
		
		int m=5,n=5;
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i == 0 || i == m-1) 
                { 
                    //System.out.print("Hello ");
                    System.out.print("*");
                }
                else if(j == 0 || j == n-1)
                {
                    //System.out.print("Hi ");
                    System.out.print("*");
                }
                else if(j != 0 && j != n-1)
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
	}
}

