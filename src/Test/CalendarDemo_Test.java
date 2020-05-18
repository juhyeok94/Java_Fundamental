package Test;

public class CalendarDemo_Test {
	public static void main(String[] args) {
		/*
		 * 달력만들기 1. 1년 1월 1일 월요일 2. 1년은 365이고, 윤년일때는 366일 3. 윤년은 4년마다 발생하고, 그중에 100의 배수는
		 * 제외하고, 400배수는 제외하지 않는다. 4. 2020년 5월 12일은 무슨요일 일까? 5. 2019년까지 총일수 +4월까지 총일수 +
		 * 12 더해서 7로 나눈 나머지가 1이면 월요일, 2이면 화요일,.... 1년 364.24
		 * 
		 * (2019*365 + ((2019/4 - 2019/100 + 2019/400)) + 31 + 29 + 31 + 30 + 12)%7
		 * 
		 */

		int year = 2020;
		int month = 5;
		int day = 12;
		int totalCount = 0;
		int rest = 0;
		int preyear = 0;

		
		
		
		
	}
}
