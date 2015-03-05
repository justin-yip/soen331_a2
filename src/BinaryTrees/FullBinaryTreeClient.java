package BinaryTrees;

public class FullBinaryTreeClient {

	public static void main(String[] args) {
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
		
//		Checks if Every node has either two or no children
		System.out.println("root and its children have either two or no children: " + root.isTwoOrNoLeaf());
		
//		Fail the invariant
//		leaf1.setRight(leaf5);
		
//		Fail setLeftRight()
//		leaf1.setLeftRight(null, null);
	}

}
