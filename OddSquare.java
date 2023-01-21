import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n)
		{
			int j=n;
			int p=(2*i)-1;
			while(j>0)
			{
				System.out.print(p);
				
				p=p+2;
				if(p>(2*n)-1)
				{
					p=1;
				}
				j--;
			}
			System.out.println();
			i++;
		}
	}
}
