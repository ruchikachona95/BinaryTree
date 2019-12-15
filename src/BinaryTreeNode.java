public class BinaryTreeNode {
	private int data;
	private BinaryTreeNode left;
	private BinaryTreeNode right;

	//	Creates blank constructor
	public BinaryTreeNode() {
		left = null; 
		right = null; 
		data = 0;
	}
	//	When you have a node to insert use this constructor
	public BinaryTreeNode(int data) {
		left = null; 
		right = null; 
		this.data = data;
	}

	public int getData() { //returns the data
		return data; 
	}
	public BinaryTreeNode getLeft() { //gets left node
		return left; 
	}
	public BinaryTreeNode getRight() { //gets right node
		return right; 
	}

	public void insert(int newData) {
		if(newData < data) {//Checks if new data is greater than current data
			
			if (left == null)//if left is null insert into left
				
				left = new BinaryTreeNode(newData);
			
			else left.insert(newData);//else call itself with data
		
		}else if (newData > data) {//if new data is greater than current
			
			if(right ==null) {//if null place in right
				
				right = new BinaryTreeNode(newData);
			
			}else right.insert(newData);//if not  call insert with newData 
		
		}else 
			
			System.out.println("Duplicate data, not adding"+ newData);
	}
}