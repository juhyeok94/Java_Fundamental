package java_20200527;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class UrlDemo {

	public static void main(String[] args) throws IOException {
		
		/* url 문자일때
		URL url = new URL("http://corners.gmarket.co.kr/Bestsellers?ItemId=1803177701#1803177701");
		
		String protocol = url.getProtocol();
		String host = url.getHost();
		int port = url.getPort();
		String path = url.getPath();
		String query = url.getQuery();
		String reference = url.getRef();
		
		System.out.println("protocol : "+protocol);
		System.out.println("host : "+host);
		System.out.println("port : "+port);
		System.out.println("path : "+path);
		System.out.println("query : "+query);
		System.out.println("reference : "+reference);

		InputStream in = url.openStream();//html 정보
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		
		String readLine = null;
		
		while((readLine = br.readLine()) != null) {
			System.out.println(readLine);
		}
		
		in.close();
		isr.close();
		br.close();
		*/
		
		URL url = new URL("http://gdimg.gmarket.co.kr/1803177701/still/300");
		
		String protocol = url.getProtocol();
		String host = url.getHost();
		int port = url.getPort();
		String path = url.getPath();
		String query = url.getQuery();
		String reference = url.getRef();
		
		System.out.println("protocol : "+protocol);
		System.out.println("host : "+host);
		System.out.println("port : "+port);
		System.out.println("path : "+path);
		System.out.println("query : "+query);
		System.out.println("reference : "+reference);
		
		InputStream in = url.openStream();
		FileOutputStream fos = new FileOutputStream("c:\\dev\\Gmart.jpg");
		
		int readByteCount = 0;
		byte[] readBytes = new byte[1024*8];
		
		while((readByteCount = in.read(readBytes)) != -1) {
			fos.write(readBytes,0,readByteCount);
		}
		in.close();
		fos.close();
	}
}
