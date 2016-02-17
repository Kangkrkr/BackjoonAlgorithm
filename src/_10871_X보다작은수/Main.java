package _10871_X보다작은수;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int x = scan.nextInt();
		
		int cases[] = new int[n];
		
		for(int i=0; i<cases.length; i++){
			cases[i] = scan.nextInt();
		}
		
		for(int i=0; i<cases.length; i++){
			if(cases[i] < x){
				System.out.print(cases[i]+" ");
			}
		}
		
	}

}
