
import java.util.Scanner;

public class Solution {

    
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
	
       int  S=s.nextInt();
       int  e=s.nextInt();
       int  w=s.nextInt();
        int C=0;
        for(int i=S; i<=e; i=i+w)
        {
        C=(( i-32)*5)/9;
        System.out.println(i+ " "+C);
            
        }
		

		
	}

}
