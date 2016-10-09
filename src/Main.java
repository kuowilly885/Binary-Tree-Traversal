package william.traverse;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		BinaryTree theTree = new BinaryTree();

		System.out.println("***Welcome to the binary search tree program***");
		System.out.println("Enter a number and then press ENTER to add an element.\n"
				+ "Input \"done\" and then press ENTER to finish building the tree.");
        while(true)
        {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.next();
            if (!str.equalsIgnoreCase("done"))
            {
            	try
            	{
                	theTree.addNode(Integer.parseInt(str));
            		System.out.println("Add " + str + " into the tree!");
            	}
            	catch (Exception e)
            	{
            		System.out.println("Please input number...");
            		continue;
            	}
            }
            else
            {
        		System.out.println("");
            	break;
            }

        }

		System.out.println("The tree you build : ");
		theTree.root.printTree();
		System.out.println("");
		System.out.println("");
		System.out.println("preorder traverse : ");
		// Preorder method
		theTree.preorderTraverseTree(theTree.root);
		System.out.println("");
		System.out.println("");
		System.out.println("inorder traverse : ");
		// Inorder method
		theTree.inOrderTraverseTree(theTree.root);
		System.out.println("");

	}
}
