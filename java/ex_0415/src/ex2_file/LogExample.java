package ex2_file;

import java.io.File;

public class LogExample {
	/*
	 * logs폴더를 나타내는 file객체 만들기
	 * 폴더가 존재하지 않으면 "logs 폴더가 없습니다" 출력하고
	 * logs 폴더 안의 파일 중 확장자가 .log인 
	 * .log파일의 이름과 크기를 바이트 단위로
	 * 마지막에 .log파일 개수와 전체용량 합계를
	 * 
	 * 출력예시
	 * error.log - 1200byte
	 * access.log - 3400byte
	 * system.log - 800byte
	 * .log파일 개수 : 3
	 * 전체용량 : 5400byte
	 */
	public static void main(String[] args) {
		String path = "C:\\Users\\adminn\\Desktop\\web-hr\\logs"; 
		File dir = new File(path);

		
		if (!dir.exists() || !dir.isDirectory()) {
			System.out.println("logs 폴더가 없습니다.");
			return; 
		}

		
		File[] files = dir.listFiles();
		
		int count = 0;      
		long totalSize = 0;

		if (files != null) {
			for (File f : files) {
				
				if (f.isFile() && f.getName().endsWith(".log")) {
					System.out.println(f.getName() + " - " + f.length() + "byte");

					count++;
					totalSize += f.length();
				}
			}
		}
		System.out.println(".log파일 개수 : " + count);
		System.out.println("전체용량 : " + totalSize + "byte");
	}

}
