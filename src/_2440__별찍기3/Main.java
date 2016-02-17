package _2440__별찍기3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		if(n >= 1 && n<= 100){
			for(int i=1; i<=n; i++){
				
				for(int j=n-i; j>=0; j--){
					System.out.print('*');
				}
				
				System.out.println();
			}
		}
		
	}

}
