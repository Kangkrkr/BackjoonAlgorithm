package _10869_사칙연산;

import java.util.Scanner;

// 사칙연산. b는 0보다 커야한다

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(a >= 1 && (b > 0 && b <= 10000)){
			
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			System.out.println(a/b);
			System.out.println(a%b);
		}
		
	}

}
