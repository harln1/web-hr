package ex3_bufferedstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterExample {
	public static void main(String[] args) {
		
		// try-with-resources 문법 사용
		try (
				FileOutputStream fos = new FileOutputStream("test.txt");
				
				OutputStreamWriter os = new OutputStreamWriter(fos, "UTF-8")
			) {
			
			String[] strArray = {
					"OutputStreamWriter 에 대해 배웁니다.",
					"자바 입출력 스트림 실습 중입니다.",
					"한글이 잘 저장됩니다."
			};
			
			// test.txt에 배열에 들어있는 문자열을 순차적으로 넣기
			for (String str : strArray) {
				os.write(str+"\n");
			
			}
			
			System.out.println("파일 저장이 완료되었습니다.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
						
	}
}
