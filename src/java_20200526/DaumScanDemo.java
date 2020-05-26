package java_20200526;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

public class DaumScanDemo {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.daum.net/");
		InputStream in = url.openStream();
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);//한줄씩 읽기위해서
		String readLine = null;
		
		FileWriter fw = new FileWriter("c:\\dev\\daum.html");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw, true);
	
		while((readLine = br.readLine()) != null) {
			System.out.println(readLine);//모니터
			//bw.write(readLine);//파일
			//bw.newLine();
			pw.println(readLine);
		}
			//bw.flush();
		
//웹에 있는 데이터를 가져와 파일로 보낸거
//url 웹자료 이용
//출력장치, 파일 둘다 출력
		
		
	}
}
