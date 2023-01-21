
public class Solution {

	public static boolean isPermutation(String str1, String str2) {
		int arr[]=new int[256];
		for(int i=0; i<str1.length();i++)
		{
			int ascii=str1.charAt(i);
			arr[ascii]=arr[ascii]+1;
		}
		for(int i=0; i<str2.length();i++)
		{
			int ascii=str2.charAt(i);
			arr[ascii]=arr[ascii]-1;
		}
		for(int i=0; i<256; i++)
		{
			if(arr[i]!=0)
			{
				return false;
			}
		}
		return true;
	}

}
