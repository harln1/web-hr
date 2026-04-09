package ex1_List.ArrayList.exam;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ex1_List.ArrayList.Member;

public class Main {
	public static void main(String[] args) {
		//3명의 아이디와 비밀번호를 입력하여 list 에 저장
		//아이디가 중복되면 추가하지않고 다시입력받기
		Scanner sc = new Scanner (System.in);
		
		List<UserInfo> list = new ArrayList<>();

		for(int i = 0; i < 3; i++) {
            System.out.print("아이디 입력 : ");
            String id = sc.next();
            System.out.print("비밀번호 입력 : ");
            String pw = sc.next(); 
            
            
            boolean b = false;
            for (UserInfo u : list) {
                if (u.id.equals(id)) {
                    b = true;
                    break;
                }
            }

            if (b) {
                System.out.println("중복된 아이디 다시 입력해주세요.");
                i--; 
                continue;    
            }

            
            list.add(new UserInfo(id, pw));

            
            for (UserInfo u : list) {
                System.out.println(u.id);
                System.out.println(u.pw);
                System.out.println("-------------");
            }
        }
    }
}