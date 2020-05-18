package java_20200514;

public class LotteryDemo {
	public static void main(String[] args) {
		// 로또
		// 1. 1부터 45까지 숫자 중 임의 숫자 6개를 생성한다
		// 2. 6개 숫자중 중복된 숫자가 나오면 안된다.
		// Math.random() => 0보다 크거나 같고 1보다 작은 양수를 double 값으로 반환한다.
		// 0.00000 ~ 0.099999

		// 1-45의 임의 랜덤값을 반환

		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			int random = (int) (Math.random() * 45) + 1;
			
			//중복되는 값이 있는지 체크하는 변수
			boolean isExisted = false;
			
			//중복체크하는 코드
			for (int j = 0; j < i; j++) {
				if(lotto[j] == random) {
					isExisted = true;
					break;
				}
			}
			
			//중복됬을때 빈칸이 안되기 위해 한칸 앞으로 입력
			if(!isExisted) {
				lotto[i] = random;
			} else {
				i--;
			}
		
		}
		
		/*
		 * 중복체크 방법 2
		 * 
		 */
		
		
		
		
		
		//오름차순 코드, buble sort(ascending)
		
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto.length - i - 1 ; j++) {
				// 내림차순으로 할거면 부등호 방향만 반대로.
				if(lotto[j] > lotto[j+1]) {
					int temp = lotto[j+1];
					lotto[j+1] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
			
		
		
		
		
		for (int value : lotto) {
			System.out.print(value + "\t");
			}
		}
	}

