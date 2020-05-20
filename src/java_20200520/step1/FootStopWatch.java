//밀리세컨드로 경과시간을 알려주는 애플리케이션 만들어주세요.
package java_20200520.step1;

public class FootStopWatch {
	long startTime;
	long endTime;
	
		public double getElapsedTime() {
			return  (double)(endTime - startTime) / 1000;
		}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		FootStopWatch f1 = new FootStopWatch();
		
		
		//1970년 1월 1일 부터 지금까지 시간을 밀리세컨드로 전환
		f1.startTime = System.currentTimeMillis();
		for(long i=0;i<200_000_000_000l;i++) {
			
		}
		
		f1.endTime = System.currentTimeMillis();
				
		double elapsedTime = f1.getElapsedTime();
		
		System.out.printf("경과시간 : %.3f", elapsedTime);
									//소수점 이하 3자리까지
		
		
		
		
	}

}
