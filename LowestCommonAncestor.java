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
class LowestCommonAncestor {
	Node root;
	private List<Integer> path1=new ArrayList<>();
	private List<Integer> path2=new ArrayList<>();
	int findLca(int n1, int n2){
		path1.clear();
		path2.clear();
		return findLcaUtil(root, n1, n2);
	}
	private int findLcaUtil(Node root, int n1, int n2){
		if (!findPath(root, n1, path1)||!findPath(root, n2, path2)) {
			System.out.println((path1.size()>0)? n1+" is present": n1+" is not present");
			System.out.println((path2.size()>0)? n2+" is present": n2+" is not present");
			return -1;
			int i;
			for (i=0;i<path1.size()&& path2.size();i++ ) {
				if (!path1.get(i).equals(path2.get(i)))
					break;
			}
			return path1.get(i-1);
		}
		private boolean findPath(Node root, int n, List<Integer> path){
			if (root==null)
				return false;
			path.add(root.value);
			if(root.value==n)
				return true;
			if (root.left!=null && findPath(root.left, n, path))
				return true;
			if (root.right!=null && findPath(root.right, n, path))
				return true;
			path.remove(path.size()-1);
			return false;
		}
		public static void main(String[] args) {
			LowestCommonAncestor lca=new LowestCommonAncestor();
			lca.root=new Node(1);
			lca.root.left=new Node(2);
			lca.root.right=new Node(3);
			// Add other tree nodes.
			System.out.println(lca.findLca(2,3));
		}
	}
}