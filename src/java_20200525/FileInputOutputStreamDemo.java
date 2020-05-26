package java_20200525;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo {
	//파일로 입력하고 파일로 출력
	public static void main(String[] args) {

			FileInputStream fis = null;
			FileOutputStream fos = null;
			
			try {
				fis = new FileInputStream("c:\\dev\\jdk-11.0.7_windows-x64_bin.exe");
				fos = new FileOutputStream("c:\\dev\\jdk.exe");
				
				//이거 외울것 int~while
				//한바이트 읽고 한바이트 쓰기
				//read, write는 예외처리해야함
				int readByte = 0;				
				                  //fis.read() : 매개변수가 없다는건 한바이트 읽어 반환한다. 더이상 읽을 바이트가 없으면 -1을 반환한다.
				while((readByte = fis.read()) != -1) {
					//fos.write(~) : 한 바이트씩 쓰기
					fos.write(readByte);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				
					try {
						//null이 생성됬을때만 close 아니면 null exception 발생
						if(fis != null) fis.close();
						if(fos != null)	fos.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
			
			
			
		
	}
	
}
