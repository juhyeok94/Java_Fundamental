package java_20200522;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		//ctl + shift + o (자동임포트 기능)
		//HashSet 객체의 중복을 허용하지 않고, 순서 없음.
		
		//1. 선언 및 생성
		//객체를 담을때 항상 일정한 클래스만 담을걸 아니면 출력시 오류가 날 수 있음
		//<generic>
		HashSet <Integer>set = new HashSet<Integer>();
		//2. 할당
		set.add(1); //auto boxing
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(1);
		set.add(5);
		set.add(6);
		set.add(6);
		set.add(7);
		set.add(7);
		
		//중복을 허용하지 않기때문에 갯수가 4로 나옴
		System.out.println(set.size());
		
		//3. 출력
		Iterator<Integer> i = set.iterator();
		while(i.hasNext()) {
			Integer number = (Integer)
					i.next();
			System.out.println(number);			
		
		//선언 할당 출력 함수를 기억해야됨
		}
		
		
		HashSet<Customer> set1 = new HashSet<Customer>();
		set1.add(new Customer("박주혁1"));
		set1.add(new Customer("박주혁2"));
		set1.add(new Customer("박주혁3"));
		set1.add(new Customer("박주혁1"));
		
		System.out.println("size : " +set1.size());
		
		//로또 복권 = HashSet
		//TreeSet -객체의 중복을 허용하지 않음. 오름차순 정렬
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		while(true) {
			int random = (int)(Math.random()*45) +1;
			lotto.add(random);
			if(lotto.size() == 6) break;
		}
		
		Iterator<Integer> iter = lotto.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next() + "\t");
		}
	}
}
