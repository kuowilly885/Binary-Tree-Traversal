package william.traverse;

public class BinaryTree
{
	Node root;

	public void addNode(int key)
	{
		Node newNode = new Node(key);
		if (root == null)
			root = newNode;
		else
		{
			Node focusNode = root;
			Node parent;
			while (true)
			{
				parent = focusNode;
				if (key < focusNode.value)
				{
					focusNode = focusNode.leftChild;
					if (focusNode == null)
					{
						parent.leftChild = newNode;
						return;
					}
				}
				else
				{
					focusNode = focusNode.rightChild;
					if (focusNode == null)
					{
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}

	// preorder visiting method
	public void preorderTraverseTree(Node presentNode)
	{
		Node temp = presentNode;
		if (presentNode == null)
			return;
		Stack S = new Stack();
		S.push(presentNode);
		while (!S.isEmpty())
		{
			temp = S.pop();
			System.out.print(temp.toString());
			if (temp.rightChild != null)
				S.push(temp.rightChild);
			if (temp.leftChild != null)
				S.push(temp.leftChild);
			if (!S.isEmpty())
				System.out.print("->");
		}

	}

	// inorder visiting method
	public void inOrderTraverseTree(Node presentNode) {
		if (presentNode == null)
			return;
		Stack S = new Stack();
		Node temp = presentNode;
		while (!S.isEmpty() || temp != null)
		{
			if (temp != null)
			{
				S.push(temp);
				temp = temp.leftChild;
			}

			else
			{
				temp = S.pop();
				System.out.print(temp.toString());
				temp = temp.rightChild;
				if(!S.isEmpty() || temp != null)
					System.out.print("->");
			}
		}
	}
}
