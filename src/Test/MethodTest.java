package Test;

public class MethodTest {
	public boolean isLeafTear(int year) {
		boolean isLeaf = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		return isLeaf;
	}

	public long plus(int first, int second) {
		return (long) first + (long) second;

	}
	public double divide (int first, int second) {
		return(double)first / (double)second;

	}
	public void prontln(String message) {
		System.out.println(message);
	}
	
	
	
}
