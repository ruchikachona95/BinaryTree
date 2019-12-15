import java.util.InputMismatchException;
import java.util.Scanner;

public class BinaryTreeExample {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		Scanner scan = new Scanner(System.in);

		tree.insertInTree(7);
		tree.insertInTree(5);
		tree.insertInTree(16);
		tree.insertInTree(9);
		tree.insertInTree(27);
		tree.insertInTree(14);
		tree.insertInTree(23);

		String answer = null;

		do {
			//do while answer != 7
			System.out.println("Enter c create new tree");
			System.out.println("	  i insert into tree");
			System.out.println("	  p pre-order traversal");
			System.out.println("	  o in-order traversal");
			System.out.println("	  l post-order traversal");
			System.out.println("	  h find height of tree");
			System.out.println("	  q to quit:");
			
			try {
				answer = scan.next();

			} catch (InputMismatchException exception) {
				System.out.println("Integers only, please.");
				
				// Must use scan.next(); to clear cache to continue the code
				scan.next();

			}switch(answer) {
			
			case "c":
				System.out.println("Created a new tree, delete the old one.");
				tree = new BinaryTree();
				break;
			
			case "i":
				System.out.println("Insert into tree");
				tree.insertInTree(scan.nextInt());
				break;
			
			case "p":
				System.out.println("pre-order traversal");
				tree.displayPreOrder();
				System.out.println("\n");
				break;
			
			case "o":
				System.out.println("in-order traversal");
				tree.displayInOrder();
				System.out.println("\n");
				break;
			
			case "l":
				System.out.println("post-order traversal");
				tree.displayPostOrder();
				System.out.println("\n");
				break;
			
			case "h":
				System.out.println("height of tree");
				int maxHeight = tree.returnHeight();
				System.out.println(maxHeight);
				break;
			
			case "q":
				System.out.println("Bye");
				break;
			
			default:
				//Checks if valid input.
				System.out.println("Invalid choice ... try again");
				break;
			}		
		
		}while(!answer.equals("q"));
		
		scan.close();

	}
}
