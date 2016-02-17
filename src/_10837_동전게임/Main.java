package _10837_동전게임;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int k = scan.nextInt();
		int testcase = scan.nextInt();
		
		List<Integer> resultList = new ArrayList<>();
		
		for(int i=0; i<testcase; i++){
			int m = scan.nextInt();
			int n = scan.nextInt();
			resultList.add(identifier(m, n, k));
		}
		
		for(int i : resultList){
			System.out.println(i);
		}
	}

	public static int identifier(int m, int n, int k){
		int tempM = m;
		int tempN = n;
		
		if(tempM > tempN){ tempM++; tempN++; }
		
		int bigger = (m > n) ? m : n;
		int smallerInTemp = (tempM < tempN) ? tempM : tempN;
		
		if((((k+1) - bigger) + (smallerInTemp)) < bigger){
			return 0;
		}else{
			return 1;
		}
	}
}
