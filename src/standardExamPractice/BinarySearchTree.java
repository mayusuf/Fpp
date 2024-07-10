package standardExamPractice;

public class BinarySearchTree {
	
	public Node root;
	
	BinarySearchTree(){
		
		root = null;
	}
	
	public void printTree() {
		
		if(root == null) {
			System.out.println("Tree is Empty !!");
		}else {
			
			printTree(root);
		}
	}
	
	public void printTree(Node t) {
		
		if(t != null) {
			
			printTree(t.left);
			System.out.println(t.data);
			printTree(t.right);
		}
		
	}
	
	public void printPreOrderTree(Node t) {
		
		if(t != null) {
			
			System.out.println(t.data);
			printTree(t.left);
			printTree(t.right);
		}
		
	}
	
	public void printPostOrderTree(Node t) {
		
		if(t != null) {
			
			printTree(t.left);
			printTree(t.right);
			System.out.println(t.data);
		}
		
	}

	public int countNodes(Node t) {
		
		if(t == null) return 0;
		
		return 1+ countNodes(t.left) + countNodes(t.right); 
	}
	
	public int countLeaves(Node t) {
		
		if(t == null) {
			
			return 0;
		}
		
		if(t.left == null && t.right == null) {
			return 1;
		}
		
		return countLeaves(t.left) + countLeaves(t.right);
	}

	public void insertNode(Integer d) {
		
		if(root == null) {
			root = new Node(d);
			return;
		}
		
		Node x = root;
		boolean inserted = false;
		
		while(!inserted) {
			
			if(d.compareTo(x.data) < 0) {
				
				if(x.left == null) {
					
					Node l = new Node(d);
					x.left = l;
					inserted = true;
					
				}else {
					
					x = x.left;
				}
				
				
			}else {
				
				if(x.right == null) {
					
					Node r = new Node(d);
					x.right = r;
					inserted = true;
					
				}else {
					
					x = x.right;
					
				}
			}
		}
		
	}
	
	public class Node{
		
		private Integer data;
		private Node left;
		private Node right;
		
		Node(Integer x){
			this(x, null, null);
		}
		
		Node(Integer x, Node left, Node right){
			
			this.data = x;
			this.left = left;
			this.right = right;
		}	
		
	}
}
