package _1008_AdivB_;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
         
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a > 0){
        	if( b > 0 && b < 10 ){
        		double result = (double)a/b;
                
                System.out.println(String.format("%.9f", result));
        	}
        }
    }
}
    