
public class Solution {

	public static int countWords(String str) {	
		int count =0;
		int i=0;
		while(i< str.length())
		{
			char str1=str.charAt(i);
            if(str1==' ' || i==str.length()-1)
			{
                count++;
				i++;
			}
			i++;
			
		}
		return count;
	}

}
