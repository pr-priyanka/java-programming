public class Solution {

	public static int power(int x, int n) {
		if(n==0)
		{
			return 1;
		}
		int smallout=power(x,n-1);
		int out=x*smallout;
		return out;
		
	}
}
