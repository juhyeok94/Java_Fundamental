package java_20200520;

public class SubDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super s1 = new Super();
		System.out.println(s1.age);
		s1.playBadook();
		s1.work();
		
		System.out.println("=======================");
		
		Sub s2 = new Sub();
		System.out.println(s2.height);
		s2.playGame();
		s2.work();
		
		
		s2.age = 20;
		System.out.println(s2.age);
		s2.playBadook();						
		
		System.out.println("=======================");
		
		//2020-05-20
		//Super s3 = new Sub();   
				//=> 이렇게 하는 이유와 경유 : 추상클래스는 객체 생성(New)을 못함(IF, Super가 추상)
				//=> 일반적으로 일반 클래스 일경우는 형변화를 안함
				//=> 추상클래스이거나 인터페이스일경우 객체 생성을 못하기 때문에 객체형변환 이용
		
		Super s3 = s2;
		// s3가 가르키는 객체가 s2이지만 Super클래스이기때문에 s3는 부모를 가르킴
		// s2에서 이미 만들어져있는 객체를 s3가 참조하는거
		System.out.println(s3.age);
		s3.playBadook();
		s3.work();
		
		//부모는 자식거를 가져다가 쓸수없음
		//s3.height = 20;
		//s3.playGame();		
	}

}
