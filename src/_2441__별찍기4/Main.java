package _2441__별찍기4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		if(n >= 1 && n<= 100){
			for(int i=1; i<=n; i++){
				
				for(int k=1; k<i; k++){
					System.out.print(' ');
				}
				
				for(int j=n-i; j>=0; j--){
					System.out.print('*');
				}
				
				System.out.println();
			}
		}
		
	}

}
