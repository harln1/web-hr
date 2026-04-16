package ex2__charstream.exam;

import java.io.FileWriter;

public class FileWriterExample {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("hello.txt",true); 
			fw.write("첫번째 줄 작성합니다\n");
			fw.write("두번째 줄도 문제없습니다\n");
			
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
