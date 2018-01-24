import java.util.*;
import java.io.*;
class Node{
	int value;
	Node right,left;
	Node(int val){
		value=val;
		right=left=null;
	}
}
class HeightOfTree{
	Node root;

	int maxHeight(Node node){
		if (node==null)
			return true;
		else{
			int leftHeight=maxHeight(node.left);
			int rightHeight=maxHeight(node.right);
			if (leftHeight>rightHeight) {
				return(leftHeight+1);
			}
			else {
				return (rightHeight+1);
			}
		}
	}
	public static void main(String[] args) {
		HeightOfTree height=new HeightOfTree();
		height.root=new Node(1);
		height.root.left=new Node(2);
		height.root.right=new Node(3);
		// Add nodes as required.
		System.out.println("Height of tree:"+height.maxHeight(height.root));
	}
}