
public class Solution {

	public static boolean isPalindrome(String str) {
	  String rev=" ";
	  String str1=str;
	  int i=0;
	  int j=str.length()-1;
	  while(i<=j)
	  {
         if(str.charAt(i)!=str.charAt(j))
		 {
			 return false;
		 }
		 else
		 {
			 i++;
			 j--;
		 }
	  }
	  return true;

	}

}
