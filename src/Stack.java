package william.traverse;

public class Stack {
	Node front;
	
	void push(Node newNode)
	{
		if(front == null)
		{
			front = newNode;
			return;
		}
		newNode.link = front;
		front = newNode;
	}
	
	Node pop()
	{
		Node temp = front;
		front = temp.link;
		return temp;
	}
	
	boolean isEmpty()
	{
		return front == null ? true :false;
	}
	
}
