package java_20200526;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//시스템에 입력받은 값을 출력하는 방법
public class InputStreamReaderDemo {
	public static void main(String[] args) {
		InputStream in = System.in;//표준 입력장치와 연결(키보드)
		InputStreamReader isr = null;
		BufferedReader br = null;
		System.out.println("입력하세요>");
		
		try {
			//in.read(b) : 입력을 기다리고 있고, 키보드 입력중에 enter를 치면 키보드에 입력한 데이터를 b에 저장시킨다.
			/*
			byte[] b = new byte[100];
			System.out.print("입럭하세요>");
			
			int readByteCount = 0;
			
			while ((readByteCount = in.read(b)) != -1) {
				String str = new String(b,0,readByteCount);
				System.out.println(str);
				System.out.println("입력하세요>");
			}
			//byte 배열을 문자열로 바꿀려면 String
			*/
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);
			String readLine = null;
			while((readLine = br.readLine()) != null) {
				System.out.println(readLine);
				System.out.println("입력하세요>");
			}
		
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
