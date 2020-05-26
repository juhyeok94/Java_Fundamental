package java_20200526;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("c:\\dev\\FileDemo.java");
			fw = new FileWriter("c:\\dev\\FileDemo2.java");
			/*
			한문자를 읽어서 한문자를 출력
			int readChar = 0;
			while((readChar = fr.read()) != -1) {
				//표준 풀력장치 출력(모니터) char는 숫자를 문자로 변환
				System.out.print((char)readChar);
				//파일로 출력
				fw.write(readChar);
			}
			*/
			
			//char 배열만큼 읽어서 char배열에 저장후 write에서 출력
			int readCharCount = 0;
			char[] readChars = new char[1024];
			
			while((readCharCount = fr.read(readChars)) != -1) {
				System.out.print(new String(readChars, 0 , readCharCount));
				//fw.write(readChars, 0, readCharCount);
				//문자열 출력
				fw.write(new String(readChars, 0, readCharCount));
			
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					if(fr != null) fr.close();
					if(fw != null) fw.close();					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
		
		
		
		
	}
}
