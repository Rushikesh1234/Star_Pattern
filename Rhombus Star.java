/*


**Output**

         *********                                                                                                              
        *********                                                                                                               
       *********                                                                                                                
      *********                                                                                                                 
     *********                                                                                                                  
    *********                                                                                                                   
   *********                                                                                                                    
  *********                                                                                                                     
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
                System.out.print("*");
            }
            System.out.println();
        }
	}
}

