package java_20200515;

public class CustomerDemo {
	public static void main(String[] args) {
		
		//클래스 객체 생성
		//Customer => 타입
		// c1 => 변수(래퍼런스)
		// new Customer() => 객체 생성
		
		Customer c1 = new Customer();
		c1.name = "박주혁";
		c1.email = "wngur3486@naver.com";
		c1.phone = "010-8727-2436";
		c1.balance = 1_000_000;
		c1.isReleased = false;
		
		System.out.println(c1.name);
		System.out.println(c1.email);
		System.out.println(c1.phone);
		System.out.println(c1.balance);
		System.out.println(c1.isReleased);
		
		
		Customer c2 = new Customer();
		c2.name = "손정의";
		c2.email = "som@softnabk.com";
		c2.phone = "010-9090-8097";
		c2.balance = 1_000_000_000;
		c2.isReleased = false;		
		
		System.out.println(c2.name);
		System.out.println(c2.email);
		System.out.println(c2.phone);
		System.out.println(c2.balance);
		System.out.println(c2.isReleased);
		
		
		Customer c3 = c2;
		
		
	}
}
