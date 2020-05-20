package java_20200520.step5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class StopWatchDemo {
	
	public static void run(StopWatch s1) {
		s1.execute();
	}
	

	public static void main(String[] args) throws Exception {
		//StopMilliWatch s1 = new StopMilliWatch();
		//StopMicroWatch s1 = new StopMicroWatch();
		//StopNanoWatch s1 = new StopNanoWatch();
		//run(s1);

		// 컨트롤 쉬프트 o = 자동 임포트
		BufferedReader br = new BufferedReader(new FileReader("C:\\dev\\eclipse-workspace\\Java_Fundamental\\src\\java_20200520\\step5\\class.txt"));
		
		String readLine = br.readLine();
		
		Class clazz = Class.forName(readLine);
		
		StopWatch s= (StopWatch)clazz.newInstance();
		run(s);
		
		
		
		
		
	}
}
