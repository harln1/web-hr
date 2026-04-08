package ex1_reflection;

	// T는 최소한 java.lang.Number의 자식 타입(Integer, Double 등)임을 보장함
	public class NumberBox<T extends Number> {

	    private T value;

	    // 생성자: 클래스 이름과 동일하게 작성
	    public NumberBox(T value) {
	        this.value = value;
	    }

	    // doubleValue(): Number 클래스가 가진 메서드를 사용하여 double로 꺼내는 메서드
	    //T가 아무타입이나 받게 되면 이 메서드를 사용할수가 없다
	    //타입을 한정했기 때문에ㅐ 컴파일러가 T는 적어도 Number계열이라는 것을 안다
	    public double toDouble() {
	        return value.doubleValue(); // value와 doubleValue 오타 수정
	    
	}

}
