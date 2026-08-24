package dbcornnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Select {
	public static void main(String[] args) {
		// db접속 경로
		String url = "jdbc:mysql://localhost:3306/java_db";
		String user = "root";
		String password = "11111111";

		// 실행할 sql 을 작성
		String sql = "select * from member";

		try (
				Connection conn = DriverManager.getConnection(url, user, password);
				// SQL 을 안전하고 효율적으로 실행하기 위한 객체
				PreparedStatement pstmt = conn.prepareStatement(sql)
			) {
			
			// 연결성공시
			System.out.println("mysql 연결성공");
			
			// sql문 실행결과를 rs에 담는다 (중복 선언 제거)
			ResultSet rs = pstmt.executeQuery();
			
			// rs.next() : 다음 행으로 이동하며 데이터가 있으면 true 반환
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				int age = rs.getInt("age");
				
				// println을 printf로 변경하고 형식 지정자 개수와 변수를 맞춤
				System.out.printf("id : %d | name : %s | email : %s | age : %d\n", id, name, email, age);
			}
			
		} catch (Exception e) {
			System.out.println("mysql 연결 또는 쿼리 실행 실패");
			e.printStackTrace();
		}
	}
}
 