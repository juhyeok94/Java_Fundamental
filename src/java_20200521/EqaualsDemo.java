package java_20200521;

public class EqaualsDemo {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		
		System.out.println(s1==s2); //false
		
		//내용이 같으면 true가 나오게끔 오버라이딩한
		System.out.println(s1.equals(s2)); //true
		
		Customer c1 = new Customer("박주혁", "제주도");
		Customer c2 = new Customer("박주혁", "제주도");
			
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		//레퍼런스를 찍었기때문에 object클래스를 어떻게 정의했나
		System.out.println(c1);
		//오버라이딩했기때문에 abc
		System.out.println(s1);
	}
}
