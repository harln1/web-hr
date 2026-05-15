package dbcornnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement; // 1. 이 임포트 구문이 반드시 필요합니다!

public class Main {
	public static void main(String[] args) {
		// db접속 경로
		String url = "jdbc:mysql://localhost:3306/java_db";
		String user = "root";
		String password = "11111111";

		// 실행할 sql 을 작성 (? 는 값이 들어갈 자리)
		String sql = "INSERT INTO member(name,email,age) values (?,?,?)";
	
		try (
				Connection conn = DriverManager.getConnection(url, user, password);
				// SQL 을 안전하고 효율적으로 실행하기 위한 객체
				PreparedStatement pstmt = conn.prepareStatement(sql)
			) {
			
				// 연결성공시
				System.out.println("mysql 연결성공");
			
				// ? 부분에 데이터 채우기
				pstmt.setString(1, "이영희");
				pstmt.setString(2, "yonghee@test.com");
				pstmt.setInt(3, 25);
				
				// SQL 실행 (executeUpdate로 수정함)
				pstmt.executeUpdate(); 
				
				System.out.println("추가 성공");
	
		} catch (Exception e) {
			System.out.println("mysql 연결 또는 쿼리 실행 실패");
			e.printStackTrace();
		}
	}
}
