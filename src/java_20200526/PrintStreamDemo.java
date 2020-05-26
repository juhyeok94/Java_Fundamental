package java_20200526;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

//굳이 flush 기능을 쓰기위해서 printStream 을 쓰기 애매
//autoFlush 기능만 추가된거
//파일과 연결, 출력장치와 연결
public class PrintStreamDemo {
	public static void main(String[] args) {
		/*
		 * 출력장치와 연결된 PrintStream PrintStream monitor = System.out;
		 * monitor.println("Hello World"); System.out.println("Hello World"); 일반출력은 out
		 * 트라이 캐치 에러출력은 err
		 */

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;

		try {
			fis = new FileInputStream("c:\\dev\\Git-2.26.2-64-bit.exe");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("c:\\dev\\Git4.exe");
			bos = new BufferedOutputStream(fos);
			// 파일과 연결되 있는 PrintStream
			ps = new PrintStream(bos, true); // true => autoFlush

			int readByte = 0;

			long start = System.currentTimeMillis();

			while ((readByte = bis.read()) != -1) {
				// ps.print(readByte); //Buffer 기능을 가지고 있지 않음
				ps.write(readByte); // Buffer 기능이 있음

			}
			// flush 안해도됨
			long end = System.currentTimeMillis();

			System.out.printf("경과시간 %d %n", end-start);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(ps != null) ps.close();
				try {
					if(fis != null) fis.close();
					if(bis != null) bis.close();
					if(fos != null) fos.close();
					if(bos != null) bos.close();
	
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}
}
