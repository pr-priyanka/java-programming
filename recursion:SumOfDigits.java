
public class solution {

	public static int sumOfDigits(int input){
        if(input==0){
            return 0;
        }
        int sum=0;
        
        while(input!=0){
            int digit=input%10;
            sum=sum+digit;
            input=input/10;
        }
        return sum;
    }

	
}
