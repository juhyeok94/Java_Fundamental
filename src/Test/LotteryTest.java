package Test;

public class LotteryTest {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		for(int i=0;i<lotto.length;i++) {
			int random = (int)(Math.random()*45)+1;
			boolean isExisted = false;
			
			for(int j=0; j<i; j++) {
				if(lotto[j]==random) {
					isExisted = true;
					break;
				}
			}
			if(!isExisted) {
				lotto[i] = random;
			}else {
				i--;
			}
		}
		
		
		
		
		for (int value : lotto) {
			System.out.print(value + "\t");
			}
		
		
	}
	
}
