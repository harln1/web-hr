package ex3_bytestream;

import java.io.FileInputStream;     
import java.io.FileNotFoundException;
import java.io.IOException;         

//스트림(stream)
//데이터가 한 방향으로 흐르는 통로
public class FileInputStreamExample {
	public static void main(String[] args) {
		//파일에서 바이트 단위로 데이터를 읽어오는 클래스
		//파일이 없으면 예외가 발생할 수 있기 때문에 예외처리를 해줘야한다.
		// String path = "test.txt"; (X) -> 못 찾음

		try {
			
			// String path = "test.txt"; (X) -> 못 찾음
			String path = "C:\\Users\\adminn\\Desktop\\web-hr\\test.txt"; // (O) -> 정확함
			FileInputStream fis = new FileInputStream(path);


			//FileInputStream fis = new FileInputStream("test.txt");
			
			// 1바이트 읽기 (숫자로 반환됨)
			int data = fis.read();
			
			// 읽은 데이터가 있다면 문자로 변환해서 출력
			if(data != -1) {
				System.out.println("읽은 데이터: " + (char)data);
			}
			
			//스트림을 사용하고 나면 반드시 닫아야함
			fis.close();
			
		} catch (FileNotFoundException e) {
			// 파일이 없을 때 처리
			System.out.println("파일을 찾을 수 없습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			// 읽기 오류나 스트림 문제 처리
			System.out.println("데이터를 읽는 중 오류 발생.");
			e.printStackTrace();
		}
	}
}
