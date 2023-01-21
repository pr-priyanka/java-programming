
public class Solution {

	public static void spiralPrint(int matrix[][]){
		//Your code goes here
		int row = matrix.length;
		if(row==0)
		return;
		int col = matrix[0].length;
		int count = 0;
		int rs = 0, re = row - 1, cs = 0, ce = col - 1;
		while (count < row * col) {

			for (int i = cs; count<row*col &&  i <= ce; i++) {
				System.out.print(matrix[rs][i] + " ");
				count++;
			}
			rs++;
			for (int i = rs; count<row*col && i <= re; i++) {
				System.out.print(matrix[i][ce] + " ");
				count++;
			}
			ce--;
			for (int i = ce; count<row*col && i >= cs; i--) {
				System.out.print(matrix[re][i] + " ");
				count++;
			}
			re--;
			for (int i = re; count<row*col && i >= rs; i--) {
				System.out.print(matrix[i][cs] + " ");
				count++;
			}
			cs++;
		}
	}
}
