package ex5_null;

public class NullExample {
	public static void main(String[] args) {
		//NullPointerException 객체가 없는 상태에서 객체를 사용하려고 했을때 발생하는 
		String str = null;
		System.out.println(str.length());
	}

}
