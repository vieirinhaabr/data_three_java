package tree_java;

public class Tree {
	private Node root; //root

	public Tree(){
		root = null;  }

	public void insertNode(int insertValue){
		if (root == null)
		  root = new Node(insertValue);
		else
		  root.insertNode(insertValue);
	}

	public void preorderTraversal(     ){
		preorderHelper(root);   }

	private void preorderHelper(Node node){
		if (node == null)
		  return ;

		System.out.print(node.data + " , ");
		preorderHelper(node.leftNode);
		preorderHelper(node.rightNode);
	}

	public void inorderTraversal(){
		inorderHelper(root);   }

	private void inorderHelper(Node node){
		if (node == null)
		  return ;
		inorderHelper(node.leftNode);
		System.out.print(node.data + " , ");
		inorderHelper(node.rightNode);
	}

	public void postorderTraversal(){
		postorderHelper(root);   }

	private void postorderHelper(Node node){
		if (node == null)
		  return ;
		postorderHelper(node.leftNode);
		postorderHelper(node.rightNode);
		System.out.print(node.data + " , ");
	  }

	public void folhasTraversal(){
		folhasHelper(root);   }

	private void folhasHelper(Node node){
		if (node == null)
		  return ;
		folhasHelper(node.leftNode);
		
		if (node.leftNode == null && node.rightNode == null)
			System.out.print(node.data + " , ");
		
		folhasHelper(node.rightNode);
	}
	 
	public void internTraversal(){
		internHelper(root);   }

	private void internHelper(Node node){
		if (node == null)
		  return ;
		internHelper(node.leftNode);
		
		if (node.leftNode != null || node.rightNode != null)
			System.out.print(node.data + " , ");
		
		internHelper(node.rightNode);
	}
	 
	public void degreeTraversal(){
		degreeHelper(root);   }

	private void degreeHelper(Node node){
		if (node == null)
		  return ;
		
		if(node.rightNode != null && node.leftNode != null)
			System.out.print(node.data + " é degree 2 , ");
		else if(node.rightNode != null || node.leftNode != null)
			System.out.print(node.data + " é degree 1 , ");
		else
			System.out.print(node.data + " é degree 0 , ");
		degreeHelper(node.leftNode);
		degreeHelper(node.rightNode);
	}

	public void nodedegreesTransversal() {
			nodedegrees(root);    }
	private void nodedegrees(Node node) {
			if (node == null) {
				return;        }
			nodedegrees(node.leftNode);
			int i = 0;
			if (node.rightNode != null) {
				i++;        }
			if (node.leftNode != null) {
				i++;        }
			System.out.print(node.data + " - degree " + i + " , \n");
			nodedegrees(node.rightNode);
	}  

	public void levelTransversal() {
			nodelevel(root, 1);    
	}
	private void nodelevel(Node node, int level) {
			if (node == null) {
				return;}
			System.out.print(node.data + " - level " + level + " , ");
			level++;
			nodelevel(node.leftNode, level);
			nodelevel(node.rightNode , level);
	}  

	public int sumTransversal() {
			return nodesum(root);    
	}
	private int nodesum(Node node) {
	 if (node == null) {
		return 0;}
	 else 
		return node.data + nodesum(node.leftNode) + nodesum(node.rightNode);
	}  

	public boolean searchTransversal(int tofind) {
		return nodesearch(root, tofind);    
			
	}

	boolean r = false;

	private boolean nodesearch(Node node, int tofind) {
	 if (node == null) 
		r = false;
	 else
	 if (node.data > tofind)
		r = nodesearch(node.leftNode, tofind);
	 else if (node.data < tofind)
		   r =  nodesearch(node.rightNode, tofind);
		  else
			r = true;
	 r = false
	 return r;
	}
}
