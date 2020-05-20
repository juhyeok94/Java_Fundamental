package java_20200518;

public class Calendar {
	private int year;
	private int month;
	private int day;
	
	//year에 대한 setter의 매서드
	//setter 매서드를 이용하여 year를 변경한다
	public void setYear(int year) {
		this.year = year;
	}
	
	//year에 대한 getter 매서드
	//getter 매서드를 이용하여 year을 가져온다
	public void getYear(int year) {
		//매개변수 year이 멤버변수로 변경된다 this. year은 멤버변수
		this.year = year;
	}
	
	
	//this  : 자기자신 객체
	//로컬변수와 멤버변수와 구분할 때 사용한다.
	//ex) this. year = year;
	//    멤버변수             매개변수
	public void set(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	private int getCount() {

		int totalCount = 0; 
		int preyear = year-1;

		//2019년 총일수
		totalCount = preyear * 365 +
				(preyear/4 - preyear/100 + preyear/400);
		
		
		
		int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};


		//monthArray 배열에서 year이 윤년인지 아닌지를 판단하여 윤년이면
		//monthArray의 두번째 방의 값을 29로 변경해야한다
		//https://bit.ly/2Wmna80
		
		
		//4의 배수이면서 100의 배수이면 안되고 400의배수여야한다. = 4의배수는 윤년, 100의 배수는 윤년X, 400배수는 윤년
		boolean isLeafyear = year%4==0 && year%100 != 0 || year%400 == 0;
		
		if(isLeafyear) {
			monthArray[1] = 29;
		}
		
		for (int i = 0; i < month-1; i++) {
			totalCount +=monthArray[i];
		}
		
		
		//2019년 1월 ~ 4월까지 총일 수			
		//totalCount += 31+ 29 + 31 + 30;
		//2019년 5월 12일의 12일 까지 총일 수
		totalCount += day;
		
		return totalCount;
	}
	
	public void print() {
		
		int totalCount = getCount();
		int rest = totalCount % 7;
		
		rest = totalCount % 7;
		String message = null;
		if (rest == 1) {
			message = "월요일";
		} else if (rest == 2) {
			message = "화요일";
		} else if (rest == 3) {
			message = "수요일";
		} else if (rest == 4) {
			message = "목요일";
		} else if (rest == 5) {
			message = "금요일";
		} else if (rest == 6) {
			message = "토요일";
		} else if (rest == 0) {
			message = "일요일"; 
		}
		
		System.out.println(year+"년"+month+"월"+day+"일은"+message+"입니다");

	}
	
	
}
