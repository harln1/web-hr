package ex2_casting;

public class DemotionExample {
	public static void main(String[] args) {
		
		//강제형변환(명시적형변환)
		//1.큰 자료형->작은자료형
		//2.정수->문자
		//**주의**실수를 정수로 바꿀때 소수점 아래의 값은 손실된다
		
		//int > byte
		int var1 = 10;
		byte var2 = (byte)var1;
		System.out.println(var2);
		//long > int
		long var3 = 300;
		int var4 = (int)var3;
		System.out.println(var4);
		//int > char
		int var5 = 65;
		char var6 = (char)var5;
		System.out.println(var6);
		//위의 경우에서는 값의 손실은 없다.
		
		//double > int
		double var7 = 3.14150;
		int var8 = (int)var7;
		System.out.println(var8);//3(정수부분)만 출력이 된다 소숫점 아래 부분들 손실
		
		//컴파일 단계에서 연산
		byte result = 10+20;
		System.out.println("result:"+result);
		//컴파일입장 => 10+20 => 계산가능
		
		//byte는 실행시점에서 연산이가능함
		//컴파일러는 확실히 값이 고정된 경우에만 미리 계산한다
		byte v1 = 10;
		byte v2 = 20;
		//java에서는 byte,short,char 끼리의 연산은 자동으로 int로 변환이 된다.
//		불가능:byte v3 =v1+v2;  가능:byte v3 =(byte) (v1+v2);
	
		
	}

}
