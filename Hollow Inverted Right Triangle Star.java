/*

**Output**

******                                                                                                                        
*   *                                                                                                                         
*  *                                                                                                                          
* *                                                                                                                           
**                                                                                                                            
* 

*/

public class Main
{
	public static void main(String[] args) {
		int m=10,n=5;
        
        for(int i=0;i<m;i++)
        {
            for(int j=n-i;j>=0;j--)
            {
                if(i>0 && j>0 && j<n-i)
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
