import java.io.*;
import java.util.*;
class Node{
	int value;
	String value;
	Node right,left;
	public Node(int val){
		value=val;
		left=right=null;
	}
}
class TreeTraversal{
	static Node root;
	TreeTraversal(){
		root=null;
	}
	void postOrder(Node node){
		if (node==null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.value+" ");
	}
	void inOrder(Node node){
		if (node==null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.value+" ");
		inOrder(node.right);
	}
	void preOrder(Node node){
		if (node==null) {
			return;
		}
		System.out.print(node.value+" ");
		preOrder(node.left);
		preOrder(node.right);
	}
	public static void main(String[] args) {
		TreeTraversal tree=new TreeTraversal();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		System.out.println("PostOrder traversal of tree:");
		tree.postOrder(root);
		System.out.println("InOrder traversal of tree:");
		tree.inOrder(root);
		System.out.println("PreOrder traversal of tree:");
		tree.preOrder(root);
	}
}
/*
Carefully pass all the nodes of the tree.
*/