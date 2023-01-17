import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
    	int n=sc.nextInt();
		int[] s= new int[n];
	 	
		for (int i=0; i<n; i++) {
      		s[i]=sc.nextInt();   
		}
	
		boolean chk=true;
		int count=0;
	
		for(int i = 0; i < n - 1; i++) {
       		if(s[i]==s[i+1]) {
				chk=false;
				break;
			}
			if(s[i] < s[i+1]) {
				count = 1;
			}

			if(s[i] > s[i + 1] && count == 1) {
				chk = false;
				break;
			}
		}
		System.out.println(chk);
	}
}
