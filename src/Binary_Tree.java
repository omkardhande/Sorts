import java.io.*;

class Node{
	int data;
	Node left;
	Node right;
	public Node(int val)
	{
		data = val;
		left = right = null;
	}
}

public class Binary_Tree 
{
	Node root;
	Binary_Tree()
	{
		root = null;
	}
	Binary_Tree(int val)
	{
		root = new Node(val);
	}
	
	void insert(Node node, int value)
	{
		Node current = new Node(value);

		if(current.data <= node.data )
		{
			if(node.left != null)
			{
				insert(node.left,value);
			}
			else
			{
				node.left = current;
			}
		}
		else
		{
			if(node.right != null)
			{
				insert(node.right,value);
			}
			else
			{
				node.right = current;
			}
		}
	}
	void inOrder(Node node)
	{
		if(node != null)
		{
			inOrder(node.left);
			System.out.print("->" + node.data);
			inOrder(node.right);
		}
	}
	void preOrder(Node node)
	{
		if(node != null)
		{
			System.out.print("->" + node.data);
			inOrder(node.left);
			inOrder(node.right);
		}
	}
	void postOrder(Node node)
	{
		if(node != null)
		{
			inOrder(node.left);
			inOrder(node.right);
			System.out.print("->" + node.data);
		}
	}
	
	void findNode(Node node, int key)
	{
		if(node == null)
		{
			System.out.println("Not found");
		}
		else
		{
			if(key < node.data)
				findNode(node.left,key);
			else if(key > node.data)
				findNode(node.right,key);
			else
				System.out.println("Found key "+key);
		}
	}
	
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the root node");
		int val = Integer.parseInt(in.readLine());
		
		Binary_Tree b = new Binary_Tree(val);
		
		System.out.println("Enter 5 node values");
		val = Integer.parseInt(in.readLine());
		b.insert(b.root,val);
		val = Integer.parseInt(in.readLine());
		b.insert(b.root,val);
		val = Integer.parseInt(in.readLine());
		b.insert(b.root,val);
		val = Integer.parseInt(in.readLine());
		b.insert(b.root,val);
		val = Integer.parseInt(in.readLine());
		b.insert(b.root,val);
		
		b.inOrder(b.root);
		System.out.println();
		b.preOrder(b.root);
		System.out.println();
		b.postOrder(b.root);
		System.out.println();
		
		System.out.println("Enter key to find");
		val = Integer.parseInt(in.readLine());
		b.findNode(b.root,val);
	}
}

