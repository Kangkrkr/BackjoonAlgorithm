package _1003_피보나치;

import java.util.Scanner;

public class Main {

	private static int zeroCount = 0;
	private static int oneCount = 0;
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int testCase = scan.nextInt();
		
		for(int i=0; i<testCase; i++){
			int n = scan.nextInt();
			fibo(n);
			System.out.println(zeroCount+" "+oneCount);
			zeroCount = 0;
			oneCount = 0;
		}
	}

	public static int fibo(int n){
		if(n == 0){
			zeroCount++;
			return 0;
		}else if(n == 1){
			oneCount++;
			return 1;
		}else{
			return fibo(n-1) + fibo(n-2);
		}
	}
}
