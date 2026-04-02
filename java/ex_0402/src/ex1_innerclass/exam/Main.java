package ex1_innerclass.exam;


public class Main {
	public static void main(String[] args) {
    // 1. RemoteControl 객체 생성
    RemoteControl remote = new RemoteControl();

    // 2. Button 객체 생성 (인스턴스 내부 클래스 생성 방식)
    RemoteControl.Button button = remote.new Button();

    // 3. press() 메서드 호출
    button.press();

    // 4. 마지막에 power 값 출력
    System.out.println("현재 전원 상태 : " + remote.power);
    
   
    
	}
}