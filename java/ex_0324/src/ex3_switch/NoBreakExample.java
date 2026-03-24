package ex3_switch;

public class NoBreakExample {
	public static void main(String[] args) {
		//3-2 switch
		int time = 8;
		
		switch (time) {
		case 8:
			System.out.println("출근합니다");
			break;
		case 9:
			System.out.println("회의를 합니다");
			break;
		case 10:
			System.out.println("업부를 봅니다");
			break;
		default:
			System.out.println("외근을 나갑니다");
			break;
		}
		char grade = 'B';
		switch(grade) {
		case 'A' :
		case 'a':
			System.out.println("우수 회원입니다");
			
		case 'B':
		case 'b':
			System.out.println("일반회원입니다");
			break;
		default :
			System.out.println("비회원 손님입니다");
			break;
		}
	}

}
