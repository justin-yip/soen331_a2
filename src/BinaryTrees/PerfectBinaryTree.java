/*
 * ************************************************************************************************************************************
 * Assignment 2 - SOEN 331 Section U-UB
 * By Harrison Ianatchkov ID: 6607403 and Justin Yip ID: 7032870
 * Due March 6, 2015
 * ************************************************************************************************************************************
 */

package BinaryTrees;
import be.ac.ua.ansymo.adbc.annotations.invariant;

@invariant ({
	"$this.sameHeight()"
})
public class PerfectBinaryTree extends FullBinaryTree {
	
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
