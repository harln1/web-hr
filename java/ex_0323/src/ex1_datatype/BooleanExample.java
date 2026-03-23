package ex1_datatype;

public class BooleanExample {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1);
		System.out.println(b2);
		
		//변수의 이름을 잘 지어야한다
		//예시 :
		
		boolean isStudent = false;  //학생이 아니다
		boolean isOn = true; //전등이 켜져있음
		//boolean변수를 다른 변수에 대입 할 수 있다
		boolean copy = isOn;
		System.out.println("복사한값:"+ copy);
		//boolean 은 true / false 값만 올 수있다
		isOn = false; //전등이 꺼져있음
		System.out.println("전등상태바뀜:"+ isOn);
		
		

	}

}
