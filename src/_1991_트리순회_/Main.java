package _1991_트리순회_;

import java.util.Scanner;

class Node {
	
	private String data;
	private Node left;
	private Node right;

	public Node(String data) {
		this.data = data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public String getData() {
		return data;
	}

	public Node getLeft() {
		return left;
	}

	public Node getRight() {
		return right;
	}

	public void findAndInsertNode(Node root, String data, String leftData, String rightData) {

		if (root == null) {
			return;
		}

		if (root.getData().equals(data)) {

			Node leftNode = (!leftData.equals(".")) ? new Node(leftData) : null;
			root.left = leftNode;

			Node rightNode = (!rightData.equals(".")) ? new Node(rightData) : null;
			root.right = rightNode;
		}

		findAndInsertNode(root.getLeft(), data, leftData, rightData);
		findAndInsertNode(root.getRight(), data, leftData, rightData);
	}

	public void printToPreorder(Node root) {

		if (root == null) {
			return;
		}

		System.out.print(root.getData());
		printToPreorder(root.getLeft());
		printToPreorder(root.getRight());
	}
	
	public void printToInorder(Node root) {

		if (root == null) {
			return;
		}

		printToInorder(root.getLeft());
		System.out.print(root.getData());
		printToInorder(root.getRight());
	}
	
	public void printToPostorder(Node root) {

		if (root == null) {
			return;
		}

		printToPostorder(root.getLeft());
		printToPostorder(root.getRight());
		System.out.print(root.getData());
	}
}

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int treeLevel = scan.nextInt();
		
		Node root = new Node("A");
		
		for(int i=1; i<=treeLevel; i++){
			root.findAndInsertNode(root, scan.next(), scan.next(), scan.next());
		}
		
		root.printToPreorder(root);
		System.out.println();
		root.printToInorder(root);
		System.out.println();
		root.printToPostorder(root);
	}

}
