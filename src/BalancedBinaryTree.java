import be.ac.ua.ansymo.adbc.annotations.invariant;
import be.ac.ua.ansymo.adbc.annotations.requires;
import be.ac.ua.ansymo.adbc.annotations.ensures;

@invariant({
	"this.isBalanced() == true"
})
public class BalancedBinaryTree extends BinaryTree{

	public BalancedBinaryTree(long id) {
		super(id);
	}
	
	public boolean isBalanced(){
		if(hasLeft() && hasRight())
			return (Math.abs(getRight().height() - getLeft().height())) <=1;
		else if (hasLeft())
			return !(getLeft().hasRight() || getLeft().hasLeft());
		else if(hasRight())
			return !(getRight().hasRight() || getRight().hasLeft());
		else
			return true;
	}
}
