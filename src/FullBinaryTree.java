import be.ac.ua.ansymo.adbc.annotations.invariant;
import be.ac.ua.ansymo.adbc.annotations.requires;
import be.ac.ua.ansymo.adbc.annotations.ensures;

@invariant({
	"this.isTwoOrNoLeaf()"
})
public class FullBinaryTree extends BinaryTree{
	
	private BinaryTree left;
	private BinaryTree right;
	
	public FullBinaryTree(long id){
		super(id);
		this.left = getLeft();
		this.right = getRight();
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
		this.left = a;
		this.right = b;
//		setLeft(a);
//		setRight(b);
	}
	
	public static void main(String[] args){
		FullBinaryTree a = new FullBinaryTree(2); 
	}
}
