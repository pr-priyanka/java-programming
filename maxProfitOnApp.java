import java.util.Arrays;
 class solution {

	public static int maximumProfit(int budget[]) {
	    Arrays.sort(budget);
		int[] profit=new int[budget.length];
		for(int i=0;i<budget.length;i++) {
			profit[i]=(budget.length-i)*bud[i];
		}
		int max=Integer.MIN_VALUE;
		for(int i : profit) {
			if(max < i) {
				max=i;
			}
		}
		return max;
        
	}

	

}
