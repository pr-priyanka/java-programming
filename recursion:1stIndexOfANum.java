
public class Solution {

	public static int firstIndex(int input[], int x) {
		   
        if(input.length==0){
            return -1;
        }
        if(input[0]==x){
            return 0;
        }
        int smallArray[]=new int[input.length-1];
        for(int i=1;i<input.length;i++){
            smallArray[i-1]=input[i];
        }
        int fi=firstIndex(smallArray,x);
        if(fi==-1){
            return -1;
        }else{
            return fi+1;
        }
        
        
    }
		
	
	
}
