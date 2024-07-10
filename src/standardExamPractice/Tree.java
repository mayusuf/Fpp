package standardExamPractice;

public class Tree {

	public static void main(String[] args) {
		
		BinarySearchTree tree = new BinarySearchTree();
		
		tree.insertNode(100);
		tree.insertNode(80);
		tree.insertNode(105);
		tree.insertNode(65);
		tree.insertNode(95);
		tree.insertNode(101);
		tree.insertNode(150);
		tree.insertNode(120);
		tree.insertNode(170);
		
		tree.printTree(tree.root);
		
		//System.out.println("Number of nodes is : " + tree.countNodes(tree.root));
		
		tree.printPreOrderTree(tree.root);
		
		System.out.println("Number of nodes is : " + tree.countLeaves(tree.root));
		
		
	}

}
