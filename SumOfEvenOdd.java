import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
        int n, i, evenSum=0, oddSum=0;
        n=s.nextInt();
        int temp=n;
        for(i=0; i<=8; i++)
        {
             int last= temp%10;
        
             if(last%2==0)
            {
              evenSum =evenSum+last; 
            }
            else
            {
              oddSum=oddSum+last;
            }
              temp=temp/10;
        
        
        }
         System.out.println( evenSum +" "+ oddSum);

	}
}
