/*
 * ************************************************************************************************************************************
 * Assignment 2 - SOEN 331 Section U-UB
 * By Harrison Ianatchkov ID: 6607403 and Justin Yip ID: 7032870
 * Due March 6, 2015
 * ************************************************************************************************************************************
 */

package BinaryTrees;

public class FullBinaryTreeClient {

	public static void main(String[] args) {
		
		System.out.println("This class will test the FullBinaryTree class");
		System.out.println("************************************************\n");
		
		//create all the separate nodes
		FullBinaryTree root = new FullBinaryTree(0);
		FullBinaryTree leaf1 = new FullBinaryTree(1);
		FullBinaryTree leaf2 = new FullBinaryTree(2);
		FullBinaryTree leaf3 = new FullBinaryTree(3);
		FullBinaryTree leaf4 = new FullBinaryTree(4);
		FullBinaryTree leaf5 = new FullBinaryTree(5);
		
		leaf2.setLeftRight(leaf3, leaf4);
		System.out.println("leaf2.setLeftRight(leaf3, leaf4);");
		root.setLeftRight(leaf2, leaf1);
		System.out.println("root.setLeftRight(leaf2, leaf1);");
		
//		Checks if every node has either two or no children
		System.out.println("The root and its children have either two or no children: " + root.isTwoOrNoLeaf());
		
//		Fail contracts.
//		********************************************************************************
//		Please test one section (sections in forms of paragraphs) at a time for proper execution.
//		********************************************************************************
//		--class invariant: $this.isTwoOrNoleaf()
//		leaf1.setRight(leaf5);
		
//		--setLeftRight() requires: $this.getLeft() == null
//		--setLeftRight() requires: a != null
//		leaf1.setLeftRight(null, new FullBinaryTree(25));
		
//		--setLeftRight() requires: $this.getRight() == null
//		--setLeftRight() requires: b != null
//		leaf1.setLeftRight(new FullBinaryTree(25), null);

		
		
		
//		******************************************************************
//		This section tests for the inherited invariants, and pre and post conditions.
//		******************************************************************

		
//		Fail contracts.
//		********************************************************************************
//		Please test one section (sections in forms of paragraphs) at a time for proper execution.
//		********************************************************************************
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
	}

}
