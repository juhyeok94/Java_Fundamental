package java_20200525;

public class TryCatchDemo {
	
	public static double getAvg(int first, int second) {
		int sum = first + second;
		double avg = (double) sum / 2;
		return avg;
		
	}
	
	public static void main(String[] args) {
		try {
			
		int korean = Integer.parseInt(args[0]);
		int english = Integer.parseInt(args[1]);
		
		
		double average = getAvg(korean, english);
		System.out.printf("평균 : %f", average);
		//catch 블럭이 여러 있을 경우 위에서 부터 하위 클래스 => 상위 클래스 순으로 정한다.
		//이걸 어길경우 에러가 난다
		
	}catch (ArrayIndexOutOfBoundsException e) {
		//System.out.println("예외 메세지 : "+e.getMessage());	
		//System.err.println("2개 너!");
		e.printStackTrace();
		
		/*
		 * 일반 출력 : System.out.print
		 * 에러 출력: System.err.print	
		 */
	}catch(NumberFormatException e) {
		//System.out.println("예외 메세지 : "+ e.getMessage());
		System.err.println("문자말고 숫자 너!");
		
		//finally는 에러 발생 상관없이 출력
	}finally {
		System.out.println("finally");
	}
		
		
		
		
	}
}
