package ex1_map.exam;


import java.util.HashMap;
import java.util.Map;

public class MaxFinder {
         	public static void main(String[] args) {
		int [] arr = {1,3,2,3,4,3,2,2};
		//숫자별 등장횟수를 HashMap<Integer,Integer>로 센다
		//가장큰 빈도수를 가진 숫자를 찾는다
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : arr) {

			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		int maxCount = -1;
		int mostFrequentNum = 0;
		
		for (int key : map.keySet()) {
			int count = map.get(key);
			if (count > maxCount) {
				maxCount = count;
				mostFrequentNum = key;
			}
		}
		
		System.out.println("가장 많이 등장한 숫자: " + mostFrequentNum);
		System.out.println("등장 횟수: " + maxCount + "회");
	}
}
	