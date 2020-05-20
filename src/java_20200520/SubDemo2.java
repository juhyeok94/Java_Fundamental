package java_20200520;

public class SubDemo2 {
	public static void change(Super sup) {//== Super sup = s1;
		sup.age = 20;
		sup.playBadook();
		sup.work();//오버라이딩 되어있기때문에 부모의 work가 아닌 자식의 work 출력
	}
	public static void main(String[] args) {
		Sub s1 = new Sub();
		System.out.println(s1.age);
		
		change(s1);
		
		System.out.println(s1.age);
		
		
	}
}
