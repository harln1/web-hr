package ex5_Singleton;

public class SingletonExample {
	public static void main(String[] args) {
		//생성자가 private로 정의되어있기때문에 다른클래스에서 호출하는게 불가능하다
		//Singleton obj = new Singleton();
		
		//Singleton 클래스에서 만들어놨던 객체를 받아온것
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		//obj1 과 obj2가 같은객체인지 증명하기
		//같은 객체면 "같은 객체입니다" 아니면 "같은 객체가 아닙니다"
		if(obj1 == obj2) {
			System.out.println("같은 객체입니다");
		}else {
			System.out.println("다른객체입니다");
		}
		 
		AttendanceManager a1 = AttendanceManager.getInstance();
		AttendanceManager a2 = AttendanceManager.getInstance();
		
		a1.addAttendance();
		a2.addAttendance();
		
		System.out.println(a1.getAttendance());
		System.out.println(a2.getAttendance());
		
		//싱글톤 패턴을 사용하는 이유
		//공유자원을 효율적으,로 관리하고, 구조를 안정적을 ㅗ 유지하기위해
		//new생성자(); 를 통해 객체를 여러개 만들게 되면 메모리를 많ㅇ니사용한다
		
	}

}
