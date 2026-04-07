package ex3_generic;

import java.util.Iterator;

public class ArrayPrinter {

	//배열을 외부에서 전달받아 화면에 출력하는 기능을 가진
	//printArray 제네릭메서드작성하기
	public <T> void printArray(T[] array) {
		for (T item : array) {
			System.out.println(item);
		}
	}
	
	

}
