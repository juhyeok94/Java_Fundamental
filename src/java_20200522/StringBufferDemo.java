package java_20200522;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("test");
		StringBuffer s2 = new StringBuffer("test");
		System.out.println(s1 == s2);
		//StringBuffer 클래스는 Object의 equals() 매서드를 overriding 하지 않았기때문에
		//Object의 equals()매서드를 사용한다.
		System.out.println(s1.equals(s2));

		//StringBuffer => String : toString()
		String s3 = s1.toString();
		String s4 = s1.toString();
		
		System.out.println(s3.contentEquals(s4));
		
		StringBuffer sq1 = new StringBuffer();
		sq1.append("select name, age ");
		sq1.append("from member ");
		sq1.append("where name = '박주혁' ");
		sq1.append("order by name desc ");
		
		System.out.println(sq1.toString());
		//원래는 뒤에 toString()이 생략되어 있는거
		//StringBuffer을 오버라이딩 했음
		
		
		sq1.setLength(0);
		//StringBuffer에 모든 문자열 지우기
		sq1.append("select no, weiter from board");
		
		System.out.println(sq1);
		
	}
}