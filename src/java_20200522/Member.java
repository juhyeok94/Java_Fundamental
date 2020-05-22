package java_20200522;

public class Member {
	private String id;
	private String name;
	
	//생성자 알트 쉬프트 에스  o 
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	//setter getter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
