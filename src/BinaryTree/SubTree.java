package BinaryTree;

import javax.swing.tree.TreeNode;

public class SubTree {
	public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode(int val) {
		this.val=val;
	}
	public TreeNode(int val, TreeNode left, TreeNode right) {
		super();
		this.val = val;
		this.left = left;
		this.right = right;
	}
	}
	public boolean isIdentical(TreeNode root, TreeNode subRoot) {
		 if(root == null && subRoot == null) {
			 return true;
		 }
		 if(root == null || subRoot == null) {
			 return true;
		 }
		 if(root.val == subRoot.val) {
		 return isIdentical(root.left,subRoot.left) && isIdentical(root.right, subRoot.right);
		 }
		 return false;
	 }
	 public boolean isSubTree(TreeNode root, TreeNode subRoot) {
		 if(subRoot == null) {
			 return true;
		 }
		 if(root == null) {
			 return false;
		 }
		 if(root.val == subRoot.val) {
			 if(isIdentical(root, subRoot)) {
				 return true;
			 }
		 }
		 return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
