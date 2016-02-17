package _10802_369게임_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MyThread extends Thread {

	private int start;
	private int end;
	
	private int count;
	
	public MyThread(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() {
		
		String decimalStr = null;
		
		for(int i=start; i<=end; i++){
			decimalStr = String.valueOf(i);
			
			for(int j=0; j<decimalStr.length(); j++){
				if(is369(decimalStr, i, j)){
					count++;
					break;
				}
			}
		}
		
	}

	private boolean is369(String decimalStr, int origin, int index) {
		return  (
					origin % 3 == 0					||
					decimalStr.charAt(index) == '3' ||
					decimalStr.charAt(index) == '6' ||
					decimalStr.charAt(index) == '9'
				);
	}
	
	public int getCount(){
		return count;
	}
	
}

public class _Using_Thread_ {

	private static int tempStart = 0;
	private static int tempEnd = 0;
	private static int sum = 0;
	
	private static List<MyThread> lists = new ArrayList<>();
	
	private static final int THREAD_COUNT = Runtime.getRuntime().availableProcessors() * 8;
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int start = scan.nextInt();
		int end = scan.nextInt();
		
		int div = (end - start) / THREAD_COUNT;

		tempStart = start;
		tempEnd = tempStart + div;
		
		for(int i=1; i<=THREAD_COUNT; i++){
			
			if(tempStart > end) break;
			
			lists.add(new MyThread(tempStart, tempEnd));
			
			tempStart = tempEnd + 1;
			tempEnd = (tempStart + div) >= end ? end : (tempStart + div);
		}
		
		for(MyThread t : lists){
			t.start();
		}
		
		for(MyThread t : lists){
			try {
				t.join();
				sum += t.getCount();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println((sum % 20150523));
	}
	
}
