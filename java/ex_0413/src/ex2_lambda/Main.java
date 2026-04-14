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
	
	//매개변수가 2개일때
	//매개변수에 전달된 두개의 숫자를 더하여 반환하는 람다식 작석
	Add add= (a , b) ->  a +b;
	int result = add.sum(10, 7);
	
	System.out.println(result);
	
	//짝수인지 판별
	//0보다 큰지 판별
	
	NumberCheck num = n -> n%2==0;
	NumberCheck num2 = n -> n > 0 ;
	System.out.println(num.test(4));
	System.out.println(num2.test(4));
	
    }
}
    
