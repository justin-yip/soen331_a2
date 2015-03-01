
public class FullBinaryTree extends BinaryTree{
	
	
	public FullBinaryTree(long id){
		super(id);
	}
	
	public boolean isTwoOrNoLeaf(){
		if (hasLeft() && hasRight()) 
			return ((FullBinaryTree) getLeft()).isTwoOrNoLeaf() && ((FullBinaryTree) getRight()).isTwoOrNoLeaf();
		else if (!hasLeft() && !hasRight()) 
			return true;
		else
			return false;
	}
	
	public void setLeftRight(BinaryTree a, BinaryTree b){
		
	}
	public static void main(String[] args){
		FullBinaryTree a = new FullBinaryTree(2);
	}
}
