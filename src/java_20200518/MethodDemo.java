package java_20200518;

public class MethodDemo {
	//9-16라인까지 메서드를 정의
	//boolean 은 메서드의 반환값
	//자료형 앞에 아무것도 없기 때문에 instant 메서드
	//int(year) => 매개변수(parameter)
	
	public boolean isLeafYear(int year) {
		//메서드의 반환값이 boolean이기 때문에 return value의 value도 boolean이어야 한다.
		boolean isLeaf = 
				year%4 == 0 && 
				year%100 != 0 || 
				year%400 ==0;
		return isLeaf;

	
	}
	public long plus (int first, int second) {
		return (long)first+ (long)second;
	}
	
	public double divide (int first, int second) {
		return (double)first / (double)second;
	}
	
	public void println(String message) {
		System.out.println(message);
	}
	
	//로또어레이에서 오름차순 코드를 가져와서 메소드화한거
	public int[] ascending(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1 ; j++) {
				// 내림차순으로 할거면 부등호 방향만 반대로.
				if(array[j] > array[j+1]) {
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
		return array; //반환값이 array이니 위에도 int[]어야함
	}
	
	public static void main(String[] args) {
		MethodDemo m = new MethodDemo();
		boolean test = m.isLeafYear(2003); //아규먼드(Argument)
		
		if(test) {
			m.println("운년입니다.");	
		} else {
			m.println("운년이 아닙니다.");
		}
		
	long result = m.plus(1000000, 12312331);
	System.out.println(result);
	
	double result2 = m.divide(12, 5);
	System.out.println(result2);
	
	int[] temp = {1, 34, 9, 2, 40, 5, 45};
	
	for(int value : temp) {
		System.out.print(value + "\t");
	}
	int[] result3 = m.ascending(temp);
	
	for(int value : result3) {
		System.out.print(value + "\t");
		
	}
	}
	
}
