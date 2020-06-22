package Test2;

import java.util.Scanner;

public class add {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
			System.out.println("숫자를 입력하세요.");
			int n = stdIn.nextInt();
			
			int total = 1+n;
			int count = n/2;
			
			if(n%2 == 0) {
				System.out.println(total*count);
			}else {
				System.out.println((total*count)+ (n+1)/2);
			}

	}
}
