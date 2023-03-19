public class Solution {

	public static int arrayEquilibriumIndex(int[] arr){  
		  if(arr.length==0){
            return -1;
        }
        
        int rs = 0;
        int ls = arr[0];
        
        for(int i = 2; i<arr.length-1; i++){
            rs += arr[i];
        }
        
        int x = 1;
        
        while(rs != ls){
            ls += arr[x];
            //System.out.print(ls + " ");
            rs -= arr[x+1];
            //System.out.println(rs);
            x++;
            if(x==arr.length-1){
                return -1;
            }
        }
        return x;
	}
}
