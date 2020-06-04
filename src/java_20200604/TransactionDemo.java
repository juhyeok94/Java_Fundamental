package java_20200604;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionDemo {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean isSuccess = false;
		Connection con = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/kpc",
					"kpc12","kpc1234");
			
			//트랜젝션 시작
			con.setAutoCommit(false);
			
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO dept(deptno, dname, loc) VALUES(90,'A5','B5') ");
		
			pstmt1 = con.prepareStatement(sql.toString());
			pstmt1.executeUpdate(); 
			
			//stringbuuffer 안에 데이터 지우기
			sql.setLength(0);
			sql.append("INSERT INTO dept(deptno, dname, loc) VALUES(100,'A6','B6') ");
			
			pstmt2 = con.prepareStatement(sql.toString());
			pstmt2.executeUpdate();
			
			isSuccess = true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

				try {
					if(isSuccess) {
						con.commit(); //트랜젝션 끝
					} else {
						con.rollback();  //트랜젝션 끝
					}
					//위에서 false였기 때문에 아래서 다시 반환.
					//connection을 원상 복귀 시킴 = 원래대로 처리
					con.setAutoCommit(true);
					
					if(pstmt2 != null)	pstmt2.close();
					if(pstmt1 != null)	pstmt1.close();
					if(con != null)	con.close();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
				
	
	}

}
