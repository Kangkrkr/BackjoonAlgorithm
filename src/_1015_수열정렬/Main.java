package _1015_수열정렬;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int A[] = new int[n];
		int B[] = new int[n];
		boolean checkedB[] = new boolean[n];
		int P[] = new int[n];
		
		for(int i=0; i<n; i++)
			A[i] = scan.nextInt();

		System.arraycopy(A, 0, B, 0, n);
		Arrays.sort(B);
		
		for(int i=0; i<n; i++){
			
			for(int j=0; j<n; j++){
				
				if(A[i] == B[j]){
					
					if(!checkedB[j]){
						P[i] = j;
						checkedB[j] = true;
						break;
					}else{
						continue;
					}
				}
			}
		}
		
		for(int i=0; i<n; i++){
			String result = (i == n-1) ? P[i]+"" : P[i]+" ";
			System.out.print(result);
		}
	}
}
