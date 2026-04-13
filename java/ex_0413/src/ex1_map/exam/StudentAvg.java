package ex1_map.exam;

import java.util.HashMap;
import java.util.Map;

public class StudentAvg {
	public static void main(String[] args) {
		//이름 key 점수 value 로 저장
		//평균,최고점 학생 찾기
		//평균 xx점 , 최고점수학생 xxx/00점	
		 Map<String, Integer> scores = new HashMap<>();
		 scores.put("김예쁨", 110);
		 scores.put("박하린",60);
		 scores.put("홍길동", 50);
		 int total = 0;
	     int maxScore = -1;
	     String topStudent = "";
	     
	     for(String name : scores.keySet()) {
	    	 int score = scores.get(name);
	    	 total += score;
	    	 if(score > maxScore) {
	    		 maxScore = score;
	    		 topStudent = name;
	    	 }
	     }
	     
	     double avg = (double)total / scores.size();
	      
	     System.out.println("평균:"+avg);
	     System.out.println("최고점수학생 : "+ topStudent +"/"+maxScore);
	     
		 
	}

}
