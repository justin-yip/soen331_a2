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
		// Need to write something here
		return false;
	}
}
