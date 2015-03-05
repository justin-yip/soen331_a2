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

@invariant({
	"$this.isBalanced()"
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
