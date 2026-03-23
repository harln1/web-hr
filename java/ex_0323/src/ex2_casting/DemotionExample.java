package ex2_casting;

public class DemotionExample {
	public static void main(String[] args) {
		
		//강제형변환
		
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
		System.out.println(var8);
	}

}
