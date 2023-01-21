import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n)
		{
			int j=1;
			int k=i;
			while(j<=i)
			{
				char p=(char)('A'+k-1);
				System.out.print(p);
				k=k+1;
				j=j+1;

			}
			System.out.println();
			i=i+1;
		}
		

		
	}

}
