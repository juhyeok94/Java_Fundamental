package java_20200521;

public class MathDemo {
	public static void main(String[] args) {
		double d1 = Math.ceil(4.2);
		System.out.println(d1);
	
		d1 = Math.floor(4.9);
		System.out.println(d1);
		
		long l1 = Math.round(42.5);
		System.out.println(l1);
		
		d1 = 45.71;
		//소수점 2자리에서 반올림하기
		d1 = d1*10;
		l1 = Math.round(d1);
		d1 = (double)l1/10;
		System.out.println(d1);
		//45.7
		
		int a1 = Math.abs(-123);
		System.out.println(a1);
		
		d1 = Math.sqrt(3);
		System.out.println(d1);
		
		//소수점없이 정수로만 표시하고 싶으면 Math 앞에 (int)
		a1 = (int)Math.pow(2, 3);
		System.out.println(a1);
		
		a1 =(int)(Math.random()*45);
		System.out.println(a1);
		
	}
}
