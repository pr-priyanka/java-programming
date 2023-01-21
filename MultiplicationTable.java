import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
        int i,n, product=1;
        n=s.nextInt();
        for(i=1; i<=10; i++)
        {
            product=n*i;
            System.out.println(product);
        }
        
	}
}
