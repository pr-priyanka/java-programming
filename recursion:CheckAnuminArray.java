public class Solution {
	
	public static boolean checkNumber(int input[], int x) {
		
		// if(input[0]==x){
		// 	return true;
		// }
		// int small[]=new int[input.length-1];
		// for(int i=1;i<input.length;i++){
		// 	small[i-1]=input[i];
		// }
		// boolean present=checkNumber(small,x);
		// return present;
		if (input.length==1)
        {
            if (input[0]==x)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else if (input[input.length-1]==x)
        {
            return true;
        }
        int[] smallCheck = new int[input.length-1];
        for (int i=0;i<input.length-1;i++)
        {
            smallCheck[i]=input[i];
        }
        boolean output=checkNumber(smallCheck,x);
        return output;
	}
}
