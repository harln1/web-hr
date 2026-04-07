package ex3_generic;

class Pair<T,U>{
	private T first;
	private U second;

	public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
	//first 와 second 출력하는 프린트 메서드
	public void Print (){
		System.out.println("첫번쨰 값: " + first);
		System.out.println("두번쨰 값: " + second);
	}
}

class Box<V>{
	private V value;
	
	public void setValue(V value) {
		this.value = value;
	}
	public V getValue() {
		return value;
	}
}
public class NestingExample {
	
	public static void main(String[] args) {
		//중첩제네릭
		Box<Pair<String, Integer>> box = new Box<>();

        Pair<String, Integer> pair = new Pair<>("홍길동", 30);

        box.setValue(pair);

        
        box.getValue().Print();
    }
}
