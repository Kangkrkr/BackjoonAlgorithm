package _2739_구구단;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		if(n >= 1 && n <= 9){
			for(int i=1; i<=9; i++){
				System.out.println(n+" * "+i+" = "+(n*i));
			}
		}
		
	}

}
