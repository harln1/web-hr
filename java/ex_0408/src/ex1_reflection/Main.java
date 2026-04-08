package ex1_reflection;

public class Main {
	public static void main(String[] args) {
		//제네릭 타입을 넣을수잇는건 좋은데 암거나 다 넣어도 되는개 문제
		Calculator<Number> cal1 = new Calculator<Number>();
		Calculator<Integer> cal2 = new Calculator<Integer>();
		Calculator<Double> cal3 = new Calculator<Double>();
		Calculator<Long> cal4 = new Calculator<Long>();
		
		//어떤 기능을 만들때는
		//특정 성징을 가진 타입만 받아야 안전하다는 문제가 생긴다
		
		//제네릭에 넣을 수 있는 타입의 범위를 한정
		
	}

}
