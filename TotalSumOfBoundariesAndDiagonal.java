
public class Solution {

	public static void totalSum(int[][] mat) {

		// 1 2 3 4
		// 4 5 6 4
		// 7 8 9 4
		// 6 2 3 4

		int row = mat.length;
		if(row == 0) {
			System.out.println(0);
			return;
		}
		int col = mat[0].length;
		int count = 0;

		for(int i = 0; i < col; i++){
			count += mat[0][i];
		}

		for(int i = 1; i < row; i++){
			count += mat[i][col - 1];
		}

		for(int i = col - 2; i >= 0; i--){
			count += mat[row - 1][i];
		}

		for(int i = 1; i < row - 1; i++){
			count += mat[i][0];
		}

		for(int i = 1; i < row - 1; i++){
			count += mat[i][i];
		}

		for(int i = 1, j = col - 2; i < row - 1 && j > 0; i++, j--){
			count += mat[i][j];
		}

		if(row % 2 == 0){
			System.out.println(count);
		}else{
			System.out.println(count - mat[row / 2][col / 2]);
		}
		




