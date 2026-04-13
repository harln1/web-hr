package ex2_lambda;

public class Main {
    public static void main(String[] args) {
    	//1.구현클래스를 만들어서 사용하기
    	//2.익명클래스 만들기
        MyFunction m = new MyFunction() {
            @Override
            public void run() {
                System.out.println("익명클래스 실행");
            }
        }; 
        m.run();

      //3.람다식사용
        MyFunction lambda = () -> System.out.println("람다식 실행");
        lambda.run();
        
       PrintNumber pn = new PrintNumber() {
		
		@Override
		public void run() {
			System.out.println();
			
		}
	};
	pn.run();
	
	
    }
}