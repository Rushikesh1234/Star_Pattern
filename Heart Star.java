/*

**Output**

  *****     *****
 *******   *******
********* *********
*******************
 *****************
  ***************
   *************
    ***********
     *********
      *******
       *****
        ***
         *

*/


public class Main
{
	public static void main(String[] args) {
		
		int m=3,n=5;
		int temp = n;
		int val = n;
		int t1 = n*4;
		int t2 = t1 / 2;
		
		for(int i=0;i<m;i++)
		{
		    for(int j=m-i-1; j>0; j--)
		    {
		        System.out.print(" ");
		    }
		    for(int k=0;k<n;k++)
		    {
		        System.out.print("*");
		    }
		    for(int l=val-1;l>=0;l--)
		    {
		        System.out.print(" ");
		    }
		    for(int o=0;o<n;o++)
		    {
		        System.out.print("*");
		    }
		    n = n + 2;
		    val = val - 2;
		    temp--;
		    System.out.println();
		}
		for(int i=0; i<t2; i++)
		{
		    for(int k=0;k<i;k++)
		    {
		        System.out.print(" ");
		    }
		    for(int j=0;j<t1-1; j++)
		    {
		        System.out.print("*");
		    }
		    t1 = t1 - 2;
		    System.out.println();
		}
	}
}
