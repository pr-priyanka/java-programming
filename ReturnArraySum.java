import java.util.Scanner;
public class Solution {
	public static int sum(int[]arr){
     int n=arr.length;
	 int sum=0;
	 for(int i=0; i<n; i++)
	 {
		  sum=sum+arr[i];
		 
	 }
	 return sum;
	}
	
	public static int[] takeInput() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] =new int [n];
        for(int i=0;i<n;i++)
		{
			System.out.println("element at"+i+"th index");
			arr[i] =sc.nextInt();
		}
		return arr;

	}
	public static void main(String args[])
	{
		int []arr= takeInput();
		sum(arr);
	}
}
