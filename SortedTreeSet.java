

public class SortedTreeSet implements SortedTreeSetInterface {
	
	Person value = null;
	SortedTreeSet left = null;
	SortedTreeSet right = null;
	//SortedTreeSet parent = null;
	
	
	
	public Person getPerson() {
		return value;
	}

	public boolean hasLeft() {
		if (this.left != null) {
			return true;
		}
		else {
			return false;
		}
	}
	public void setLeft(SortedTreeSet left) {
		this.left = left;
	}
	public SortedTreeSet getLeft() {
		return left;
	}

	public boolean hasRight() {
		if (this.right != null) {
			return true;
		}
		else {
			return false;
		}
	}
	public void setRight(SortedTreeSet right) {
		this.right = right;
	}
	public SortedTreeSet getRight() {
		return right;
	}

	public void add(Person p) {
		if (value == null) {
			value = p;
		}
		
		
		
		// if it goes to the left
		if (p.getName().compareTo(value.getName()) > 0) {
			if (left == null) {
				// p is our new left
				left = new SortedTreeSet();
				left.value = p;
			}
			else {
				// add p to the left
				left.add(p);
			}
		}
		// if it goes to the right
		else if (p.getName().compareTo(value.getName()) < 0) {
			if (right == null) {
				// p is our new right
				right = new SortedTreeSet();
				right.value = p;
			}
			else {
				// add p to the right
				right.add(p);
			}
		}
		else {
			// the names are the same, so we shouldnt add p
		}
	}
	
	
}