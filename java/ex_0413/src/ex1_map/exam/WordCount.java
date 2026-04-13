package ex1_map.exam;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
	public static void main(String[] args) {
		//단어 빈도수 분석기
		//문자열을 공백 기준으로 분리한다
		//모두 소문자로 바꾼다
		//HashMap<String,Integer>에 단어별 개수를 저장한다
		//String text = "Apple banana apple Banana apple";
		String text = "Apple banana apple Banana apple";

		String[] words = text.toLowerCase().split(" ");

		Map<String, Integer> wordCount = new HashMap<>();
		
		for (String word : words) {
		    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
		}
		System.out.println("단어 빈도 분석 결과:");
		for (String key : wordCount.keySet()) {
		    System.out.println(key + " : " + wordCount.get(key) + "회");
		}
	}

}
