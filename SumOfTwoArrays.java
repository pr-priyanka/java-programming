
public class Solution {

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	 int len1 = arr1.length;
        int len2 = arr2.length;
        int len3, small;
        int car = 0;
         if (len1<=len2){
            small = len1;
        }
        
        else{
            small = len2;
        }
        
        if (len1>=len2){
            len3 = len1;
        }else{
            len3 = len2;
        }
        
        len3++;
        for(int i= 0; i<small; i++){
            output[len3 - i - 1] = (arr1[len1-i-1] + arr2[len2-i-1] + car)%10;
            car = (arr1[len1-i-1] + arr2[len2-i-1] + car)/10;
        }
        
        
        if (len1>len2){
            for(int i = len2; i<len1; i++){
                output[len3-i-1] = (arr1[len1-i-1] + car)%10;
                car = arr1[len1-i-1]/10;
            }
            
        }
        
        else if(len2>len1){
            for(int i = len1; i<len2; i++){
                output[len3-i-1] = (arr2[len2-i-1] + car)%10;
                car = arr2[len2 - i -1]/10;
            }
        }
        
        output[0] += car;
    }

}
