/*
 * ************************************************************************************************************************************
 * Assignment 2 - SOEN 331 Section U-UB
 * By Harrison Ianatchkov ID: 6607403 and Justin Yip ID: 7032870
 * Due March 6, 2015
 * ************************************************************************************************************************************
 */

package BinaryTrees;

public class PerfectBinaryTreeClient {

	public static void main(String[] args) {
		
		System.out.println("This class will test the PerfectBinaryTree class");
		System.out.println("************************************************\n");
		
		//create all the separate nodes
		PerfectBinaryTree root = new PerfectBinaryTree(0);
		PerfectBinaryTree leaf1 = new PerfectBinaryTree(1);
		PerfectBinaryTree leaf2 = new PerfectBinaryTree(2);
		PerfectBinaryTree leaf3 = new PerfectBinaryTree(3);
		PerfectBinaryTree leaf4 = new PerfectBinaryTree(4);
		PerfectBinaryTree leaf5 = new PerfectBinaryTree(5);
		PerfectBinaryTree leaf6 = new PerfectBinaryTree(6);
		PerfectBinaryTree leaf7 = new PerfectBinaryTree(7);
		PerfectBinaryTree leaf8 = new PerfectBinaryTree(8);
		
		root.setLeftRight(leaf1, leaf4);
		System.out.println("root.setLeftRight(leaf1, leaf4);");
		leaf1.setLeftRight(leaf2, leaf3);
		System.out.println("leaf1.setLeftRight(leaf2, leaf3);");
		leaf4.setLeftRight(leaf5, leaf6);
		System.out.println("leaf4.setLeftRight(leaf5, leaf6);");
		
		
//		Checks if every node's immediate children are of the same height.
		System.out.println("Every node's immediate children are of the same height: " + root.sameHeight());
		
//		Fail contracts.
//		********************************************************************************
//		Please test one section (sections in forms of paragraphs) at a time for proper execution.
//		********************************************************************************
		
//		--class invariant: $this.sameHeight()
//		leaf2.setLeftRight(leaf7, leaf8);
//		System.out.println(root.sameHeight());

		
		
		
//		******************************************************************
//		This section tests for the inherited invariants, and pre and post conditions.
//		******************************************************************

		
//		Fail contracts.
//		********************************************************************************
//		Please test one section (sections in forms of paragraphs) at a time for proper execution.
//		********************************************************************************
		
//		BinaryTree class
		
//		--class invariant: this.height != 0
//		leaf4.setHeight(0);
		
//		--BinaryTree requires: id != null
//		--BinaryTree ensures: this.left == null && this.right == null
		
//		--setRight() requires: iBinTree != null
//		leaf5.setRight(null);
//		--setRight() requires: $this.getRight() == null
//		leaf5.setRight(root);
//		leaf5.setRight(leaf1);
//		--setRight() ensures: $this.getRight() != null
//		--setRight() ensures: $this.getRight() == iBinTree
		
//		--setLeft() requires: iBinTree != null
//		leaf5.setLeft(null);
//		--setLeft() requires: $this.getLeft() == null
//		leaf5.setLeft(root);
//		leaf5.setLeft(leaf1);
//		--setLeft() ensures: $this.getLeft() != null
//		--setLeft() ensures: $this.getLeft() == iBinTree
		
//		FullBinaryTree class
//		--class invariant: $this.isTwoOrNoleaf()
		leaf3.setRight(leaf7);
		
//		--setLeftRight() requires: $this.getLeft() == null
//		leaf1.setLeftRight(null, new FullBinaryTree(25));
		
//		--setLeftRight() requires: $this.getRight() == null
//		leaf1.setLeftRight(new FullBinaryTree(25), null);
	}
}
