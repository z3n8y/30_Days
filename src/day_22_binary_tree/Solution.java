package day_22_binary_tree;

import java.util.*;
import java.io.*;

public class Solution {
	
	public static int maxDepth(Node root) {
		//Returns the max number of nodes
		if (root == null) {
			return 0;
		} else {
			int lHeight = maxDepth(root.left);
			int rHeight = maxDepth(root.right);
			if (lHeight > rHeight) {
				return (lHeight + 1);
			} else {
				return (rHeight + 1);
			}
		}
	}
	
	public static int getHeight(Node root) {
		//Returns the max number of edges i.e. nodes - 1
		if (maxDepth(root) == 0) {
			return 0;
		} else {
			return maxDepth(root) -1;
		}
	}
	

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		int height = getHeight(root);
		System.out.println(height);
	}
}
