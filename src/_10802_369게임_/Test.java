package _10802_369게임_;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		int start = scan.nextInt();
		int end = scan.nextInt();
		
		int count = 0;
		
		for (int i = start; i <= end; i++) {
			String decimalStr = String.valueOf(i);
			for (int j = 0; j < decimalStr.length(); j++) {
				if (decimalStr.charAt(j) == '3' || decimalStr.charAt(j) == '6' || decimalStr.charAt(j) == '9') {
					count++;
					break;
				} else {
					if ((Integer.parseInt(decimalStr) % 3) == 0) {
						count++;
						break;
					}
				}
			}
		}
		System.out.println(count);
	}

}
