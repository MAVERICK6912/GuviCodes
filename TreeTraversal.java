import java.io.*;
import java.util.*;
class Node{
	int value;
	Node right,left;
	public Node(int val){
		value=val;
		left=right=null;
	}
}
class TreeTraversal{
	Node root;
	TreeTraversal(){
		root=null;
	}
	void PostOrder(Node node){
		if (node==null) {
			return;
		}
		PostOrder(node.left);
		PostOrder(node.right);
		System.out.print(node.value+" ");
	}
	void InOrder(Node node){
		if (node==null) {
			return;
		}
		InOrder(node.left);
		System.out.print(node.value+" ");
		InOrder(node.right);
	}
	void PreOrder(Node node){
		if (node==null) {
			return;
		}
		System.out.print(node.value+" ");
		PreOrder(node.left);
		PreOrder(node.right);
	}
	public static void main(String[] args) {
		TreeTraversal tree=new TreeTraversal();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		System.out.println("PostOrder traversal of tree:");
		tree.PostOrder(root);
		System.out.println("InOrder traversal of tree:");
		tree.InOrder(root);
		System.out.println("PreOrder traversal of tree:");
		tree.PreOrder(root);
	}
}