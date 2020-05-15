package java_20200515;

public class CustomerStaticDemo {
	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.name = "홍길동";
		
		//static 변수는 레퍼런스보다 클래스명으로 접근하는게 좋음
		//1. 모든 객체가 공통으로 사용할 수 있는 변수
		//2. 레퍼런스(c1. c2)로 접근하지 않고 클래스 이름으로 접근한다.
		
		
		c1.interestRate = 30.45;
		
		
		Customer c2 = new Customer();
		c2.name = "아무개";
		c2.interestRate = 12.25;
		
		
		System.out.println(c1.interestRate);

		
		
	}
}
