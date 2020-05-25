package java_20200525;

public class ThrowDemo {
	//return value -1 or -2 이런거는 예외값을 발생 못시킬때
	public static double withdraw(String account , int amount) throws IncorrectAccountExceoption, InsufficientBalanceExceoption {
																				//Exception의 서브이면 반드시 해야하지만 Runtime일 경우는 해도되고 안해도 되고
		double myBalance = 10_000;
		String myAccount = "123-123-123";
		
		if(myAccount.equals(account)) { 
			if(myBalance - amount >= 0) {
				myBalance -= amount;
			}else {
				//예외를 개발자가 임의로 발생 (대부분 사용자가 필요에 따라서 예외를 발생시킨거기떄문에 이것에 적합한 클래스를 생성한것
				throw new InsufficientBalanceExceoption("잔고가 부족합니다."); //잔고가 부족했을때 예외, 클래스가 Exception이면 매개변수만 보고 틀린점을 찾아내야하는데 지금은 매개변수를 썼지만 안썼을 경`우 찾기가 힘들다.
			}
		}else {
			//예외를 개발자가 임의로 발생
			throw new IncorrectAccountExceoption("잘못된 계정입니다."); //잘못된 계정일때 예외
		}
		
		return myBalance; //잔고도 안부족하고 계좌도 정확할때 리턴값
	}
	
	public static void main(String[] args) {
		double balance = 0;
		
		try {
			balance = withdraw("123-123-123",1000);
			System.out.printf("잔고 : %f%n", balance);
		} catch (IncorrectAccountExceoption e) {
			System.err.println(e.getMessage());
		} catch (InsufficientBalanceExceoption e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
	}
}
