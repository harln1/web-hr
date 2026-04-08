package ex1_ganeric;

import java.util.Arrays;
import java.util.List;

public class WhildCardMain {
	public static void main(String[] args) {
		Wildcards wc = new Wildcards();
		
		List<String > list1 = Arrays.asList("A","B","C");
		List<Integer> list2 = Arrays.asList(1,2,3);
		
		wc.printList(list1);
		wc.printList(list2);
		
		wc.printNumbers(list2);
//		wc.printNumbers(list3);
//		wc.printNumbers(list1);
	}

}
