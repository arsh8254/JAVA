// Class containing left and right child of current node and its value
class TreeNode {
	int value;
	TreeNode left, right;
	public TreeNode(int item)
	{
		value = item;
		left = right = null;
	}
}

// A Java program to introduce Binary Tree
class BinaryTree {
	
	// Root of Binary Tree
	TreeNode root;
	
	// Constructors definition
	BinaryTree(int value) { root = new TreeNode(value); }
	BinaryTree() { root = null; }
	public static void main(String[] args)
	{
		BinaryTree tree = new BinaryTree();
		
		// Create root
		tree.root = new TreeNode(1);
		/* Following is the tree after above statement

		1
	   / \
	null null 

		*/

		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		/* 2 and 3 become left and right children of 1

			1
		   / \
		  2   3
		 / \ / \
	 null null null null 
        
        */

		tree.root.left.left = new TreeNode(4);
		/* 4 becomes left child of 2

			1
		   / \
		 2    3
		/ \  / \
	   4 null null null
	  / \
   null null
   
		*/

	}
}
