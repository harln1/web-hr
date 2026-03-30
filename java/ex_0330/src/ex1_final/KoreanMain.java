package ex1_final;

public class KoreanMain {

	public static void main(String[] args) {
		Korean k1 = new Korean ("123456-1234567","박하린");
		System.out.println(k1.nation);
		System.out.println(k1.ssn+","+k1.name);
		
		//Final 필드는 변경불가 , 이름은 final필드가 아니라 변경가능
//		k1.nation = "일본";
//		k1.ssn = "123-123-12334";
		k1.name = "나카무라";
	

	}

}
