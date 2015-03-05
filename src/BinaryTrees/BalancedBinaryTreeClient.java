package BinaryTrees;

public class BalancedBinaryTreeClient {

	public static void main(String[] args){
		
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
		
		
		
		
		//Fail contracts
		//--class invariant: this.height != 0
		//root1.setHeight(0);
		
		//--class invariant: this.isBalanced
		//leaf21.setRight(leaf22);
		//leaf21.setRight(leaf22);
		//root2.setRight(leaf21);
		//root2.setRight(leaf21);
		
		//--setRight() requires: iBinTree != null
		//leaf12.setRight(null);
		//--setRight() requires: $this.getRight() == null
		//a4.setRight(root1);
		//a4.setRight(leaf11);
	
		//--setLeft() requires: iBinTree != null
		//a4.setLeft(null);
		//--setLeft() requires: $this.getLeft() == null
		//a4.setLeft(root1);
		//a4.setLeft(leaf11);

	}
}
