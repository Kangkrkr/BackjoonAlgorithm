package _10817_세_수;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int cases[] = new int[3];
		
		for(int i=0; i<cases.length; i++){
			cases[i] = scan.nextInt();
		}
		
		for(int i=0; i<cases.length-1; i++){
			
			for(int j=i+1; j<cases.length; j++){
				if(cases[i] < cases[j]){
					int temp = cases[i];
					cases[i] = cases[j];
					cases[j] = temp;
				}
			}
		}
		
		System.out.println(cases[1]);
	}

}
