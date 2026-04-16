package ex3_bufferedstream;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamerExample {
	public static void main(String[] args) {
		//InputStreamReader
		
		//Java입 출력시ㅣ 바이스 스트림을 문자 스트림으로 ㅂ변호나해ㅜ는 다리역할
		
		FileInputStream in = null;
		InputStreamReader is = null;
		
		try {
			in = new FileInputStream("test.txt");
			is = new InputStreamReader(in,"utf-8");
			
			int read = 0;
			while ((read= is.read())!= -1) {
				System.out.println((char)read);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
