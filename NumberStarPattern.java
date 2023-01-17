import java.util.Scanner;
public class runner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n)
		{
            int j=1;
			while(j<=n)
			{
				
				if(j==n-i+1)
				{
					System.out.print("*");
					j++;
			
				}
				else
				{
					System.out.print(n-j+1);
					j++;
					
				}
				

			}
			System.out.println();
			i++;
		}

	}
}
