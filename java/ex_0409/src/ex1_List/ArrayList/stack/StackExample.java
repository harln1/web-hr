package ex1_List.ArrayList.stack;

import java.util.Stack;

//Stack
//LastInFirstOut 선출. 구조를 가지는 자료구조
public class StackExample {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		//스택에 데이터를 추가할때
		//push()
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		//스택에 들어있는 내용 꺼내기
		//pop();
		System.out.println(stack.pop());//3
		
		//현재 맨 위의 값 보기
		//peek();
		System.out.println(stack.peek());//2
	}

}
