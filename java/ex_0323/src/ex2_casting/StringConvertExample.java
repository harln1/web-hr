package ex2_casting;

public class StringConvertExample {

	public static void main(String[] args) {
		//문자열 - > 기본타입
		//Integer = int(integer 약자)
		//		 자바제공클래스.메서드(기능)
		int value = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		System.out.println(value);
		System.out.println(value2);
		System.out.println(value3);
		
		//기본타입 -> 문자열
		//String.valueOf(데이터)
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf("true");
		
		
		 

	}

}
