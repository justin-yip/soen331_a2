package BinaryTrees;

public class BinaryTreeClient {

	public static void main(String[] args) {
		
		//create all the separate nodes
		BinaryTree a1 = new BinaryTree(1);
		BinaryTree a2 = new BinaryTree(2);
		BinaryTree a3 = new BinaryTree(3);
		BinaryTree a4 = new BinaryTree(4);
		BinaryTree a5 = new BinaryTree(5);
		BinaryTree a6 = new BinaryTree(6);
		//create the tree and connect the nodes to each other
		a2.setRight(a4);
		System.out.println("a2.setRight(a4);");
		a3.setLeft(a5);
		System.out.println("a3.setLeft(a5);");
		a1.setRight(a3);
		System.out.println("a1.setRight(a3);");
		a1.setLeft(a2);
		System.out.println("a1.setLeft(a2);");
		//checks if has methods work
		System.out.println("a2 hasLeft(): "+a2.hasLeft());
		System.out.println("a2 hasRight(): "+a2.hasRight());
		System.out.println("a1 hasRight(): "+a1.hasRight());
		//sum of nodes
		System.out.println("a1 sum of nodes: "+a1.sumNodes());
		System.out.println("a2 sum of nodes: "+a2.sumNodes());
		//height of nodes
		System.out.println("a1 height of nodes: "+a1.height());
		System.out.println("a2 height of nodes: "+a2.height());
		//has two children
		System.out.println("a1 has two children: "+a1.hasTwoChildren());
		System.out.println("a2 has two children: "+a2.hasTwoChildren());
		System.out.println("a5 has two children: "+a5.hasTwoChildren());
		//has no children
		System.out.println("a1 has no children: "+a1.hasNoChildren());
		System.out.println("a3 has no children: "+a3.hasNoChildren());
		System.out.println("a4 has no children: "+a4.hasNoChildren());
		
		//Fail contracts
		//--class invariant: this.height != 0
		//a5.setHeight(0);
		
		//--BinaryTree requires: id != null
		//--BinaryTree ensures: (this.left == null && this.right == null) == true
		
		//--setRight() requires: iBinTree != null
		//a6.setRight(null);
		//--setRight() requires: $this.getRight() == null
		//a6.setRight(a1);
		//a6.setRight(a2);
		//--setRight() ensures: $this.getRight() != null
		//--setRight() ensures: $this.getRight() == iBinTree
		
		//--setLeft() requires: iBinTree != null
		//a6.setLeft(null);
		//--setLeft() requires: $this.getLeft() == null
		//a6.setLeft(a1);
		//a6.setLeft(a2);
		//--setLeft() ensures: $this.getLeft() != null
		//--setLeft() ensures: $this.getLeft() == iBinTree
		
	
	}

}
