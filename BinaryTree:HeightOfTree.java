/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

 */

public class Solution {

	public static int height(BinaryTreeNode<Integer> root) {
		//Your code goes here
		 if(root==null){
            return 0;
        }
        int smallLeftOutput = height(root.left);
        int smallRightoutput = height(root.right);
        if(smallRightoutput>smallLeftOutput){
            return smallRightoutput+1;
        }else{
            return smallLeftOutput+1;
        }
	}

}
