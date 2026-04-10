package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bingo {
	public static void main(String[] args) {
		//1~50사이의 난수가있다
		//5*5의 빙고판에 25개의 숫자를 채운다
		//겹치면 안됌
		
		//만약 숫자가 오름차순으로 연속되게 나오면 섞어주기
		
		/*
		 * ex)
		 * 5 7 23 9 13 
		 * 41 38 17 10 3
		 * 
		 */

		List<Integer> list = new ArrayList<>();
		
		List<Integer> lotto = new ArrayList<>();
		while (lotto.size() != 5*5) { 
			int rand= (int)(Math.random()*50)+1;
		    lotto.add(rand); 
		}
		

	}
}


