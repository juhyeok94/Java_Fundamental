package java_20200526;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo2 {
	public static void main(String[] args) {
		FileInputStream  fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("c:\\dev\\jdk-11.0.7_windows-x64_bin.exe"); //예외처리 1.
			fos = new FileOutputStream("c:\\dev\\jdk2.exe");//2.
			
			
			int readByteCount = 0;//3.
			byte[] readBytes = new byte[1024*8];
			
			//이거 외울것
			//fis.read(readbytes) : FileInputStream 에 8192바이트를 읽어서 readBytes에 저장하고 읽은 바이트수를 반환한다. // 4.
			while((readByteCount = fis.read(readBytes)) != -1) {
				fos.write(readBytes,0,readByteCount);//5.
				//읽은 바이트에서 처음 바이트까지 해야됨
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					if(fis != null)	fis.close();
					if(fos != null)	fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		
		
		
		
	}
}
