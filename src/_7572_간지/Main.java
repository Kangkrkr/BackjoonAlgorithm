package _7572_간지;

import java.util.Scanner;

public class Main {
	private static final int 십간[] = {0,1,2,3,4,5,6,7,8,9};
	private static final String 십이지 = "ABCDEFGHIJKL";
	public static void main(String[] args) {
		int year = new Scanner(System.in).nextInt() - 4;
		System.out.println((String.valueOf(십이지.charAt(year % 십이지.length()))+십간[year % 십간.length]));
	}
}
