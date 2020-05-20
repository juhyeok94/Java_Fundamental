package java_20200519;

public class AdminDemo {
	public static void main(String[] args) {
		Admin a = new Admin("asd","12345","wngur2436@naver.com",100);
		//객페체를 생성하고 옆에처럼 쓰면 아래 변수 안써도됨 but 생성자 필요
		//a.id ="asd"; //id 접근한정자가 private이기 때문에 접근불가
		//따라서 접근을 하려면 메스드를 통해서 가져와야함
		
		/*String id = a.getId();
		 * System.out.println(a.getId();
		 *이렇게 쓰는 이유 변수를 다른곳에 또 쓰기위해서
		 *한번만 쓰고 끝낼거면 아래처럼 다이렉드로 쓰기
		 */
		
		//a.setId("asd");
		//a.setPwd("12345");
		//a.setEmail("wngur2436@naver.com");
		//a.setLevel(100);
		
		System.out.println(a.getId());
		System.out.println(a.getPwd());
		System.out.println(a.getEmail());
		System.out.println(a.getLevel());
		
		//생성자도 오버로딩이 가능하다
		Admin a1 = new Admin("qwe","1q2w3e","wngur@naver.com");
		
		
		
		System.out.println(a1.getId());
		System.out.println(a1.getPwd());
		System.out.println(a1.getEmail());
		System.out.println(a1.getLevel());
		
		
	}
}
