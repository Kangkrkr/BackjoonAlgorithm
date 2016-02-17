package _10801_카드게임_;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int A[] = new int[10];
		int B[] = new int[10];

		int countA = 0; int countB = 0;

		for (int i = 0; i < (A.length + B.length); i++) {
			if(i >= 10){
				B[i%10] = scan.nextInt();
				continue;
			}
			A[i] = scan.nextInt();
		}
		
		for(int i=0; i<A.length; i++){
			if (A[i] > B[i]) {
				countA++;
			} else if (A[i] < B[i]) {
				countB++;
			}
		}
		
		System.out.println(((countA > countB) ? "A" : (countA < countB) ? "B" : "D"));
	}
}
