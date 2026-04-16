package ex2__charstream.exam;

import java.io.*;
import java.util.Scanner;

public class UserMain                                                                                                                                                      {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fileName = "users.txt";

		while (true) {
			System.out.println("\n1. 회원가입 | 2. 로그인 | 3. 종료");
			System.out.print("선택 > ");
			int menu = sc.nextInt();
			sc.nextLine(); // 버퍼 비우기

			if (menu == 1) {
				// 회원가입 로직
				System.out.print("아이디 입력: ");
				String id = sc.nextLine();
				System.out.print("비밀번호 입력: ");
				String pw = sc.nextLine();

				User newUser = new User(id, pw);

				// 파일에 추가하기 (append: true)
				try (FileOutputStream fos = new FileOutputStream(fileName, true)) {
					fos.write(newUser.toByteData());
					System.out.println("회원가입 완료!");
				} catch (IOException e) {
					e.printStackTrace();
				}

			} else if (menu == 2) {
				// 로그인 로직
				System.out.print("아이디: ");
				String inputId = sc.nextLine();
				System.out.print("비밀번호: ");
				String inputPw = sc.nextLine();

				boolean loginSuccess = false;

				try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
					String line;
					while ((line = br.readLine()) != null) {
						// 저장된 형식 "아이디 : 비밀번호" 분석
						String[] data = line.split(" : ");
						if (data.length == 2) {
							if (data[0].equals(inputId) && data[1].equals(inputPw)) {
								loginSuccess = true;
								break;
							}
						}
					}
				} catch (FileNotFoundException e) {
					System.out.println("등록된 회원 정보가 없습니다.");
				} catch (IOException e) {
					e.printStackTrace();
				}

				if (loginSuccess) {
					System.out.println("로그인 성공!");
				} else {
					System.out.println("로그인 실패: 아이디 또는 비밀번호가 틀립니다.");
				}

			} else if (menu == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		sc.close();
	}
}
