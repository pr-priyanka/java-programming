public class Solution {
    public static int[] countS(int n, int m, int []a, int []b) {
        // Write your code here.
        int[]ans=new int[n];
        for(int i=0;i<n;i++){
            int l=0,h=m-1,cnt=0;
            while(l<=h){
                int mid=l+(h-l)/2;
                if(b[mid]<=a[i]){
                    cnt=mid+1;
                    l=mid+1;
                }
                else{
                    h=mid-1;
                }
            }
            ans[i]=cnt;
        }
        return ans;
        
    }
}
