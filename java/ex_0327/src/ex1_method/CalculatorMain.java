package ex1_method;

public class CalculatorMain {
	public static void main(String[] args) {
		
	//1. Calulator 객체 생성
	Calulator a = new Calulator();
	
	
	
	//2.메서드 호출 변수명.메서드 ,매개변수가 잇으면맞게 채워줘야함
	//return있을때 int 변수에 담아서
	int result = a.getResult(1, 2, "+");//(int x , int y, String op
	  System.out.println("계산기:"+result); 
	} 

}
