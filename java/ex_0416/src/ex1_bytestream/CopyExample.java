package ex1_bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyExample {
	public static void main(String[] args) {

		// 상대 경로에 있는 이미지 파일을 바이트 기반 스트림으로 읽어오기
		// 읽어서 복사본 만들기 , 복사본 이름: wall_copy.jpg
		// 복사하면서 걸리는 시간을 currentTimeMillis(); 로 측정하기
		
		
		long start = System.currentTimeMillis();

		FileInputStream in = null; 
		FileOutputStream out = null;

		try {
			in = new FileInputStream("wall.jpg");
			out = new FileOutputStream("wall_copy.jpg");
			
			System.out.println("이미지 읽기 시작");
			// 1. 바구니(버퍼) 만들기 (보통 1024의 배수로 만듭니다)
			byte[] buffer = new byte[1024]; 
			int len = 0; // 읽어온 바이트 수를 저장할 변수

			//버퍼를 이용해 읽기 (len 은 이번에 읽은 데이터의 개수)
			while ((len = in.read(buffer)) != -1) {
				//버퍼의 0번부터 len 개만큼만 쓰기
				out.write(buffer, 0, len);
			} 

			System.out.println("이미지 읽기 종료");
			long end = System.currentTimeMillis();
			
			
			double time = (end - start) / 1000;
			System.out.println(time + "초");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) out.close();
				if (in != null) in.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}