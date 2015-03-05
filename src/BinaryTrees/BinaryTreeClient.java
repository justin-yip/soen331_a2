package BinaryTrees;

public class BinaryTreeClient {

	public static void main(String[] args) {
		
		//create all the separate nodes
		BinaryTree root = new BinaryTree(1);
		BinaryTree leaf1 = new BinaryTree(2);
		BinaryTree leaf2 = new BinaryTree(3);
		BinaryTree leaf3 = new BinaryTree(4);
		BinaryTree leaf4 = new BinaryTree(5);
		BinaryTree leaf5 = new BinaryTree(6);
		//create the tree and connect the nodes to each other
		leaf1.setRight(leaf3);
		System.out.println("leaf1.setRight(leaf3);");
		leaf2.setLeft(leaf4);
		System.out.println("leaf2.setLeft(leaf4);");
		root.setRight(leaf2);
		System.out.println("root.setRight(leaf2);");
		root.setLeft(leaf1);
		System.out.println("root.setLeft(leaf1);");
		//checks if has methods work
		System.out.println("leaf1 hasLeft(): " + leaf1.hasLeft());
		System.out.println("leaf1 hasRight(): " + leaf1.hasRight());
		System.out.println("root hasRight(): " + root.hasRight());
		//sum of nodes
		System.out.println("root sum of nodes: " + root.sumNodes());
		System.out.println("leaf1 sum of nodes: " + leaf1.sumNodes());
		//height of nodes
		System.out.println("root height of nodes: " + root.height());
		System.out.println("leaf1 height of nodes: " + leaf1.height());
		//has two children
		System.out.println("root has two children: " + root.hasTwoChildren());
		System.out.println("leaf1 has two children: " + leaf1.hasTwoChildren());
		System.out.println("leaf4 has two children: " + leaf4.hasTwoChildren());
		//has no children
		System.out.println("root has no children: " + root.hasNoChildren());
		System.out.println("leaf2 has no children: " + leaf2.hasNoChildren());
		System.out.println("leaf3 has no children: " + leaf3.hasNoChildren());
		
		//Fail contracts
		//--class invariant: this.height != 0
		//leaf4.setHeight(0);
		
		//--BinaryTree requires: id != null
		//--BinaryTree ensures: (this.left == null && this.right == null) == true
		
		//--setRight() requires: iBinTree != null
		//leaf5.setRight(null);
		//--setRight() requires: $this.getRight() == null
		//leaf5.setRight(root);
		//leaf5.setRight(leaf1);
		//--setRight() ensures: $this.getRight() != null
		//--setRight() ensures: $this.getRight() == iBinTree
		
		//--setLeft() requires: iBinTree != null
		//leaf5.setLeft(null);
		//--setLeft() requires: $this.getLeft() == null
		//leaf5.setLeft(root);
		//leaf5.setLeft(leaf1);
		//--setLeft() ensures: $this.getLeft() != null
		//--setLeft() ensures: $this.getLeft() == iBinTree
		
	
	}

}
