import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=n,nd=0;
		double sum=0;
		while(n>0)
		{
			int rem=n%10;
			nd++;
			n=n/10;
		}
		n=m;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+(Math.pow(rem,nd));
			n=n/10;
		}
		if(sum==m)
		{
           System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

	}
}
