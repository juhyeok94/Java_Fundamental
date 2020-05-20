package java_20200518;

public class MethodOverloadingDemo {
	//MethodOverloadingDemo 클래스에서는 print 매서드를 4가지로 오버로딩
	//오버로딩 작성규칙
	//1. 같은 클래스 내에서
	//2. 매서드 이름은 같아야 한다. (같아도 상광없다 (중첩이 됬을때 구분하기 위해서 매개변수가 달라야한다=자료형이 달라야한다)
	//3. 매개변수 갯수가 같으면 자효형이 달라야 한다.
	//4. 매개변수 갯수가 달라야 한다.
	//5. 반환형과 접근 한정자는 같아도 되고 달라도 된다.
	//매서드의 이름은 동사만, 목적어는 매개변수를 본다.
	
	public void print(String str) {
		System.out.print(str);
	}
	
	public void print(int i) {
		System.out.print(i);
	}
	
	public void print(double d) {
		System.out.print(d);
	}
	
	public void print(boolean b) {
		System.out.print(b);
		
	}
	//내가 배열을 1개든 2개든 3개든 자유롭게 출력하겠다
	//매개변수를 좀더 다양하게 처리하기 위한 방법
	//매개변수를 오버로딩한것처럼 처리 가능
	public void test(int... a) {
		for(int temp : a) {
			System.out.println(temp);
		}
	}
	
	public static void main(String[] args) {
		MethodOverloadingDemo m = new MethodOverloadingDemo();
		
		m.print("Hello");
		m.print(100);
		m.print(10.34);
		m.print(true);
		m.test(1);
		m.test(1,2);
		m.test(1,2,3);
		
		
	}
	
}
