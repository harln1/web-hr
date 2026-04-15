package ex3_bytestream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LoginExample {
	public static void main(String[] args) {
		
	
//	회원 정보가 member.txt에 저장되어 있다.
//	apple
//	1234
//	첫번째 줄은 id이고, 두번째 줄은 비밀번호이다.
//
//	사용자로부터 아이디와 비밀번호를 입력받아
//	파일에 저장된 값과 비교한 뒤 로그인 성공 여부를 출력하는 프로그램 작성하기
	 File file = new File("C:\\Users\\adminn\\Desktop\\eclipse\\member.txt");
	 
	 Scanner sc = new Scanner(System.in);
	 
	 try {
		 Scanner fileScanner = new Scanner(file);
		 String fileld = fileScanner.nextLine();
		 String pw = fileScanner.nextLine();
		 
		 System.out.println("아이디입력: ");
		 String inputId = sc.next();
		 System.out.println("비밀번호 입력: ");
		 String inputPw = sc.next();
		 
		 
		 if (fileld.equals(inputId) && pw.equals(inputPw)) {
             System.out.println("로그인 성공");
         } else {
             System.out.println("로그인 실패: 아이디또는 비밀번호가 틀렸습니다.");
         }
         fileScanner.close();
         
     } catch (FileNotFoundException e) {
         System.out.println("member.txt 파일을 찾을 수 없습니다.");
     } finally {
         sc.close();
     }
	
	
 }
}
