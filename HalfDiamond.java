import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("*");
        int i=1;
        while(i<=n)
        {
            System.out.print("*");
            int j=1;
            while(j<=i)
            {
                System.out.print(j);
                j++;
            }
            j=j-2;
            while(j>=1)
            {
                System.out.print(j);
                j--;
            }
            System.out.println("*");
            i++;
        }
        int k=1;
        while(k<=n-1)
        {
            System.out.print("*");
            int l=1;
            while(l<=n-k)
            {
                System.out.print(l);
                l++;
            }
            l=l-2;
            while(l>=1)
            {
                System.out.print(l);
                l--;
            }
            System.out.println("*");
            k++;
        }
        System.out.println("*");
        
        
        
    }
}
