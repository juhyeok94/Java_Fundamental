package java_20200525;

public class ThrowsDemo {
	//여기서 만약에 Exception이면 컴파일에 오류가 뜨기때문에 try catch에서 예외처리를 해야한다
	//runtime과 error는 예외처리를 해도되고 안해도 된다.
	
	public static int getDivide(int first, int second) throws ArithmeticException {
		
		int result = first / second; //예외가 발생하는 코드
		
		return result;
	}
	
	
	public static void main(String[] args) {
		try {
			int first = Integer.parseInt(args[0]);//예외가 발생하는 코드
			int second = Integer.parseInt(args[1]);//예외가 발생하는 코드
		
			int result = getDivide(first, second);
			System.out.printf("결과 : %d%n",result);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("인자를 2개 입력하셔야 합니다.");
		}catch(NumberFormatException e) {
			System.err.println("인자에는 숫자를 넣어야 합니다.");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
		}finally {
			System.out.println("finally");
		}
	
		//예외가 발생하는걸 jvm에게 넘겨버리며 제어권이 넘어가 버린다.
		// = 저 Arith지우면 망 예외처리를 넘기는거기때문에
		System.out.println("끝");
	
	
	
	
	
	}
}
