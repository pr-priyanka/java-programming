import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int first=(n+1)/2;
     int second=n/2;
     int i=1;
      while(i<=first)
      {
       int spaces=1;
        while (spaces<=(first-i))
          {
            System.out.print(" ");
            spaces++;

          }
          int j=1;
          while(j<=(2*i)-1){
            System.out.print("*");
            j++;
          }
          System.out.println();
          i++;

        }
        // int k=second;
        // while(k>=1)
        // {
        //   int spc=1;
        //   while(spc<=second-k+1)
        //   {
        //     System.out.print(" ");
        //     spc++;

        //   }
        //   int l=1;
        //   while(l<=(2*k)-1);
        //   {
        //     System.out.print("*");
        //     l++;
        //   }

        //   System.out.println();
        //   k--;

        // }
      int n2=second;
          for(int i1=0;i1<n2;i1++){
            for(int space2=0;space2<=i1;space2++){
                System.out.print(' ');
            }
            
            for(int num2=0;num2<n2-i1;num2++){
                System.out.print('*');
            }
            
            for(int num3=0;num3<n2-i1-1;num3++)
                System.out.print('*');
            
            
            System.out.println();
        }


    }
}
