package ex1_innerclass.exam;

public class Main2 {
	
	 public static void main(String[] args) {
	        //객체생성
	        Calculator calc = new Calculator();

	        Calculator.Result res = calc.add(10, 20);
	        res.show();
	 }
}


