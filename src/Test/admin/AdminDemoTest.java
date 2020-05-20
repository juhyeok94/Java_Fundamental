package Test.admin;

public class AdminDemoTest {
	public static void main(String[] args) {
		
	AdminTest a = new AdminTest("asd","12345","qwer@naver.com",100);
	
	System.out.println(a.getId());
	System.out.println(a.getPwd());
	System.out.println(a.getEmail());
	System.out.println(a.getLevel());
	
	AdminTest a1 = new AdminTest("qwe","1q2w3e4r","1234@naver.com");
	
	System.out.println(a1.getId());
	System.out.println(a1.getPwd());
	System.out.println(a1.getEmail());
	System.out.println(a1.getLevel());
	
	
	
	
	}
	
}
