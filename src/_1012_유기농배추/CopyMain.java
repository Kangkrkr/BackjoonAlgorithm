package _1012_유기농배추;

public class CopyMain {

	private static int worm = 0;
	
	public static void main(String[] args) {
		
		// 배추흰지렁이는 배추에 살며, 인접한(동서남북) 배추로 이동할수 있음.
		// 인접한 배추가 있다면 그곳으로 계속하여 이동(move) 할 수 있다. 이미 다녀온곳은 0으로 만든다.
		// 현재 이동한 곳에서 양 사방이 0이라면 종료. 구석에서 배추가 군집해있을 경우까지 고려해야한다.
		
		/*
		 * 		다음같은 경우는 현재의 방법을 쓰면 4가 나와야 하는데 5가 나온다..
		 * 		스택을 써볼까 ??
		 *		재귀를 써야될거 같은데 .. ?
		 * 		{1,	0,	0,	0,	0,	0,	0,	1,	1,	1},
				{0,	0,	0,	0,	0,	0,	0,	0,	1,	0},
				{0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
				{0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
				{0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
				{1,	0,	0,	0,	0,	0,	0,	0,	0,	1}
		 */
		
		// 사방에 0이 4개 혹은 2개((0의갯수)%2 == 0)라면 1을 반환, 사방에 0이 1개 이하라면 1반환 
		int array[][] = {
				{1,	1,	0,	0,	0,	0,	0,	0,	0,	0},
				{0,	1,	0,	0,	0,	0,	0,	0,	0,	0},
				{0,	0,	0,	0,	1,	0,	0,	0,	0,	0},
				{0,	0,	0,	0,	1,	0,	0,	0,	0,	0},
				{0,	0,	1,	1,	0,	0,	0,	1,	1,	1},
				{0,	0,	0,	0,	1,	0,	0,	1,	1,	1}
		};
		
		int mask[][] = {
				{1, 0}, // east
				{-1, 0}, // west
				{0, 1}, // south
				{0, -1} // north
		};
		
		// row는 행(Y)
		for(int row = 0; row<array.length; row++){
			// col은 열(X)
			for(int col = 0; col<array[row].length; col++){
				
				// 현재 좌표의 인덱스가 1이라면 배추가 있는 위치.
				if(array[row][col] == 1){
					worm++;
					isEnableMove(array, row, col);
				}
			}
		}
		
		/*for(int i=0; i<array.length; i++){
			for(int j=0; j<array[i].length; j++){
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}*/
		
		System.out.println(worm);
	}
	
	public static void isEnableMove(int array[][], int y, int x){
		
		array[y][x] = 0;
		
		// 동
		if(x < array[y].length-1 && array[y][x + 1] == 1){
			isEnableMove(array, y, x+1);
		}
		
		// 서
		if(x > 0 && array[y][x - 1] == 1){
			isEnableMove(array, y, x-1);
		}
		
		// 남
		if(y < array.length-1 && array[y + 1][x] == 1){
			isEnableMove(array, y+1, x);
		}
		
		// 북
		if(y > 0 && array[y - 1][x] == 1){
			isEnableMove(array, y-1, x);
		}
	}

}
