package java_20200515;
//Customer 클래스
public class Customer {
	
	//클래스의 멤버 변수는 1. instance 변수 2.static 변수 3. final 변수
	//인스턴스변수(name, email, phone, balance,isReased)
	//아무것도 안 붙여있으면 instance 변수
	//public (static or final) String name;
	
	//객체들마다 할당하는 변수, 객체들 공통적으로 할당하는 변수
	
	//instance 변수는 객체가 생성될때만 만들어지는 변수

	
	public String name;
	public String email;
	public String phone;
	public double balance;
	public boolean isReleased;
	public static double interestRate;
	public static final String BANKNAME = "신한은행";

	//상수는 대문자로 쓰는것이 관례
	//상수는 한번정해지면 값을 변경할 수 없다.
	//final은 상수변수 (=한번 정해지면 못 바꿈)
	//통상적으로 static final로 씀
	//만약 내가 public static double interestRate로 잡는다면 사람들의 이자비율이 모둑 같다라는 것

	
}
