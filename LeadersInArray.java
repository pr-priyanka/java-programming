

public class Solution {

	public static void leaders(int[] input) {
		int n=input.length;
		
	    for(int i=0; i< n ;i++) {
			boolean allSmaller=true;
			for(int j=i+1 ;j<n ;j++) {
				if(input[i] < input[j]) {
					allSmaller=false;
					break;
				}
			}
			if(allSmaller) {
				System.out.print(input[i]+" ");
			}
		}
		
	}
	
}
