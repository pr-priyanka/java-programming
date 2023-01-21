
public class Solution {

	public static void findLargest(int mat[][]){
		//Your code goes here
		int s = 0;
		int n_rows = mat.length;
		// int m_cols = mat[0].length;
		if (n_rows == 0) {
			System.out.println("row " + s + " " + Integer.MIN_VALUE);
			return;
		}
		int m_cols = mat[0].length;
		int maxRowSum = Integer.MIN_VALUE;
		int maxRow = Integer.MIN_VALUE;
		for (int i = 0; i < n_rows; i++) {
			int sum = 0;
			for (int j = 0; j < m_cols; j++) {
				sum += mat[i][j];
			}
			if (maxRowSum < sum) {
				maxRowSum = sum;
				maxRow = i;
			}
		}
		int maxColSum = Integer.MIN_VALUE;
		int maxCol = Integer.MIN_VALUE;

		for (int i = 0; i < m_cols; i++) {
			int sum = 0;
			for (int j = 0; j < n_rows; j++) {
				sum += mat[j][i];
			}
			if (maxColSum < sum) {
				maxColSum = sum;
				maxCol = i;
			}
		}

		if (maxRowSum >= maxColSum) {
			System.out.println("row " + maxRow + " " + maxRowSum);
		} else {
			System.out.println("column " + maxCol + " " + maxColSum);
		}
	}

}
