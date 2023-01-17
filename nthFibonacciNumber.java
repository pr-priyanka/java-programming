import java.util.Scanner;
public class Solution {
	public static int fibo(int n){
		if(n == 0 || n == 1){
			return n;
		} 
		return fibo(n - 1) + fibo(n - 2);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		// int a=0;
		// int b=1;
		// if(n == 0 || n == 1){
		// 	System.out.print("1");
		// }
		// else {
		// 	int c = 0;	
		// for(int i=2; i<=n; i++)
		// {
        //  c=a+b;
		//    a=b;
		//    b=c;
		// }
		// System.out.println(c);	
		// }
		System.out.print(fibo(n));
	}

}
