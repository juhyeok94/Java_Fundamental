package java_20200511;

public class CharacterDemo1 {
	public static void main(String[] args) {
		//1 유니코드 표현 => '\u0000'
		char c1 = '\uBC15';
		char c2 = '\uC8FC';
		char c3 = '\uD601';
		
		System.out.print(c1);
		System.out.print(c2);
		System.out.print(c3);
		
		
		//2. 아스키코드 변화
		// 48- 57 =>0-9
		// 65- 90 =>A-Z
		// 97- 122 =>a-z
		
		char c4 = 97;
		System.out.println(c4);
		
		//3. 문장표현법
		char c5 = '성';
		System.out.println(c5);
		
		
		char c6 = '\\';
		char c7 = '\'';
		char c8 = '"';
		
		String s1 = "\\";
		String s2 = "\"";
		String s3 = "'";
		
		System.out.println("aa"+'\t'+"bb");
		System.out.println("aa"+'\n'+"bb");
		System.out.println("aa"+'\r'+"bb");
		
		
	}
}
