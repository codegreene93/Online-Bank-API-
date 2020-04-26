import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class BinaryTree {
	public static void main(String[] args) {
		Node root = new Node(5);
		
		insertNode(root,1);
		insertNode(root,8);
		insertNode(root,-2);
		insertNode(root,6);
		insertNode(root,3);
		insertNode(root,9);
		insertNode(root,-3);
		insertNode(root,-1);
		
		
		PrintLevelWise(root);
		
		
		System.out.println("Node contains -11? " + containsNode(root,-11));
		System.out.println("Node contains 9? " + containsNode(root, 8));
		
	}
	
	public static boolean containsNode(Node node, int value) {
		if(node == null) {
			return false;
		}	
		
		if(value == node.value) {
			return true;
		}
		
		return value < node.value? containsNode(node.left, value) : containsNode(node.right, value);
		
	}
	
	
	
	
	public static void insertNode(Node node, int value) {
		if(value < node.value) {
			if(node.left != null) {
				insertNode(node.left, value);
			}else{
				node.left = new Node(value);
			}
		}else if(value > node.value) {
			if(node.right != null) {
				insertNode(node.right,value);
			}else {
				node.right = new Node(value);
			}
		}
	
	}
	
	
	 public static void PrintLevelWise(Node root) 
     {
         // TODO Auto-generated method stub
         Queue<Node> nodes= new LinkedList<>(); 

         List<Node> listOfNodes = new ArrayList<Node>();
         //add root to the list
         TraverseLevels(root, listOfNodes,nodes);
         //printing in a straight line
         //System.out.println("nodes are "+listOfNodes);
         // printing level wise
         int count = 0,level=0;

         while (count < listOfNodes.size()){
             int printLen= (int) Math.pow(2, level++);

             for (int i=count; i < printLen -1 && i < listOfNodes.size();++i){
                 System.out.print(listOfNodes.get(i).value+" ");
             }
                 System.out.println();
                 count = printLen-1;
         }
     }
     
     public static void TraverseLevels(Node root, List<Node> listOfNodes, Queue<Node> nodes) 
     {
         // TODO Auto-generated method stub
         if (root!=null){

             nodes.add(root);
             listOfNodes.add(root);
             while(!nodes.isEmpty()){

                 //standard BFS
                 root= nodes.poll();
                 if (root.left!=null) {
                     listOfNodes.add(root.left);
                     nodes.add(root.left);
                 }
                 if (root.right!=null) {
                     listOfNodes.add(root.right);
                     nodes.add(root.right);
                 }
             }

         }
    }
     
	
	
	
}
