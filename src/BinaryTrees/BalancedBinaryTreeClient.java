package BinaryTrees;

public class BalancedBinaryTreeClient {

	public static void main(String[] args){
		
		//create all the separate nodes
		BalancedBinaryTree a1 = new BalancedBinaryTree(1);
		BalancedBinaryTree a2 = new BalancedBinaryTree(2);
		BalancedBinaryTree a3 = new BalancedBinaryTree(3);
		BalancedBinaryTree b1 = new BalancedBinaryTree(1);
		BalancedBinaryTree b2 = new BalancedBinaryTree(2);
		BalancedBinaryTree b3 = new BalancedBinaryTree(3);

		//create the tree and connect the nodes to each other
		a1.setRight(a2);
		System.out.println("a1.setRight(a2);");
		a1.setLeft(a3);
		System.out.println("a1.setLeft(a3);");
		b2.setRight(b3);
		System.out.println("b2.setRight(b3);");
		b1.setRight(b2);
		System.out.println("b1.setRight(b2);");
		//checks if isbalanced method work
		System.out.println("a1 is balanced: "+a1.isBalanced());
		
		
		
		
		//Fail contracts
		//--class invariant: this.height != 0
		//a1.setHeight(0);
		//--class invariant: this.isBalanced
		//b1.isBalanced();
		
		//--BinaryTree requires: id != null
		//--BinaryTree ensures: (this.left == null && this.right == null) == true
		
		//--setRight() requires: iBinTree != null
		//a3.setRight(null);
		//--setRight() requires: $this.getRight() == null
		//a4.setRight(a1);
		//a4.setRight(a2);
		//--setRight() ensures: $this.getRight() != null
		//--setRight() ensures: $this.getRight() == iBinTree
		
		//--setLeft() requires: iBinTree != null
		//a4.setLeft(null);
		//--setLeft() requires: $this.getLeft() == null
		//a4.setLeft(a1);
		//a4.setLeft(a2);
		//--setLeft() ensures: $this.getLeft() != null
		//--setLeft() ensures: $this.getLeft() == iBinTree
	}
}