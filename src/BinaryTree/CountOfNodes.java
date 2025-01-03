package BinaryTree;

import javax.swing.tree.TreeNode;

public class CountOfNodes {
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	static class BinaryTree{
		static int idx=-1;
		public static Node buildTree(int nodes[]) {
			idx++;
			if(nodes[idx]==-1) {
				return null;
			}
			Node newNode=new Node(nodes[idx]);
			newNode.left=buildTree(nodes);
			newNode.right=buildTree(nodes);
			
			return newNode;
		}
	}
	public static void preorder(Node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	
	public static int countOfNodes(Node root) {
		if(root==null) {
			return 0;
		}
		int leftNodes=countOfNodes(root.left);
		int rightNodes=countOfNodes(root.right);
		return leftNodes+rightNodes+1;
	}
	public static int  sumOfNodes(Node root) {
		if(root==null) {
			return 0;
		}
		int leftSum=sumOfNodes(root.left);
		int rightSum=sumOfNodes(root.right);
		
		return leftSum+rightSum+root.data;
	}
	public static int height(Node root) {
		if(root==null) {
			return 0;
		}
		int leftHeight=height(root.left);
		int rightHeight=height(root.right);
		
		int myHeight=Math.max(leftHeight, rightHeight)+1;
		
		return myHeight;
	}
	public static int diameter(Node root) {
		if(root==null) {
			return 0;
		}
		int diam1=diameter(root.left);
		int diam2=diameter(root.right);
		int diam3= height(root.left)+height(root.right)+1;
		return Math.max( diam3,Math.max(diam2, diam3));
	}
	 public static class TreeInfo{
		int ht;
		int diam;
		
		TreeInfo(int ht, int diam){
			this.ht=ht;
			this.diam=diam;
		}
	}
	 public static TreeInfo diamnater2(Node root) {
		 if(root==null) {
			 return new TreeInfo(0, 0);
		 }
		 TreeInfo left=diamnater2(root.left);
		 TreeInfo right=diamnater2(root.right);
		 
		 int myHeight=Math.max(left.ht, right.ht)+1;
		 
		 int diam1=left.diam;
		 int diam2=right.diam;
		 int diam3=left.ht+right.ht+1;
		 
		 int mydiam=Math.max(diam3,Math.max(diam1, diam2));
		 
		 TreeInfo myInfo =new TreeInfo(myHeight, mydiam);
		 return myInfo;
		 
	 }
	
	 
	 
	public static void main(String[] args) {
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree tree=new BinaryTree();
		Node root=tree.buildTree(nodes);
		//preorder(root);
		System.out.println("Count of Nodes:"+countOfNodes(root));
		System.out.println("SumOfNodes:"+sumOfNodes(root));
		System.out.println("Height of tree:"+height(root));
		System.out.println("Diametere:"+diameter(root));
		System.out.println("Diameter2:"+diamnater2(root).diam);
		
	}
	 }

