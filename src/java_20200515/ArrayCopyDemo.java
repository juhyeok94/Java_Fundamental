package java_20200515;

public class ArrayCopyDemo {
	public static void main(String[] args) {
		//매일 int해서 새롭게 String 아직 안배움
		String[] fruits = {"apple","banana","watermelon","blueberry"};
		
		
		String[] temp = new String[6];
		//fruit => 원본배열
		// 0 => 원본배열의 위치 (원본 배열엣 어디서부터 복사를 할건지)
		// temp => 복사할 배열
		// 2 => 복사할 배열의 위치 (원본 배열에서 복사를 시작할 위치)
		// 4 => 원본배열의 4개요소를 복사
		System.arraycopy(fruits, 0, temp, 2, 4);

		temp[0] = "peach";
		temp[1] = "pear";
		
		//System.out.println(temo[0].length());
		// 배열의 문자 길이
		
		
		//배열과 인덱스에 있는거 모두 출력하고 싶을때
		for (int i =0; i<temp.length;i++) {
			System.out.println(temp[i]);
		}
		
		
		//인덱스는 상관없이 배열만 출력하고 싶을때
		for (String value : temp) {
			System.out.println(value);
		}
	
	
	}
}