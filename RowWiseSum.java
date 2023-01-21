
public class Solution {

	public static void rowWiseSum(int[][] mat) {
		int n_rows= mat.length;
		if(n_rows==0)return ;
		int m_cols=mat[0].length;
		int sum=0;
		for(int i=0; i<n_rows; i++)
		{   sum=0;
            for(int j=0; j<m_cols; j++)
			{
              sum= sum+ mat[i][j];
			}
			System.out.print(sum+ " ");
		}
	}

}
