import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n)
		{
			int j=1;
			while(j<=i)
			{
				char alp= (char)('A'+i-1);
				System.out.print(alp);
				j=j+1;
			}
			System.out.println();
			i=i+1;

		}


		
	}

}
