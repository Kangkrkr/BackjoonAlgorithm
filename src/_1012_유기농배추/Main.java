package _1012_유기농배추;

import java.util.Scanner;

/*
 * 		다음같은 경우는 4가 나와야 한다.
 * 		{1,	0,	0,	0,	0,	0,	0,	1,	1,	1},
		{0,	0,	0,	0,	0,	0,	0,	0,	1,	0},
		{0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
		{0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
		{0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
		{1,	0,	0,	0,	0,	0,	0,	0,	0,	1}
 */

/*
 * 		{1,	1,	0,	0,	0,	0,	0,	0,	0,	0},
		{0,	1,	0,	0,	0,	0,	0,	0,	0,	0},
		{0,	0,	0,	0,	1,	0,	0,	0,	0,	0},
		{0,	0,	0,	0,	1,	0,	0,	0,	0,	0},
		{0,	0,	1,	1,	0,	0,	0,	1,	1,	1},
		{0,	0,	0,	0,	1,	0,	0,	1,	1,	1}
 */

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int testCase = scan.nextInt();
		int resultList[] = new int[testCase];
		
		// 테스트케이스 수 만큼 반복한다.
		for(int caseIndex = 0; caseIndex<testCase; caseIndex++){
			
			int worm = 0;											// 각 테스트케이스 마다 벌레의 수가 필요하다.
			
			int width = scan.nextInt();								// 행(가로)의 수.
			int height = scan.nextInt();							// 열(세로)의 수.
			int baechuCount = scan.nextInt();						// 존재하는 배추의 수.
			
			int array[][] = new int[width][height];					// 입력받은 가로, 세로크기만큼 배추밭을 만든다.
			
			for(int count = 0; count<baechuCount; count++){			// 입력받은 좌표로 배추를 심는다.
				int x = scan.nextInt();
				int y = scan.nextInt();
				
				array[x][y] = 1;
			}
			
			for(int row = 0; row<array.length; row++){
				for(int col = 0; col<array[row].length; col++){
					
					if(array[row][col] == 1){						// 현재 좌표에 배추가 심어져 있다면,
						worm++;										// 벌레수를 하나 증가시키고,
						move(array, row, col);						// 해당 좌표를 기준으로 재귀를 통하여 벌레를 이동시키고,
																	// 거쳐간 곳은 0으로 처리한다.
					}
				}
			}
			
			resultList[caseIndex] = worm;							// 현재 테스트케이스의 벌레수를 저장한다.
		}
		
		for(int w : resultList){									// 모든 테스트케이스의 벌레수 출력.
			System.out.println(w);
		}
	}
	
	
	public static void move(int array[][], int y, int x){
		
		// 재귀의 각 단계마다 해당 위치는 0 이된다.
		// 각 단계의 실행수는 4^0 -> 4^1 -> 4^2 가 될것이다.
		array[y][x] = 0;
		
		// 특정방향으로 진행하는 조건은 x(열), y(행)가 경계를 넘지 않아야한다.
		if(x < array[y].length-1 && array[y][x + 1] == 1){			// 동쪽
			move(array, y, x+1);
		}
		
		if(x > 0 && array[y][x - 1] == 1){							// 서쪽
			move(array, y, x-1);
		}
		
		if(y < array.length-1 && array[y + 1][x] == 1){				// 남쪽
			move(array, y+1, x);
		}
		
		if(y > 0 && array[y - 1][x] == 1){							// 북쪽
			move(array, y-1, x);
		}
	}
}
