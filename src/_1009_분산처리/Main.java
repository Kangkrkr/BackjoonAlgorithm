package _1009_분산처리;

import java.util.Scanner;

//(2^453) % 10 = 2 가 출력되야함.

//2 4 8 16 32 64 128 256 ...
// 나머지 : 2 4 8 6 반복 .. 2 4 8 6 2 4 8 6 2 4
// 3 9 27 81 243 729 2187 6561
// 나머지 : 3 9 7 1 3 9 7 1 반복 .. 3 9 7 1 3 9 7 1 3 9
// 6 36 216 1296 7776 46656 ...
// 나머지 : 6 6 6 6 6 6 6 6 반복 ... 6 6 6 6 6 6 6 6 6 6
// 7 49 343 2401
// 나머지 : 7 9 3 1 반복 .. 7 9 3 1 7 9 3 1 7 9
// 9 81 729 6561 59049 531441 ...
// 나머지 9 1 9 1 9 1 9 1 ... 반복 ... 9 1 9 1 9 1 9 1 9 1

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int testCase = scan.nextInt();
		
		int resultList[] = new int[testCase];			// 테스트케이스 수 만큼 결과를 출력하기 위한 배열.
		int remainderList[] = new int[4];				// 나머지(remainder)는 4회씩 반복이 된다. 나머지를 저장하기 위한 배열.
		
		for(int i=0; i<testCase; i++){
			int a = Math.abs(scan.nextInt());
			int b = Math.abs(scan.nextInt());
			
			// b % remainderList.length 는 0 ~ 3 까지만 나오게 됨.
			// 여기서 -1 을 해주면 , -1 ~ 2 까지가 나오게 된다. (-1, 0, 1, 2)
			int index = (b % remainderList.length) - 1;
			
			// index 가 -1 이라면, 나머지배열의 끝으로 설정하고, 아니라면 그냥 index 값으로 설정해준다.
			b = (index < 0) ? (remainderList.length - 1) : index;
			
			// 나머지는 4회마다 반복이 되므로 루프도 4번만 돌린다.
			for(int j=1; j<=4; j++){
				// 값 a의 1 부터 4승 까지의 값을 10 으로 나눈 나머지.
				int powValue = ((int)Math.pow(a, j)) % 10;
				
				// powValue 가 0이라면 (int)Math.pow(a, j)는 10을 의미하므로 10번째 컴퓨터가 처리하는 것으로 설정하고,
				// 그 이외, 즉 11이라면 1번째, 12라면 2번째 컴퓨터가 처리하게 하는것으로 설정한다.
				// 해당 값에 % 10 을 취하면 10 이라는 값을 얻을 수 없기 때문에 이와 같이 설정한 것이다.
				remainderList[j-1] = (powValue == 0) ? 10 : powValue;
			}
			
			// 얻어 온 인덱스인 b 를 통해 나머지배열에서 값을 추출한다.
			resultList[i] = remainderList[b];
		}
		
		for(int c : resultList){
			System.out.println(c);
		}
	}
}
