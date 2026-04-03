package customException.ex1_exception.throwsexample;

public class ThrowsExample2 {
	//main메서드에서도 throws키워드를 사용해서 예외를 떠넘길수 있다
		//결국 JVM 이 최종적으로 예외처리를 하게된다
		//JVM은 예외의 내용을 콘솔에 출력하는 것으로 예외처릴한다
		public static void main(String[] args) throws Exception{
			findClass();
		}

		//나열해야하는 예외클래스 많은경우  throws Exception 또는 throws Throwable 만으로
		//모든 예외를 간단히 넘길스도잇다
		public static void findClass() throws ClassNotFoundException{
			//java.lang.String2클래스를 찾아서 메모리에 올리는 기능
			Class.forName("java.lang.String2");
		}
}
