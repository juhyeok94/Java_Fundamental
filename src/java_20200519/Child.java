package java_20200519;

public class Child extends Parent {
	String chicken;
	int money;
	public void gotoSchool() {
		System.out.println("Child gotoSchool()");
	}
	
	//부모의 기능을 자식이 받는거는 맞지만
	//부모의 모든 기능을 가져오기 때문에 money, makemoney는 가져오되 play는 다르니
	//자신의 play를 재정리 하는것
	//만드는동시에 규칙을 지켜야함
	
	public void play(String starcraft) { //public void play뒤에 내가 맘대로 명칭을 만들지 말것
		//super.play(starcraft);
		System.out.println("Child play()");
	}
	
	public void setParentMoney(int money) {
		super.money = money;
	}

	public int getParentMoney() {
		return super.money;
	}
}
