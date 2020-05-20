package java_20200519;

public class ChidlDemo {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.money = 1_000_000_000;
		p.makeMoney();
		p.play("baduk");
		//p. 치면나오는거는 object클래스
		
		System.out.println(p.money);
		
		Child c = new Child();
		c.money = 1_000_000_000;
		c.setParentMoney(1_000_000);
		c.chicken = "교촌치킨";
		c.gotoSchool();
		c.makeMoney();
		c.play("omok");
		
		System.out.println(c.money);
		System.out.println(c.getParentMoney());		
		System.out.println(c.chicken);
		
		
	}
}
