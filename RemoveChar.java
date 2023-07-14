
public class Solution {

	public static String removeAllOccurrencesOfChar(String str, char ch) {
		String x = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ch) {
				x += str.charAt(i);
			}
		}
		return x;
	}

}
