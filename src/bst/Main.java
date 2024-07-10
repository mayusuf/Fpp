package bst;

public class Main {

	public static void main(String[] args) {
		
		MyBST obj = new MyBST();
		
		// 1
		obj.insert(90);
		obj.insert(80);
		obj.insert(100);
		obj.insert(65);
		obj.insert(95);
		obj.insert(102);
		obj.insert(10);
		obj.insert(15);
		obj.insert(9);
		
		// 2
		System.out.println("InOrder");
		obj.printTree();
		
		System.out.println("-----------");
		
		// 3
		System.out.println("Pre Order");
		obj.printPreOrderTree();
		
		System.out.println("-----------"); 
		
		System.out.println("Post Order");
		
		obj.printPostOrderTree();
		
		System.out.println("-----------"); 
		System.out.println("Count Nodes");
		
		System.out.println(obj.countNodes());
		
		System.out.println("-----------"); 
		System.out.println("Count Leaves");
		
		System.out.println(obj.countLeaves());
		
		System.out.println("-----------"); 
		System.out.println("Count Even Element");
		
		System.out.println(obj.countEvenElements());
		
		System.out.println("-----------"); 
		System.out.println("Minimum Element");
		
		System.out.println(obj.findMin());
		
		System.out.println("-----------"); 
		System.out.println("Maximum Element");
		
		System.out.println(obj.findMax());
	}

}
