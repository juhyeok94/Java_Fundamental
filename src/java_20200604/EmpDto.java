package java_20200604;

//Emp 테이블의 데이터를 관리하기 위한 클래스
//Emp 테이블의 컬럼(empno, ename, job, mgr, hiredate, sal, comm, deptno)을 멤버변수로 정하면됨.
//DTO : Data Transfer Object

public class EmpDto {

	private int no;
	//java는 클래스 명과 중복하며 변수명을 쓰지 않는다.
	//DataBase는 칼럼명과 중복하여 써야 하지만(join 때문에) java는 아님
	private String name;
	private String job;
	private int mgr;
	private String hiredate;
	private int sal;
	private int comm;
	private int deptNo;
	
	//디폴트 생성자 알트 쉬프트 s c
	public EmpDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	//매개변수 생성자 알트 쉬프트  s o
	public EmpDto(int no, String name, String job, int mgr, String hiredate, int sal, int comm, int deptNo) {
		super();
		this.no = no;
		this.name = name;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptNo = deptNo;
	}

	//getter setter 알트 쉬프트 s r
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getComm() {
		return comm;
	}

	public void setComm(int comm) {
		this.comm = comm;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	
	

	
}
