
public class BinaryTree {
	private BinaryTree left;
	private BinaryTree right;
	private long id;
	
	public BinaryTree(long id) {
		this.id = id;
	}
	
	public BinaryTree getLeft() {return left;}
	public BinaryTree getRight() {return right;}
	
	public void setLeft(BinaryTree iBinTree) {
		left = iBinTree;
	}
	
	public void setRight(BinaryTree iBinTree) {
		right = iBinTree;
	}
	
	public boolean hasLeft() {
		return (left != null);
	}
	
	public boolean hasRight() {
		return (right != null);
	}
	
	public int sumNodes() {
		int sum = 1;
		if (hasLeft() && hasRight())
			sum += (getLeft().sumNodes() + getRight().sumNodes());
		else if (hasLeft() && !hasRight())
			sum += getLeft().sumNodes();
		else if (!hasLeft() && hasRight())
			sum += getRight().sumNodes();
		else
			return sum;
		
		return sum;
			
	}
}
