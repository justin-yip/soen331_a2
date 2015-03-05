package BinaryTrees;
import be.ac.ua.ansymo.adbc.annotations.invariant;
import be.ac.ua.ansymo.adbc.annotations.requires;
import be.ac.ua.ansymo.adbc.annotations.ensures;

@invariant({
	"$this.isTwoOrNoLeaf()"
})
public class FullBinaryTree extends BinaryTree{
	
	public FullBinaryTree(long id){
		super(id);
	}
	
	public boolean isTwoOrNoLeaf(){
		if (hasTwoChildren()) 
			return ((FullBinaryTree) getLeft()).isTwoOrNoLeaf() && ((FullBinaryTree) getRight()).isTwoOrNoLeaf();
		else if (hasNoChildren()) 
			return true;
		else
			return false;
	}
	
	@requires ({
		"$this.getLeft() == null",
		"$this.getRight() == null",
		"a != null",
		"b != null"
	})
	@ensures ({
		"$this.getLeft() != null",
		"$this.getRight() != null",
		"$this.getLeft() == a",
		"$this.getRight() == b"
	})
	public void setLeftRight(BinaryTree a, BinaryTree b){
		this.left = a;
		this.right = b;
	}
	
	
}
