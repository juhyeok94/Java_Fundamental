package AfterStudy;

public class Java2 {
	public static void main(String[] args) {
		String season = null;
		int month = 5;
		if(month == 12 || month == 1 || month == 2) {
			season = "겨울";
		}else	if(month == 3 || month == 4 || month == 5) {
				season = "봄";
		}else	if(month == 6 || month == 7 || month == 8) {
			season = "여름";
		}else	if(month == 9 || month == 10 || month == 11) {
			season = "가을";
		}else	{		
			season = "업는계절";
		}
	
		System.out.println(month + "월은"+season+"입니다");
		//정수 %d, 실수 %f, String문자열 %s,  계행 %n => printf일때만
		System.out.printf("%d월은 %s입니다. %n", month, season);
		System.out.println("test");
		
		
		//switch에서 올수있는거 char byte short int String
		switch(month) {
		case 12 : season = "겨울"; break;
		case 1 : season = "겨울"; break;
		case 2 : season = "겨울"; break;
		case 3 : season = "봄"; break;
		case 4 : season = "봄"; break;
		case 5 : season = "봄"; break;
		case 6 : season = "여름"; break;
		case 7 : season = "여름"; break;
		case 8 : season = "여름"; break;
		case 9: season = "가을"; break;
		case 10 : season = "가을"; break;
		case 11 : season = "가을"; break;
		default : season = "없는계절";
		}
		System.out.printf("%d월은 %s 입니다.%n",month, season);	
		
		
		
		
		
		
		int sum = 0;
		//int i =1 을 뺄수 도 있음  => 바깥에 있으면 i값을 확인할 수 있음
		//무조건 int i = 1이 안에만 있어야 하는건 아님
		for(int i=1; i<=10;i++) {
			sum += i;
		}
	
		System.out.printf("1부터 10까지 합은 %d입니다. %n", sum);
		
		for(int i = 1; i<=10; i++) {
			if(i%2==0) {
				sum += i;
			}
		}
		System.out.printf("1부터 100까지 홀수 합은 %d입니디.%n",sum);
		
		
		for(int i =1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.printf("%d * %d%n",i,j,i*j);
			}
		}
	
		System.out.println();
		
		
		
		
		
		
		
	}
}