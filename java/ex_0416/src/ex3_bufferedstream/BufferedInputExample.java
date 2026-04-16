package ex3_bufferedstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

//기본 스트림만 있어도 파일을 읽거나 쓰는 것이 가능하다
//하지만 속도가 느리거나 기능이 부족할(읽고 쓰기 만 있움) 수 있다
//한번에 어느정도 묶어서 읽고 내부 버퍼에 저장해 뒀다가 꺼내서 쓴다

//buffer(버퍼)
//데이터를 잠시 저장해두는 임시 공간 
public class BufferedInputExample {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("test.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			int data;
			while((data = bis.read()) != -1 ) {
				System.out.println((char)data);
			}
			bis.close();
			fis.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
