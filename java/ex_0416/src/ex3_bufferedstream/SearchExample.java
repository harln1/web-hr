package ex3_bufferedstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchExample {
	public static void main(String[] args) {
		// 사용자로 부터 검색할 단어를 입력 받고 , story.txt파일에서 해당 단어가 포함됨 줄을 출력하세요
		// 실행 예시
		// 검색어 입력 : 자바
		// 자바는 객체지향 언어이다.
		// 오늘 자바 공부를 했다.

		// 파일은 한줄씩읽는다.

		// 권장 스트림
		// BufferedReader
		try(                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
				BufferedReader keyboard  = new BufferedReader(new InputStreamReader(System.in));
				BufferedReader fileBr  = new BufferedReader(new FileReader("story.txt"))
				){
			System.out.println("검색어 입력: ");
			String seaString = keyboard.readLine();
			
			String line;
			boolean found = false;
			
			while ((line = fileBr.readLine())!= null){
				if(line.contains(seaString)) {
					System.out.println(line);
					found = true;
				}
			}
			if(!found) {
				System.out.println("해당 단어가 포함된 문장이 없습니다");
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
