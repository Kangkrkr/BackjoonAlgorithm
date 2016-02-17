package _10158_개미_;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int w = scan.nextInt();
		int h = scan.nextInt();
		
		// 처음 입력받은 지점에서 각각 +1을 한다. 이것이 처음 1시간동안 이동한 좌표이다.
		int p = scan.nextInt() + 1;
		int q = scan.nextInt() + 1;
		
		// 이미 한시간을 이동했으므로 count - 1
		int t = scan.nextInt() - 1;
		
		boolean horizontalBound = false;	// 좌, 우 경계
		boolean verticalBound = false;		// 상, 하 경계
		
		// 처음 한시간을 제외한 나머지 시간동안 이동하게 된다.
		for(int i=1; i<=t; i++){
			// p가 수평경계에 닿을때마다 horizontalBound를 스위칭 시킨다.
			horizontalBound = (p >= w) ? !horizontalBound : (p <= 0) ? !horizontalBound : horizontalBound;
			// q가 수직경계에 닿을때마다 verticalBound를 스위칭 시킨다.
			verticalBound = (q >= h) ? !verticalBound : (q <= 0) ? !verticalBound : verticalBound;
			
			// 스위칭 결과에 따라 p와 q가 증감하게 된다.
			// 처음 오른쪽벽에 닿아 p가 감소상태였다가, 왼쪽 벽에 닿게되면 다시 증가상태가 되는 것이다.
			// 위쪽과 아랫쪽 벽에 닿을 떄도 마찬가지로 적용된다.
			p = (!horizontalBound) ? ++p : --p;
			q = (!verticalBound) ? ++q : --q;
		}
		System.out.println(p+" "+q);
	}
}
