package ex1_operator;

public class AssignOperatorExample {

	public static void main(String[] args) {
		// =  : 우변에 값을 좌변에 대입한다
		int n1 = 10;
		
		
		int n2 = 7;
		
		//1. 복합대입연산자  : 산술연산자 + 대입연산자
		//+= , -= , *= , %= , /=
		int x = 10;
		x += 3; // x = x+3 =>> x=10+3 =>>> x=13
		System.out.println(x);
		x -= 2; //x = x-2 =>> x= 13-2 =>>11
		System.out.println(x);
		x *= 5; //x = x * 5 =>> x= 11*5=>>>55
		System.out.println(x);

	}

}
