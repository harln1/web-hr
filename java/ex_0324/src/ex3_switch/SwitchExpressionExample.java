package ex3_switch;
import java.util.Scanner;
public class SwitchExpressionExample {
	public static void main(String[] args) {
		//3-3 switch

		//break 를 빼먹으면 fall-through 가 발생한다
		//값을 변수에 넣으면 중복 코드가 많아진다
		int num = 2;
		//		String result ;
		//		switch(num) {
		//		case 1:
		//			result= "A";
		//			break;
		//		case 2:
		//			result= "B";
		//			break;
		//		case 3:
		//			result= "C";
		//			break;
		//		default: 
		//			result= "D";
		//			break;
		//=>  표현식 
		String result  = switch(num) { 
		case 1->"A";
		case 2 -> "B";
		case 3 -> "C";
		default -> "F";
		};
		System.out.println(result);

		//여러 case 를 묶기가 불편하다
		int day = 3;
		//		String type;
		//		switch (day) {
		//		case 1:
		//		case 2:
		//		case 3:
		//		case 4:
		//			type = "평일";
		//			break;
		//		case 6:
		//		case 7:
		//		case 8:
		//			type = "주말";
		//			break;
		String type = switch(day) {
		case 1,2,3,4,5 -> "평일";
		case 6,7 -> "주말";
		default -> "잘못된 값";
		};
		
		
		
		
		//화살표 오룬쪽애 여러줄의 로직이 필요하다면 {} 를 써야한다
		//이때 최종적으로는 반환할 값을 명시하려면  yield 키워드를 사용한다
	result = switch (num) {
		case 1-> "하나";
		case 2 -> {
			System.out.println("2가 입력됨");
			yield "둘";
		}
		default -> "기타";

	};
	
	int mount = 1;
	String result3 = switch (mount) {
	    case 1,3,5,7 ,8,10,12 -> mount+ "월은 31일까지 있습니다";
	    case 2 -> mount+"월은 28일까지";
	    case 4,6,9,11-> mount+"월은 30일까지";
	    default -> mount+"그 외의 달입니다"; 
	};
	System.out.println( result3 );
	
	Scanner sc = new Scanner(System.in);
	System.out.println("정수를 입력 해주세요 : ");
	int num1 = sc.nextInt();
	System.out.println("정수 한개더 입력해주세요 : ");
	int num2 = sc.nextInt();
	System.out.println("부호를 입력해주세요 : ");
	String a1 = sc.next();

	String result4 = switch(a1) {
	case "+" -> String.valueOf(num1 + num2);
	case "-" -> String.valueOf(num1 - num2);
	case "*" -> String.valueOf(num1 * num2);
	case "/" -> String.valueOf(num1 / num2) ;
	default -> "잘못된 부호입니다.";

	};
	System.out.println(num1 + a1 + num2+ "=" + result4);




	}
}


