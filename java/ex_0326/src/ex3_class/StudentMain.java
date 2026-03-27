package ex3_class;

public class StudentMain {

	public static void main(String[] args) {
		
		Student minsu = new Student();
		
		
		 minsu .name = "민수 ";
		 minsu .age = 20;
		 minsu .score = 100;
		 
		 Student gildong = new Student();
		 gildong .name = "길동 ";
		 gildong .age = 20;
		 gildong .score = 100;
		 
		 Student yonghee= new Student();
		 yonghee .name = "영희";
		 yonghee .age = 20;
		 yonghee .score = 100;
		 
		//따로따로  관리하기 힘드니깐
		 //배열은 같은 타입의 데이터만 넣을 수 있다 데이터의 타입은 배열앞에 명시한다
		 Student[] students = {minsu,gildong,yonghee};
		 System.out.println(students[0].name);//0번 = 민수.이름  
		 
		 //배열에 들어있는 내용을 모두 출력하기
		 for (int i = 0; i < students.length; i++) {
			System.out.println("이름: " +students[i].name);
			System.out.println("나이: " +students[i].age);
			System.out.println("점수: " +students[i].score);
			System.out.println("\n----------------------");
		}
		
		
		




	}
}