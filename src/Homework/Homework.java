package Homework;

public class Homework {
	public static void main(String[] args) {
		// 소수는  1보다 큰 자연수 중 1과 그 수 자신만을 약수로 갖는 자연수
		String rest = null;
		
		for (int i = 2; i <= 100; i++) {
			for (int j = 0; j <= 10; j++) {
				if(i % j == 1) {
					rest = "소수";
				}
			}
			
		}
	System.out.println(rest +"는" + "i" +"입니다");
		
	}
}
