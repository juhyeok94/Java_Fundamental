package java_20200519;

public class Admin {
	private String id;
	private String pwd;
	private String email;
	private int level;
	//매개변수 없는 생성자를 디폴트 생성자라 한다
	//default constructor
	//클래스 내 생성자가 없으면 생성되지만 1개라도 있으면 안만들어짐
	//클래스를 만들면 디폴트생성자를 만들어 놓는게 좋음
	//private로 하면 만들어도 에러남
	public Admin() {
		//모든생성자 첫 라인에는 super가 붙는다
		//숨어 있는거
		super(); //부모 클래스의 디폴트 생성자를 호출
	}
	
	//생성자(Constructor)
	//생성자는 반환값이 없고 , 이름은 클래스 이름과 동일
	//생성자의 역할은 인스턴스 변수 초기화
	//생성자는 클래스와 동일하게 보기때문에 첫글자는 대문자
 
	
	public /*void를 붙이면 함수 */ Admin(String id, String pwd, String email, int level) {
		super(); //부모 클래스의 디폴트 생성자를 호출
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.level = level;
	}
	
	//생성자 오버로딩
	public Admin(String id, String pwd, String email) {
		//super();
		//this.id = id;
		//this.pwd = pwd;
		//this.email = email;
		
		//this는  1. 자기자신 객체를 가르킬때와 2. 다른 생성자를 호출할때 
		//1. this.
		//2. this(~,~,,,,)
		this(id, pwd, email, 0); //다른 생성자 호출, 반드시 생성자에서만 호출 가능
	}
	
	//id에 대한 setter 메서드
	public void setId(String id) {
		this.id = id;
	}
	
	//id에 대한 getter 메서드
	public String getId() {
		return id;
	}
	
	
	//pwd에 대한 setter
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	//pwd에 대한 getter
	public String getPwd() {
		return pwd;
	}
	
	//email에 대한 setter
	public void setEmail(String email) {
		this.email = email;
	}
	
	//email에 대한 getter
	public String getEmail() {
		return email;
	}
	
	//level 에 대한 setter
	public void setLevel(int level) {
		this.level = level;
	}
	
	//level 에 대한 setter 
	public int getLevel() {
		return level;
	}
	
	//디폴트 생성자 단축키 = alt + shift +s => c
	//매개변수 생성자 = alt + shift + s => o
	//setter getter 단축키 = alt + shift + s => r
	
	
	
}