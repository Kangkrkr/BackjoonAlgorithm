package _10799_쇠막대기;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	private static Stack<Character> s = new Stack<>();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String test = scan.nextLine();
		
		int count = 0;

		for (int i = 0; i < test.length(); i++) {
			if (test.charAt(i) == '(') {
				s.push('(');
			} else {
				if(!s.isEmpty()){
					count = (test.charAt(i-1) == '(') ? (count += (s.size() - 1)) : ++count;
					s.pop();
				}
			}
		}
		
		System.out.println(count);
	}
}