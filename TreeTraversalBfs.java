import java.io.*;
import java.util.*;
class Node{
	int value;
	Node left, right;
	Node(int val){
		value=val;
		left=right=null;
	}
}
class TreeTraversalBfs{
	Node root;
	void Bfs(){
		Queue<Node> queue=new LinkedList<Node>();
		while (!queue.isEmpty()) {
			Node node=queue.poll();
			System.out.print(node.value+" ");
			if (node.left!=null) {
				queue.add(node.left);
			}
			if (node.right!=null) {
				queue.add(node.right);
			}
		}
	}
	public static void main(String[] args) {
		TreeTraversalBfs tree=new TreeTraversalBfs();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		System.out.println("BFS traversal of tree:");
		tree.Bfs();
	}
}