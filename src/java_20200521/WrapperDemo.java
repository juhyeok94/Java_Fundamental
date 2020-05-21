package java_20200521;

import java.util.ArrayList;


public class WrapperDemo {
	public static void main(String[] args) {
		int[] temp = {1,2,3,4};
		
		/*
		 자바 1.4이전 버전에서는 primitive data type을  Collection에 저장할 수 없었기때문에
		 primitive data type을 객체화 할 수 있는 wrarpper class가 필요함. 
		 아래와 같이 1을 추가할 수 없음.
		 list.add(1);
		 Collection에 1을 저장하기 위해서는 primitive data type을 객체화 할 수 있는 Integer 클래스로 변환해야함
	
		*/
		
		/*
		//primitive를 wrapper로 바꾼거
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(2);
		//Integer i1 = new Integer(1);
		int i = i1.intValue() + i2.intValue();
		//위에는 wrapper을 primitive로 바꾼거
		*/
		
		ArrayList list = new ArrayList();
		  list.add(1);
		list.add(new Integer(1));
	
		//1. primitive data type을 => wrapper class(new Integer(1))
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(20);
		
		//2. wrapper data type => primitive data type( xxxvalue() )
			//int i3 = i1 + i2가 안됨
		int i3 = i1.intValue() + i2.intValue();
		
		//3.String => primitive data type
		String s1 = "10";
		String s2 = "20";
		
			//int i4 = s1 + s2;
		int i4 = Integer.parseInt(s1) + Integer.parseInt(s2);
		
		//4. primitive data type => String
		String s3 = 10+"";
		String s4 = String.valueOf(10);
		
		//5. primitive data type을 자동으로 wrapper class로 변환하는 것을 auto boxing
		Integer i5 = 10;
		Integer i6 = 20;
		
		//wrapper class가 자동으로 primitive data type으로 변환하는 것을 auto un-boxing
		int i7 = i5 + i6;
		
		System.out.println(i7);
	
	}
}
