/*

**Output**

    +
    +
    +
    +
+++++++++
    +
    +
    +
    +

*/


public class Main
{
	public static void main(String[] args) {
		
		int m=5,n=5;
		
		for(int i=0;i<m+m-1;i++)
		{
		    if(i==m-1)
		    {
		        for(int j=0;j<m+m-1;j++)
		        {
		            System.out.print("+");
		        }
		    }
		    else
		    {
		        for(int k=0;k<m-1;k++)
		        {
		            System.out.print(" ");
		        }
		        System.out.print("+");
		    }
		    System.out.println();
		}
	}
}
