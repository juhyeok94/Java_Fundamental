package Homework;

public class Homework {
	public static void main(String[] args) {
		// 소수는  1보다 큰 자연수 중 1과 그 수 자신만을 약수로 갖는 자연수
		
		

		for (int i = 2; i <= 100; i++) {
			int rest = 0;
			for (int j = 1; j <=i; j++) {
				if(i % j == 0) {
					rest ++;}
				}
			
		if(rest == 1) {
			System.out.println(i+"는 소수가 아닙니다.");
		} else if(rest == 3)
			System.out.println(i+"는 소수가 아닙니다.");
		else if(rest == 4)
			System.out.println(i+"는 소수가 아닙니다.");
		else if(rest == 5)
			System.out.println(i+"는 소수가 아닙니다.");
		else if(rest == 6)
			System.out.println(i+"는 소수가 아닙니다.");
		else if(rest == 7)
			System.out.println(i+"는 소수가 아닙니다.");
		else if(rest == 8)
			System.out.println(i+"는 소수가 아닙니다.");
		else if(rest == 9)
			System.out.println(i+"는 소수가 아닙니다.");
		else if(rest==2) 
		System.out.println(i+"는 소수 입니다.");}
		
		}
		
	
}
