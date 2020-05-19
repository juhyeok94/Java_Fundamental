package java_20200519;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar c = new Calendar(2020,6,25);
		//c.set(2020, 5, 25);
		//c.setYear(2025);//Calendar 클래스에서 변경할수 있게 만듬
		c.print();
		c.printCalendar(2020,7);
		c.printCalendarYear(2020);
		
	}
}
