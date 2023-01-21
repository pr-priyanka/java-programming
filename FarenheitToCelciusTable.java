import java.util.Scanner;
public class Solution {

	public static void printFahrenheitTable(int start, int end, int step) {
		while(start<=end)
		{
			
           int c= ((start-32)*5)/9;
		   System.out.println(start+" "+c);
		   start+=step;
		}
		
		
	}

}
