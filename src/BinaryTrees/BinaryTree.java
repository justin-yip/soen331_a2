/*
 * ************************************************************************************************************************************
 * Assignment 2 - SOEN 331 Section U-UB
 * By Harrison Ianatchkov ID: 6607403 and Justin Yip ID: 7032870
 * Due March 6, 2015
 * ************************************************************************************************************************************
 */

package BinaryTrees;
import be.ac.ua.ansymo.adbc.annotations.invariant;
import be.ac.ua.ansymo.adbc.annotations.requires;
import be.ac.ua.ansymo.adbc.annotations.ensures;

@invariant ({
	"this.height != 0",
})
public class BinaryTree {
	protected BinaryTree left;		
	protected BinaryTree right;
	protected int height = height();
	protected long id;
	
	@requires({
		"this.id != null"
	})
	@ensures ({
		"(this.left == null && this.right == null) == true"
	})
	public BinaryTree(long id) {
		left = null;
		right = null;
		this.id = id;
	}
	
	public BinaryTree getLeft() {return left;}
	public BinaryTree getRight() {return right;}
	
	@requires ({
		"iBinTree != null",
		"$this.getLeft() == null"
	})
	@ensures ({
		"$this.left != null",
		"$this.left == iBinTree"
	})
	public void setLeft(BinaryTree iBinTree) {
		left = iBinTree;
	}
	
	@requires ({
		"iBinTree != null",
		"$this.getRight() == null"		
	})
	@ensures ({
		"$this.getRight() != null",
		"$this.getRight() == iBinTree"
	})
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
		if (hasTwoChildren())
			return sum + (getLeft().sumNodes() + getRight().sumNodes());
		else if (hasLeft() && !hasRight())
			return sum + getLeft().sumNodes();
		else if (!hasLeft() && hasRight())
			return sum + getRight().sumNodes();
		else
			return sum;
	}
	
	public int height() {
		int height = 1;
		int hL = 0;
		int hR = 0;
		
		if (hasNoChildren())
			return height;
		else if (!hasRight())
			return height + getLeft().height();
		else if (!hasLeft())
			return height + getRight().height();
		else {
			hL = getLeft().height();
			hR = getRight().height();
			if (hR > hL)
				return height + hR;
			else 
				return height + hL;
		}
	}
	
	protected boolean hasTwoChildren() {
		if (hasLeft() && hasRight()) 
			return true;
		else 
			return false;
	}
	
	protected boolean hasNoChildren() {
		if (!hasLeft() && !hasRight())
			return true;
		else
			return false;
	} 
	//added methods to test contracts
	public void setHeight(int height){
		this.height = height;
	}
}
