package java_20200525;

public class ExceptionSampleDemo {
	public static void main(String[] args) {
		//개발자가 실수하기보다는 사용자가 잘못된 입력을 받는 경우가 많음
		
		//NullPointException 예외발생
		//String msg = null;
		//int msgLength = msg.length();
		//System.out.println(msgLength);
		
		
		//ArrayIndexOutOfBoundException 예외발생
		//int[] array = {1,2,3};
		//int temp = array[3];
		
		
		//ArithmeticException 예외발생 3/0 or 0/0
		//int result = 3/0;
		//System.out.println(result);
		
		
		//NumberFormatException 예외발생 
		int first = Integer.parseInt("a");
		System.out.println(first);
		
		
	}
}
