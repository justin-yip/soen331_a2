package BinaryTrees;
import be.ac.ua.ansymo.adbc.annotations.invariant;
import be.ac.ua.ansymo.adbc.annotations.requires;
import be.ac.ua.ansymo.adbc.annotations.ensures;

@invariant({
	"this.isTwoOrNoLeaf"
})
public class FullBinaryTree extends BinaryTree{
	
	private boolean isTwoOrNoLeaf = isTwoOrNoLeaf();
	
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
	
	@requires ({
		"getLeft() == null",
		"getRight() == null",
		"a != null",
		"b != null"
	})
	@ensures ({
		"getLeft() != null",
		"getRight() != null",
		"getleft() == a",
		"getRight() == b"
	})
	public void setLeftRight(BinaryTree a, BinaryTree b){
		this.left = a;
		this.right = b;
	}
}
