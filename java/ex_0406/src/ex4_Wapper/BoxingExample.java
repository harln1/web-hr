package ex4_Wapper;

public class BoxingExample {
	public static void main(String[] args) {
		//Boxing
		Integer obj = 100;
		System.out.println(obj + 100);
		
		System.out.println(obj.intValue());
		
		//UnBoxing
		int result = obj;
	}

}
