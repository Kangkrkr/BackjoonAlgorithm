package _2438_별찍기1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		if(n >= 1 && n<= 100){
			for(int i=1; i<=n; i++){
				for(int j=1; j<=i; j++){
					System.out.print('*');
				}
				System.out.println();
			}
		}
		
	}

}
