package Test2;

import java.util.Scanner;

public class add2 {
	static int sumOf(int a, int b) {
		int min;
		int max;
		
		if(a<b) {
			min = a;
			max = b;
			
		}else {
			min = b;
			max = a;
			
		}
		
		
		int sum = 0;
		for(int i = min;i<=max;i++) {
			sum += i;
		}
		return (sum);
	}
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println(sumOf(1,10));
	}
}
