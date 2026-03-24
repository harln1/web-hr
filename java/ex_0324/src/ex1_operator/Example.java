package ex1_operator;
import java.util.Scanner;
public class Example {
	public static void main(String[] args) {
		//상자하나에는 농구공이 5개가 들어갈수있다 만약 농구공이 23개라면 몇개의 상자가 필요한가
//		int box = 5;
//		int boll = 23;
//		System.out.println("필요한 상자의 갯수 : " + box % boll);
		Scanner sc = new Scanner(System.in);
		int box;
		int ball;
	
		System.out.println("공의 갯수 : ");
		ball = sc.nextInt();
		box = ball % 5 == 0 ? ball/5 : ball/5+1; //공을 5로 나누었을때 0이랑 같으면 ? 그냥ball/5 :아니면 나눈후+1
	
		System.out.println("필요한 상자의 갯수"+ box);
		
		//사각형의 가로와 세로의 길이를 입력받아 넓이와 둘레 구하기
		
		double width ;
		double  height;
		
		System.out.println("사각형의 가로: ");
		width = sc.nextDouble();
		System.out.println("세로: ");
		height = sc.nextDouble();
		
		double area = width * height;
		double perimeter = (width + height)*2;
		
		System.out.println("사각형의 넓이는 : " + area);
		System.out.println("사각형의 둘레는 : "+ perimeter);
		
		//학생은 하루에 일정한 금액의 용돈을 받는다 
		//하루에 받는 용돈 money 날짜 수 : day
		//총 받은 용돈에서 사용한 금액 used 를 뺀 남은 돈으 ㄹ출력하는 코드
		int money;
		//int day;
		int used;
		
		System.out.println("받은 용돈 : " );
		money = sc.nextInt();
		System.out.println("사용한 금액: ");
		used = sc.nextInt();
		
		int a = money - used;
		
		System.out.println("총 남은 돈 : " + a);
		System.out.println("강사님 풀이 ------------");
		int money1;
		int day;
		int used1;
		
		System.out.println("받은 용돈 : " );
		money1 = sc.nextInt();
		System.out.println("날짜 : " );
		day= sc.nextInt();
		System.out.println("사용한 금액: ");
		used1 = sc.nextInt();
		
		int remain = (money1*day) - used1;
		
		System.out.println("총 남은 돈 : " +remain);
		
		
		  //국어 영어 수학에 대한 점수를 키보드에서 입력받는다
		System.out.println("국어 :");
		int kor = sc.nextInt();
		
		System.out.println("영어 : ");
		int english = sc.nextInt();
		
		System.out.println("수학 : ");
		int math = sc.nextInt();
		
		//1.세과목에 대한 합계 구하기
		int a1 = kor + english + math;
		System.out.println("총 합계 :"+a1);
		//2.평균 출력하기 (합계 / 3.0)
		double b = a1 / 3.0;
		System.out.println("평균 점수 : "+b);
		//3.세 과목의 점수가 각각 60점이상, 평균도 60점 이상일때 (&&?) 합격 아니면 불합격
		String result = kor>= 60 && english>= 60 &&math >= 60 && a1 >=60 ? "합격" :"불합격" ;
		System.out.println("결과 : "+ result);
		
		 //강사님풀이 
//		boolean b1 = kor>= 60 && english>= 60 &&math >= 60 && a1 >=60 ? true : false;
//		System.out.println("합격여부 : "+b1);
//		 

	}

}
