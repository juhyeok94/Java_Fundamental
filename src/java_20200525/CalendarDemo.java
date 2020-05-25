package java_20200525;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		//현재 날짜를 구할때도 많지만 가끔 원하는 시간의 날짜를 구할때도 있다
		//아래는 원하는 시간읜 날짜를 구하는 명령어
		cal.setTimeInMillis(1589169003757l);
		
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; //월은 0부터 카운트 나머지는 1부터 카운트
		int day = cal.get(Calendar.DATE);
	
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(year+","+month+","+day);
		System.out.println(hour+","+minute+","+second);
	
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		String date = sdf.format(cal.getTime());
		System.out.println(date);
	}
}
