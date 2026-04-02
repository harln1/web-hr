package ex1_innerclass.hiddenclass;

public class ButtonExample {
	public static void main(String[] args) {
		//메서드에 매개변수로 전달하는 방식을 이용하여
		//이벤트 처리하기
		Button btnOk = new Button();
		
		//setter호출  
		btnOk.setClickListener(new Button.ClickListener() {
			@Override
			public void onClick() {
				System.out.println("Ok 버튼을 클릭했습니다.");
			}
		});
		
		btnOk.click();
		
		Button btnCancle = new Button();
		btnCancle.setClickListener(new Button.ClickListener() {
			@Override
			public void onClick() {
				System.out.println("Cancle 버튼을 클릭했습니다.");
			}
		});
		
		btnCancle.click();
		
	}
	
	

}
