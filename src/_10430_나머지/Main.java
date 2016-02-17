package _10430_나머지;

//(A+B)%C는 (A%C + B%C)%C 와 같을까?
//(A×B)%C는 (A%C × B%C)%C 와 같을까?
//세 수 A, B, C가 주어졌을 때, 위의 네가지 값을 구하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(c > 0){
			int resultA = (a+b)%c;
			int resultB = (a%c + b%c)%c;
			int resultC = (a*b)%c;
			int resultD = (a%c * b%c)%c;
			
			System.out.println(resultA);
			System.out.println(resultB);
			System.out.println(resultC);
			System.out.println(resultD);
		}
		
	}

}
