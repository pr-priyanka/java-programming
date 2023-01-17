import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int s= 1;
	 int e= 2*n+1;
	 int mid=n+1;
	 for (int i=1; i<=n; i++)
	  {
		  for(int j=1; j<=2*n+1;j++)
		  {

		  
               if(j==s || j==e || j==mid)
		        {
			          System.out.print("*");
		        }
		        else
		        {
			          System.out.print("0");
		        }
		  }

		       s++;
		        e--;
				System.out.println();
	  }
	  
	  
	}	
}	
