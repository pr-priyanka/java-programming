
public class Solution {

	public static char highestOccuringChar(String str) {
		//Your code goes here
		int arr[]=new int[256];
		int n=str.length();
		int count=0;
		for(int i=0;i<n;i++)
		{
			arr[str.charAt(i)]++;
			count=Math.max(count,arr[str.charAt(i)]);
			//int ascii=str.charAt(i);
			//arr[ascii]=arr[ascii]+1;
		}
		char res='\0';

		for(int i=0; i<n; i++)
		{
			if(arr[str.charAt(i)]==count)
			{
				res=str.charAt(i);
				break;
			}
		}
		return res;
	}

}
