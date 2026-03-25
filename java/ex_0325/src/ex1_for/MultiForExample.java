package ex1_for;

public class MultiForExample {
	public static void main(String[] args) {
		
		//1. 반복문의 for문 
		for (int i = 1; i<=3;i++) {     //여기를 만족했어도
			for (int j = 1; j <= 3 ; j++) { //여기도 만족시켜 줘야하니깐 계속 반복 
				System.out.println(i+"  "+j);
			}
		}
		
		
		//두개의 주사위를 던졌을때 두눈의 합이 6이되는 모든 경우의 수 출력 
		for (int i = 1 ; i <= 6 ; i++) {
			for (int j =1 ;j <= 6; j++) {
				if (i+j==6) {
					System.out.println(i+","+j);
				}
			}
		}
		
		/*print , println , 
		 * 1234
		 * 1234
		 * 1234출력
		 * 
		 */
		for (int i = 1; i <= 3; i++) {           // 가로 줄(행) 
		    for (int j = 1; j <= 4; j++) {       // 세로 칸(열) 
		        System.out.print(j + " ");       
		    }                                    
		    
		    System.out.println();              
		}                 
//		for (int i = 1 ; i <= 1; i++) {
//			for (int j = 1; j <= 12; j++){
//				System.out.print(j + " ");
//			}
//			
//			System.out.println();
//		}

		int count = 1;
		for(int i= 1; i <= 3; i++) {
			for(int j=1; j<= 4;j++) {
				System.out.printf("%02d " , count++ );
			}
			System.out.println();

		}
		
		/*
		 * A B C D
		 * E F G H
		 * I J K L
		 */
		char ap = 'A';
		for (int i = 1; i<= 3; i++) {
			for (int j = 1 ; j <=  4; j++) {
				System.out.printf("%c " , ap++);
			}
			System.out.println();
		}
		
	}
}
