package customException;

public class InsufficientException extends Exception{
	
	//예외메시지는 부모생성자의 매개갑ㅅ으로 넘겨주는데ㅐ
	//공통메서드인 getMessage()의반환값으로사용하기위함
	public InsufficientException(String message) {
		super(message);
	}

}
