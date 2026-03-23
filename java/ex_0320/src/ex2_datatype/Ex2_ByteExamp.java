package ex2_datatype;

public class Ex2_ByteExamp {

	public static void main(String[] args) {
		// 정수의 경우 해당 자료형이 표현할 수 있는
		//범위를 벗어난 데이터를 저장하면
		//오버플로우, 언더플로우가 발생한다
		byte var1 = -128;//언더 플로우
		System.out.println("var1:"+var1);
		
		byte var2 = 127;
		//byte var3 = 128;//오버 플로우
		

	}

}
