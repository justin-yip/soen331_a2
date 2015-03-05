package BinaryTrees;

public class PerfectBinaryTreeClient {

	public static void main(String[] args) {
		PerfectBinaryTree root = new PerfectBinaryTree(0);
		PerfectBinaryTree leaf1 = new PerfectBinaryTree(1);
		PerfectBinaryTree leaf2 = new PerfectBinaryTree(2);
		PerfectBinaryTree leaf3 = new PerfectBinaryTree(3);
		PerfectBinaryTree leaf4 = new PerfectBinaryTree(4);
		PerfectBinaryTree leaf5 = new PerfectBinaryTree(5);
		PerfectBinaryTree leaf6 = new PerfectBinaryTree(6);
		PerfectBinaryTree leaf7 = new PerfectBinaryTree(7);
		PerfectBinaryTree leaf8 = new PerfectBinaryTree(8);
		
		leaf1.setLeftRight(leaf2, leaf3);
		System.out.println("leaf1.setLeftRight(leaf2, leaf3);");
		leaf4.setLeftRight(leaf5, leaf6);
		System.out.println("leaf4.setLeftRight(leaf5, leaf6);");
		root.setLeftRight(leaf1, leaf4);
		System.out.println("leaf4.setLeftRight(leaf5, leaf6);");
		
//		Checks if every node's immediate children are of the same height.
		System.out.println("Every node's immediate children are of the same height: " + root.sameHeight());
		
//		Fail the invariant
//		leaf2.setLeft(leaf7);
//		leaf6.setRight(leaf8);
		
		
		
//		******************************************************************
//		This section tests for the inherited invariants, and pre and post conditions.
//		******************************************************************

//		********************		
//		FullBinaryTree
		
//		Fail the FullBinaryTree invariant
//		leaf1.setRight(leaf5);
		
//		Fail setLeftRight()
//		leaf1.setLeftRight(null, null);
		
//		********************
//		BinaryTree
		
//		Fail contracts
//		--class invariant: this.height != 0
//		leaf4.setHeight(0);
//		
//		--BinaryTree requires: id != null
//		--BinaryTree ensures: (this.left == null && this.right == null) == true
//		
//		--setRight() requires: iBinTree != null
//		leaf5.setRight(null);
//		--setRight() requires: $this.getRight() == null
//		leaf5.setRight(root);
//		leaf5.setRight(leaf1);
//		--setRight() ensures: $this.getRight() != null
//		--setRight() ensures: $this.getRight() == iBinTree
//		
//		--setLeft() requires: iBinTree != null
//		leaf5.setLeft(null);
//		--setLeft() requires: $this.getLeft() == null
//		leaf5.setLeft(root);
//		leaf5.setLeft(leaf1);
//		--setLeft() ensures: $this.getLeft() != null
//		--setLeft() ensures: $this.getLeft() == iBinTree
	}
}
