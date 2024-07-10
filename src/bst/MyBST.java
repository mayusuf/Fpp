package bst;

public class MyBST {
	
	/** The tree root. */
	BinaryNode root;

	public MyBST() {
		root = null;
	}

	/**
	 * Prints the values in the nodes of the tree in sorted order.
	 */
	public void printTree() {
		
		if (root == null)
			System.out.println("Empty tree");
		else
			printTree(root);
	}

	private void printTree(BinaryNode t) {
		
		if (t != null) {
			
			printTree(t.left);
			System.out.println(t.element);
			printTree(t.right);
			
		} // IN ORDER Traversal
		
	}
	
	/**
	 * Prints the values in the nodes of the tree in pre order.
	 */
	public void printPreOrderTree() {
		
		if (root == null)
			System.out.println("Empty tree");
		else
			printPreOrderTree(root);
	}

	private void printPreOrderTree(BinaryNode t) {
		
		if (t != null) {
			
			System.out.println(t.element);
			printTree(t.left);
			printTree(t.right);
			
		} // PRE ORDER Traversal
		
	}
	
	/**
	 * Prints the values in the nodes of the tree in post order.
	 */
	public void printPostOrderTree() {
		
		if (root == null)
			System.out.println("Empty tree");
		else
			printPostOrderTree(root);
	}

	private void printPostOrderTree(BinaryNode t) {
		
		if (t != null) {
			
			printTree(t.left);
			printTree(t.right);
			System.out.println(t.element);
			
		} // POST ORDER Traversal
		
	}
	
	public int countNodes() {
		
		return countNodes(root); 
	}
	
	private int countNodes(BinaryNode t) {
		
		if(t == null) return 0;
		
		return 1+countNodes(t.left) + countNodes(t.right);
		
	}
	
	public int countLeaves() {
		
		return countLeaves(root);
	}
	
	private int countLeaves(BinaryNode t) {
		
		if(t == null) return 0;
		
		if(t.left == null && t.right == null) return 1;
		
		return countLeaves(t.left) + countLeaves(t.right);
	}
	
	public int countEvenElements() {
		
		return countEvenElements(root);
	}
	
	public int findMin() {
		
		return findMin(root);
	}
	
	private int findMin(BinaryNode node) {
		
		if(node == null) return 0;
		
		if(node.left == null) return node.element;
		
		return findMin(node.left);
		
	}
	
	public int findMax() {
		
		if(root == null) return 0;
		
		return findMax(root);
	}
	
	private int findMax(BinaryNode t) {
		
		if(t.right == null) return t.element;
		
		return findMax(t.right);
	}
	
	private int countEvenElements(BinaryNode node) {
		
        if (node == null) {
            return 0;
        }

        int evenCount = 0;
        
        if (node.element % 2 == 0) { // Check if current node data is even
            evenCount++;
        }

        // Recursively count even elements in left and right subtrees
        evenCount += countEvenElements(node.left);
        evenCount += countEvenElements(node.right);

        return evenCount;
    }
	
	// Assume the data in the Node is an Integer.

	public void insert(Integer x) {
		
		if (root == null) {
			root = new BinaryNode(x, null, null);
			return;
		}

		BinaryNode n = root;
		boolean inserted = false;

		while (!inserted) {
			
			if (x.compareTo(n.element) < 0) {
				// space found on the left
				if (n.left == null) {
					n.left = new BinaryNode(x, null, null);
					inserted = true;
				}
				// keep looking for a place to insert (a null)
				else {
					n = n.left;
				}
				
			} else if (x.compareTo(n.element) > 0) {
				// space found on the right
				if (n.right == null) {
					n.right = new BinaryNode(x, null, null);
					inserted = true;
				}
				// keep looking for a place to insert (a null)
				else {
					n = n.right;
				}
			}
		}

	}

	private class BinaryNode {
		

		private Integer element;// The data in the node
		private BinaryNode left; // Left child
		private BinaryNode right; // Right child

		// Constructors
		BinaryNode(Integer theElement) {
			this(theElement, null, null);
		}

		BinaryNode(Integer element, BinaryNode left, BinaryNode right) {
			this.element = element;
			this.left = left;
			this.right = right;
		}

	}
}
