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
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<n;j++)
            {
                if(j==0 || j == n-1)
                {
                    System.out.print("*");
                }
                else if(i==0 || i==m-1)
                {
                    System.out.print("*");
                }
                else if(i!=0 || i!= m-1)
                {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
	}
}


