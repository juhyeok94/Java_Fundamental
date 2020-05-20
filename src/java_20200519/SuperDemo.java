package java_20200519;

import java.lang.*;

public class SuperDemo extends Object {
	public SuperDemo() {
		super();
	}
}

class A extends Object{
	A(int a){
		
	}
//부모 클래스는 디폴트 생성자를 만들고 시작하는게 좋음
	A() {
		super();
	}
	
}


class B extends A{
	B()	{
		super();
	}
}



/*
class A extends Object{

	public A() {
		super();
	}


}

class B extends A{
	B(){
		super();
	}
	
	
}

*/