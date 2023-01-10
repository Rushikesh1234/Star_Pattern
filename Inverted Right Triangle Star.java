/*

**Output**

******                                                                                                                        
*****                                                                                                                         
****                                                                                                                          
***                                                                                                                           
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
                System.out.print("*");
            }
            System.out.println();
        }    
	}
}
