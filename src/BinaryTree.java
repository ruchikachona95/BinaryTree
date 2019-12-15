public class BinaryTree {
	
	BinaryTreeNode root = null;

	public void insertInTree (int newData) {
		//If root is null insert first value into it
		if (root == null)
			
			root = new BinaryTreeNode(newData);
		
		//else insert new data into node
		else root.insert(newData);
	}

	//call this function then pass in root to display in order
	public void displayInOrder() {
		displayInOrder(root);
	}
	
	//call function then pass in root to display in pre order
	public void displayPreOrder() {
		displayPreOrder(root);
	}
	
	public void displayPostOrder() {
		displayPostOrder(root);
	}

	public void displayInOrder(BinaryTreeNode subRoot) {
		
		//if subRoot ever equal null return
		if(subRoot == null) return;
		
		//gets all left nodes first
		displayInOrder(subRoot.getLeft());
		
		//prints left first then root
		System.out.print(" " + subRoot.getData() + " ");
		
		//calls itself and prints out all right nodes
		displayInOrder(subRoot.getRight());
	}

	public void displayPreOrder(BinaryTreeNode subRoot) {
		if(subRoot == null) return;
		displayPreOrder(subRoot.getLeft());
		displayPreOrder(subRoot.getRight());
		System.out.print(" " + subRoot.getData() + " ");

	}

	public void displayPostOrder(BinaryTreeNode subRoot) {
		if(subRoot == null) return;
		System.out.print(" " + subRoot.getData() + " ");
		displayPreOrder(subRoot.getLeft());
		displayPreOrder(subRoot.getRight());
	}

	int currentDepth, depth;
	public void getHeight() {
		getHeight(root);
	}
	public int returnHeight() {
		getHeight();
		return depth;
	}

	public void getHeight(BinaryTreeNode subRoot) {
		if(subRoot == null) return;
		else if(subRoot != null) {
			currentDepth++;
		}

		if(currentDepth > depth) {
			depth = currentDepth;
		}
		getHeight(subRoot.getLeft());
		getHeight(subRoot.getRight());

		currentDepth--;
	}

}
