package java_20200514;

public class ArrayDemo {
	public static void main(String[] args) {
		//1. 배열 선언 및 생성
		int[] a = new int[4];
		
		//2. 배열 할당
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;

		
		//3. 배열 출력
		//a.length : 배열의 길기
		//a 값을 고정을하면 a가 더 있을때 망함
		//syso + 컨트롤 스페이스 
		//컨트롤 알트 스페이스 방향키 아래 : 줄 복사
		//알트 방향키 줄 옮기기
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		
		}
		
		//배열 선언, 생성, 할당을 동시에 이루어짐
		int[] b = {100,200,300,400,500};
		
		//배열의 값 변경(할당)
		b[0] = 101;
		b[1] = 201;
		b[2] = 301;
		b[3] = 401;
		b[4] = 501;
		
		// 비열 룰력 -> for loop 개발자가 실수를 하면 값이 안나올수 있음 ex) int i = 1
		// index를 표시하면서 출력할수 있다
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		//배열 출력 -> enhanced for loop
		//index를 표시안하고 출력할수 있다.
		for(int temp :b) {
			System.out.println(temp);
		}
		
		//레퍼런스 끼리 = * - % 안됨
		int[] c = a;
		c[0] = 11;
		
		System.out.println(a[0]);
		System.out.println(c[0]);
		
		
		//a1의 값은 10, b1의 값은 10 a1을 20으로 바꿔도 b1은 20으로 바뀌는게 아니라 10으로 유지
		//b1의 값이 a1을 참조하는게 아니기 때문에, 각각 값을 할당하는거
		//but 배열은 참조하기때문에 값을 바꾸면 같이 바뀌게 된다.
		int a1 = 10;
		int b1 = a1;
		a1 = 20;
		
		
		
	}
}
