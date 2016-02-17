package _1010_다리놓기;

import java.math.BigInteger;
import java.util.Scanner;

// 이 문제는 조합을 사용한다.
// 조합의 공식 : n! / ((n - m)! * m!)

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int testCase = scan.nextInt();
		BigInteger resultList[] = new BigInteger[testCase];
		
		for(int i=0; i<testCase; i++){
			
			// n이 더 큰 수여야 한다.
			int m = scan.nextInt();
			int n = scan.nextInt();
			
			resultList[i] = factorial(n).divide(factorial(n-m).multiply(factorial(m)));
		}
		
		for(BigInteger i : resultList){
			System.out.println(i);
		}
	}

	public static BigInteger factorial(int n){
		BigInteger result = new BigInteger("1");
		
		for(int i=1; i<=n; i++){
			result = result.multiply(new BigInteger(String.valueOf(i)));
		}
		
		return result;
	}
}
