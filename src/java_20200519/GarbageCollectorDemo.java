package java_20200519;

public class GarbageCollectorDemo {
	public static void main(String[] args) {
		Admin a1 = new Admin();
		a1 = new Admin();
		a1 = null;

		//참조할때는 참조하는 변수도 null로 만들어야지 GC후보에 감
		a1 = new Admin();
		Admin a2 = a1;
		a1 = null;
		a2 = null;
		
		
		
	}
}
