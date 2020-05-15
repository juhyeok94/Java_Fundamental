package java_20200512;

//ctrl + shift +f => 자동으로 줄 맞춰주기
public class OperatorDemo {
	public static void main(String[] args) {
		int a = 10, b = 22;
		int c = 0;
		double d = 0;

		c = a + b;
		System.out.println(c);

		c = a - b;
		System.out.println(c);

		// 캐스팅을 할때 int로만 되어있으면 큰 자료형을 붙이면 나머지는 자동으로 바뀜
		// 소수점이 필요없으면 상관없는데 필요할때는 변화을 해줘야된다
		d = b / (double) a;
		System.out.println(d);

		c = a * b;
		System.out.println(c);

		// 나머지 연산자
		c = b % a;
		System.out.println(c);

		// a= a+b
		a += b;
		System.out.println(a);

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			// sum = sum + i;
			sum = sum + i;

			System.out.println(sum);

			a = 10;
			b = 20;

			a++; // a=a+1;
			++b; // b=b+1;

			System.out.println(a); // 11
			System.out.println(b); // 21

			// 대입후 증가
			c = a++; // c=> 11
			System.out.println(c);

			// 증가후 대입
			c = ++b; // c=> 22
			System.out.println(c);

			a = 10;
			b = 20;
			d = 10.0;

			boolean isSuccess = false;
			isSuccess = a > b;
			System.out.println(isSuccess);

			isSuccess = a < b;
			System.out.println(isSuccess);

			isSuccess = a >= b;
			System.out.println(isSuccess);

			isSuccess = a <= b;
			System.out.println(isSuccess);

			// primitive data type 의 == 연산자는 자료형에 상관없이 값만 같으면 true를 반환한다.
			isSuccess = a == d;
			System.out.println(isSuccess);

			isSuccess = a != b;
			System.out.println(isSuccess);

			System.out.println(4 & 5);
			System.out.println(4 | 5);
			System.out.println(4 ^ 5);
			
			
			a=10;
			b=20;
			
			// a && b => a가 false이면 b를 연산하지 않음 (short circuit)
			// a||b => a가 true이면 b를 연산하지 않음 (short circuit)
			
			isSuccess = (a==b) && (++a==b++);
			System.out.println(isSuccess);
			System.out.println(a);
			System.out.println(b);
			
			
			// + => 연결연산자. 산술연산자
			// 산술연산자 (두개 모두 숫자일경우)
			// 연결연산자 (두개중 1개 이상이 문자열일 경우)
			System.out.println(1+2+3+"456");
			System.out.println("123"+4+5+6);
			System.out.println("123"+(4+5+6));
			
			
			
		}
	}
}
