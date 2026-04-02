package ex1_innerclass.interfaceexample;

public class Button {
	//중첩 interface
	//Static붙이지 않아도 자동으로 static 처리가 된다
	//중첩 interface 는 무조건 static 이다 
	public static interface ClickListener{
		void onClick();//onClick 추상메서드
	}
	
	//Button 이 가진 필드
	private ClickListener clickListener;
	
	//setter릉ㄹ 통해 주입을 받음
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}

	//버튼이 클릭 되었을대 실행할 메서드로 click()메서드 추가하기
	//실행내용은 ClickListener 인터페이스 필드를 이용해서 onClick()추상 메서드 호출
	//click()메서드
	public void click() {
		clickListener.onClick();
	}
}
