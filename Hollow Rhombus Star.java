/*

**Output**

         *********                                                                                                              
        *       *                                                                                                               
       *       *                                                                                                                
      *       *                                                                                                                 
     *       *                                                                                                                  
    *       *                                                                                                                   
   *       *                                                                                                                    
  *       *                                                                                                                     
 *********  

*/

public class Main
{
	public static void main(String[] args) {
		
		int m=9,n=9;
        
        for(int i=0;i<m;i++)
        {
            for(int k=n-1-i;k>=0;k--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<n;j++)
            {
                if(j == 0 || j == n-1)
                {
                    System.out.print("*");
                }
                else if(i == 0 || i == m-1)
                {
                    System.out.print("*");
                }
                else if(j != 0 || j != n-1)
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
	}
}

