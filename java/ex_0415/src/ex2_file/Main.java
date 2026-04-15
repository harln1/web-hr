package ex2_file;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		//1. 폴더가 없으면 생성
		File dir = new File("uploads");
		
		if(!dir.exists()) {
			
			boolean created = dir.mkdir(); 
			
			if(created) {
				System.out.println("uploads 폴더가 없어서 생성했습니다.");
			} else {
				System.out.println("uploads 폴더 생성에 실패했습니다.");
				return;
			}
		} else {
			System.out.println("이미 uploads 폴더가 존재합니다.");
		}

		//2. 폴더인지 확인
		if(dir.isDirectory()) {
			System.out.println(dir.getName() + "은(는) 폴더가 맞습니다.");
		}
		
		//3. 내부 목록 조회
		//listFiles()를 사용해 폴더 안의 파일들을 가져옴
		File[] files = dir.listFiles();
		
		System.out.println("--- 내부 목록 ---");
		if(files != null && files.length > 0) {
			for(File f : files) {
				System.out.println(f.getName());
			}
		} else {
			System.out.println("폴더가 비어있습니다.");
		}
	}
}

