/*

**Output**

*                                                                                                                               
**                                                                                                                              
* *                                                                                                                             
*  *                                                                                                                            
*   *                                                                                                                           
*    *                                                                                                                          
*     *                                                                                                                         
*      *                                                                                                                        
*       *                                                                                                                       
********** 


*/

public class Main
{
	public static void main(String[] args) {
		int m=10,n=10;
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(j>0 && j<i && i!=m-1)
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
