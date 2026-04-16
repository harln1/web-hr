package ex3_bufferedstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample2 {
	public static void main(String[] args) {
		//Scanner
		//- 속도가 느리다
		//- nextInt(), nextDouble()등 입력과 동시에 데이터타입을 변환해주는 편의 기능이 많다
		//	하지만 내부적으로 정규표현삭을 사용하여 입력을 분석하기 때문에
		//	속도가 느려지는 원인이 된다
		
		//Buffereader
		//- 버퍼를 사용하기 때문에 속도가 빠르다
		//- 오직 문자열 단위로만 읽는다
		//- 다른 타입으로 사용하려면 번거롭지만 직접 바꿔줘야한다
		//- 보조스트림 이기 때문에 기반스트림이 필요하다
		
		//System.in :표준입력스트림 (바이트 기반 스트림)
		//문자나 문자열을 편하게 읽는 용도가 아니라 바이트 단위로 데이터를 읽는 통로
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String name = null;
//		int age = 0;
		String info = null;
		String info2 = null;
		try {
//			System.out.println("이름을 입력해주세요: ");
//			name = br.readLine();
//			System.out.println("나이를 입력 해주세요: ");
//			age = Integer.parseInt( br.readLine() );
			System.out.println("이름과 나이를 입력하세요: ");
			info = br.readLine(); 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		System.out.println("입력한이름: "+name);
//		System.out.println("입력한나이: "+age);
//		System.out.println("입력한내용: "+info);
		String[] arr = info.split(" ");
		System.out.println("이름: "+arr[0]);
		System.out.println("나이: "+arr[1]);
		
	}

}
