package ex5_Math;

public class MathExample {
	public static void main(String[] args) {
		//ceil 올림
		double v1 = Math.ceil(5.3);
		System.out.println(v1);
		
		//floor 내림
		double v2 = Math.floor(5.3);
		System.out.println(v2);
		
		//abs(); 절대값
		double v3 = Math.abs(-10);
		System.out.println(v3);
		
		//max() 최대값
		long v4 = Math.max(3, 7);
		System.out.println("더큰수:" + v4 );
		
		long v5 = Math.min(3, 7);
		System.out.println("더 작은수:" + v5  );
		
		//max() ,min()을 활용하여 최대 최소 값 구하기
		//최대 9 최소 1
		
		int [] arr = {5,2,9,1,7};
//		long v6 = Math.max(1, 9);
//		long v7 = Math.min(1, 9);
//		System.out.println("최대값: "+v6 + " 최솟값: "+v7);
		
		int max=arr[0];
		int min=arr[0];
		
		for(int i = 1;i<arr.length;i++) {
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		
		System.out.println("최대값: "+max + " 최솟값: "+min);
		
		//round() 반올림
		//무조건 소수점 첫자리에 반올림
		System.out.println(Math.round(3.15));
		
		double pi = 3.14159;
		double result2 = Math.round(pi*100)/100.0;
		System.out.println(result2);
	
		//pow() 제곱
		System.out.println(Math.pow(2, 3));
		
		//sqrt() 제곱근
		System.out.println(Math.sqrt(9.0));
		
		//10~20사이의 랜덤 정수를 출력
		int num = (int) (Math.random() * (20 - 10 + 1)) + 10;
		
		System.out.println("10~20사이의 랜덤정수: " + num);
		
		//두 점 사이의 거리를 구하시요
		//x1 = -5 , x2 = 8
		
		int x1 = -5;
		int x2 = 8;

		double length = Math.abs(x1 - x2); 

		System.out.println("두 점 사이의 거리: " + length); 
		
		//물건 53개를 한박스 8개씩 담으려고 한다
	    //필요한 박스의 개수를 구하시오
		
		int total = 53;
		int box = 8;
		
		double count = (int)Math.ceil(total/(double) box);
		System.out.println("필요한 박스의 갯수: "+ count);
		
		
	}

}
