
public class Problem3 {

	public static void main(String[] args) {
		Node root = new Node(5);

		root.left = new Node(7);
		root.right = new Node(5);
		root.left.left = new Node(2);
		root.left.right = new Node(6);
		root.right.right = new Node(9);
		root.left.right.left = new Node(5);
		root.left.right.right = new Node(11);
		root.right.right.left = new Node(4);

		System.out.println("Sum of Leaf Nodes: " + SumOfLeafNodes(root));

	}

	/*Method which performs recursive call on both left and right subtrees of the node*/
	public static int SumOfLeafNodes(Node node) {
		if (node == null) {
			return 0;
		}

		if (node.left == null && node.right == null) {
			return node.value;
		}

		return SumOfLeafNodes(node.left) + SumOfLeafNodes(node.right);

	}

}

class Node {
	int value;
	Node left;
	Node right;
	
	public Node(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
	

}
