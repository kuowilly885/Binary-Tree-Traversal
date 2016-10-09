package william.traverse;

class Node
{
	int value;
	String name;
	Node leftChild;
	Node rightChild;
	Node link;

	Node(int value)
	{
		this.value = value;
	}

	public String toString()
	{
		return ""+value;
	}
	
	public void printTree()
	{
        if (rightChild != null)
        	rightChild.printTree(true, "");
        printNode();
        if (leftChild != null)
        	leftChild.printTree(false, "");
    }
    private void printNode()
    {
    	System.out.print(""+value);
    	System.out.print('\n');
    }

    private void printTree(boolean isRight, String indent)
    {
        if (rightChild != null)
        	rightChild.printTree(true, indent + (isRight ? "        " : " |      "));
        System.out.print(indent);
        if (isRight)
        	System.out.print(" /");
        else
        	System.out.print(" \\");
        System.out.print("----- ");
        printNode();
        if (leftChild != null)
        	leftChild.printTree(false, indent + (isRight ? " |      " : "        "));
    }
}
