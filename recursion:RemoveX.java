
public class solution {

	// Return the changed string
	public static String removeX(String input){
		if (input.length() == 0) {
			return "";
		}
		if (input.charAt(0) == 'x') {
			return removeX(input.substring(1));
		}
		return input.charAt(0) + removeX(input.substring(1));

	}
}
