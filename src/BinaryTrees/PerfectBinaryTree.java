package BinaryTrees;
import be.ac.ua.ansymo.adbc.annotations.invariant;

@invariant ({
	"this.isPerfect"
})
public class PerfectBinaryTree extends FullBinaryTree {
	private boolean isPerfect = sameHeight();
	
	public PerfectBinaryTree(long id) {
		super(id);
	}
	
	public boolean sameHeight() {
		if (getLeft() == null && getRight() == null)
			return true;
		else  {
			int heightLeft = getLeft().height();
			int heightRight = getRight().height();
			if(heightLeft == heightRight) {
				return ((PerfectBinaryTree) getLeft()).sameHeight() && ((PerfectBinaryTree) getRight()).sameHeight();
			}
			else
				return false;
		}
	}
}
