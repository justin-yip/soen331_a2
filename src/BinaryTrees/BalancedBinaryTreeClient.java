/*
 * ************************************************************************************************************************************
 * Assignment 2 - SOEN 331 Section U-UB
 * By Harrison Ianatchkov ID: 6607403 and Justin Yip ID: 7032870
 * Due March 6, 2015
 * ************************************************************************************************************************************
 */

package BinaryTrees;

public class BalancedBinaryTreeClient {

	public static void main(String[] args){
		
		System.out.println("This class will test the PerfectBinaryTree class");
		System.out.println("************************************************\n");
		
		//create all the separate nodes
		BalancedBinaryTree root1 = new BalancedBinaryTree(1);
		BalancedBinaryTree leaf11 = new BalancedBinaryTree(2);
		BalancedBinaryTree leaf12 = new BalancedBinaryTree(3);
		BalancedBinaryTree root2 = new BalancedBinaryTree(1);
		BalancedBinaryTree leaf21 = new BalancedBinaryTree(2);
		BalancedBinaryTree leaf22 = new BalancedBinaryTree(3);

		//create the tree and connect the nodes to each other
		root1.setRight(leaf11);
		System.out.println("root1.setRight(leaf11);");
		root1.setLeft(leaf12);
		System.out.println("root1.setLeft(leaf12);");
		//checks if isbalanced method works
		System.out.println("root1 is balanced: "+root1.isBalanced());
		
		
		
		
//		Fail contracts
//		--class invariant: this.height != 0
//		root1.setHeight(0);
		
//		--class invariant: this.isBalanced
//		leaf21.setRight(leaf22);
//		leaf21.setRight(leaf22);
//		root2.setRight(leaf21);
//		root2.setRight(leaf21);
		
//		--setRight() requires: iBinTree != null
//		leaf12.setRight(null);
//		--setRight() requires: $this.getRight() == null
//		root2.setRight(root1);
//		root2.setRight(leaf11);
	
//		--setLeft() requires: iBinTree != null
//		root2.setLeft(null);
//		--setLeft() requires: $this.getLeft() == null
//		root2.setLeft(root1);
//		root2.setLeft(leaf11);

	}
}
