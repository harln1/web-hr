package customException;

public class Converter2 {
	
	//주문 금액 계산 시스템
	//상품 가격과 수량을 입력받아 총 금액을 계산하는 프로그램 만들기
	
	// 문자열 -> 정수 변환
	public int toInt(String str) throws NumberFormatException {

		return Integer.parseInt(str);

	}
}