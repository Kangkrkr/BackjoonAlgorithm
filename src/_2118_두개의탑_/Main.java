package _2118_두개의탑_;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

class Node {

	private int index;
	private int leftLine;
	private int rightLine;
	private Node left;
	private Node right;

	public Node(int index){
		this.index = index;
	}
	
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getLeftLine() {
		return leftLine;
	}

	public Node setLeftLine(int leftLine) {
		this.leftLine = leftLine;
		return this;
	}

	public int getRightLine() {
		return rightLine;
	}

	public Node setRightLine(int rightLine) {
		this.rightLine = rightLine;
		return this;
	}

	public Node getLeft() {
		return left;
	}

	public Node setLeft(Node left) {
		this.left = left;
		return this;
	}

	public Node getRight() {
		return right;
	}

	public Node setRight(Node right) {
		this.right = right;
		return this;
	}

}

class Point {

	private int sumOfTwoLines;
	private int sumOfOtherLines;

	public Point(int sumOfTwoLines, int sumOfOtherLines){
		this.sumOfTwoLines = sumOfTwoLines;
		this.sumOfOtherLines = sumOfOtherLines;
	}
	
	public int getSumOfTwoLines() {
		return sumOfTwoLines;
	}

	public void setSumOfTwoLines(int sumOfTwoLines) {
		this.sumOfTwoLines = sumOfTwoLines;
	}

	public int getSumOfOtherLines() {
		return sumOfOtherLines;
	}

	public void setSumOfOtherLines(int sumOfOtherLines) {
		this.sumOfOtherLines = sumOfOtherLines;
	}

}

public class Main {

	private static int resultValue = 0;
	private static LinkedList<Node> nodeList = new LinkedList<>();
	private static ArrayList<Point> pointList = new ArrayList<>();
	
	private static int lines[][] = {
//			{5,1}, {1,2}, {2,3}, {3,4}, {4,5}
	};
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int nodeCount = scan.nextInt();
		int linesSolo[] = new int[nodeCount];
		
		for(int i=0; i<nodeCount; i++){
			linesSolo[i] = scan.nextInt();
		}
		
		for(int i=0; i<nodeCount; i++){
			// 여기서부터 작업하기
//			lines[i][0];
//			lines[i][1];
		}
		
		for(int i=1; i<=nodeCount; i++){
			nodeList.add(
					(		 
							 new Node(i)
							.setLeft(new Node((i == 1) ? 5 : i-1))
							.setRight(new Node((i == 5) ? 1 : i+1))
					)
							.setLeftLine(lines[i-1][0])
							.setRightLine(lines[i-1][1])
					);
		}
		
		for(int i=0; i<nodeCount; i++){
			Node node = nodeList.get(i);
			
			int sumOfTwoLines = (node.getLeftLine() + node.getRightLine());
			System.out.println("두 지점의 거리의 합 : "+ sumOfTwoLines);
			int endPoint = node.getLeft().getIndex();
			
			int startIndex = i + 1;
			int sumOfOtherLines = 0;
			Node startNode = nodeList.get((startIndex) % nodeList.size());
			
			while(startNode.getIndex() != endPoint){
				sumOfOtherLines += startNode.getRightLine();
				startNode = nodeList.get((++startIndex) % nodeList.size());
			}
			
			System.out.println("그외 거리의 합 : "+sumOfOtherLines);
			
			if(sumOfTwoLines < sumOfOtherLines){
				Point point = new Point(sumOfTwoLines, sumOfOtherLines);
				pointList.add(point);
			}
			
			System.out.println("------------------------------------------------------------------");
		}
		
		Point result = pointList.get(0);
		
		for(int pointListIndex=1; pointListIndex<pointList.size(); pointListIndex++){
			if(result.getSumOfTwoLines() < pointList.get(pointListIndex).getSumOfTwoLines()){
				result = pointList.get(pointListIndex);
			}
		}
		
		System.out.println("가장 큰 거리의 합은 : "+result.getSumOfTwoLines());
	}

}
