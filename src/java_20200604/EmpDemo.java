package java_20200604;

import java.util.ArrayList;

public class EmpDemo {
	public static void main(String[] args) {
		EmpDao dao = EmpDao.getInstance();
		int no = 9000;
		String name = "LEE1";
		String job = "SALESMAN";
		int mgr = 7844;
		String hiredate = null;
		int sal = 2222;
		int comm = 10;
		int deptno = 10;
		
		//EmpDto e = new EmpDto();
//		
//		//insert 
//		int resultCount = dao.insert(new EmpDto(no, name, job, mgr, hiredate, sal, comm, deptno));
//		if (resultCount == 1) {
//			System.out.println("사원이 정상적으로 추가 되었습니다.");
//		} else {
//			System.out.println("오류.....");
//		}
		
		
		//update
//		no= 9000;
//		name = "LEE1";
//		job = "SALESMAN";
//		mgr = 7844;
//		sal = 2222;
//		comm = 10;
//		deptno = 10;
//		
//		int resultCount = dao.update(new EmpDto(no, name, job, mgr, hiredate, sal, comm, deptno));
//		if (resultCount == 1) {
//			System.out.println("사원이 정상적으로 수정 되었습니다.");
//		} else {
//			System.out.println("오류.....");
//		}

		
		
		//delete
//		int resultCount = dao.delete(no);
//		if (resultCount == 1) {
//			System.out.println("사원이 정상적으로 삭제 되었습니다.");
//		} else {
//			System.out.println("오류.....");
//		}


		//select(0,10)
//		int start = 0;
//		int len = 10;
//		
//		ArrayList<EmpDto> list = dao.select(start, len);
//		for(EmpDto dto : list) {
//			System.out.printf("%d, %s, %s, %d, %s, %d, %d, %d %n", dto.getNo(), dto.getName(), dto.getJob(), dto.getMgr(),
//					dto.getHiredate(), dto.getSal(), dto.getComm(), dto.getDeptNo());
//		}
		
		no = 7839;
		EmpDto dto = dao.select(no);
		if(dto != null) {
			System.out.printf("%d, %s, %s, %d, %s, %d, %d, %d, %n", dto.getNo(), dto.getName(), dto.getJob(), dto.getMgr(),
					dto.getHiredate(), dto.getSal(), dto.getComm(), dto.getDeptNo());
		} else {
			System.out.println("회원정보가 없습니다.");
		}
		

	
	
	
	
	
	
	
	}
}
