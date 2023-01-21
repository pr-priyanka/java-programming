import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int i=1;
	while(i<=n)
	{
		int spaces=1;
		while(spaces<=n-i)
        {
			System.out.print(" ");
			spaces++;
		}
		int j=1;
		int p=i;
		while(j<=i)
		{
			System.out.print(p);
			p++;
			j++;
		}
		int dec=i-1;
		while(dec>=1)
		{
			System.out.print(dec+i-1);
			dec--;
		}
		System.out.println();
		i++;
	}
	}
}
