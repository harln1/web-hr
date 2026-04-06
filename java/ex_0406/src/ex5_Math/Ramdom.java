package ex5_Math;

import java.util.Arrays;
import java.util.Scanner;

public class Ramdom {
	public static void main(String[] args) {
		//로또번호(1~45) 를 뽑아서 배열에 넣는다
		//키보드에서 6개의 숫자를 입력받아 번호맞추기
		//각 배열을 정렬한뒤  Arrays.equals()활용하기 
		 int[] lotto = new int[6];
		 for (int i = 0; i < lotto.length; i++) {
	            lotto[i] = (int) (Math.random() * 45) + 1;
	           
	            for (int j = 0; j < i; j++) {
	                if (lotto[i] == lotto[j]) {
	                    i--;
	                    break;
	                }
	            }
	        }

	        Scanner sc = new Scanner(System.in);
	        int[] myNumbers = new int[6];
	        System.out.println("1~45 사이 숫자 6개를 입력하세요:");
	        for (int i = 0; i < 6; i++) {
	            System.out.print((i + 1) + "번째 번호: ");
	            myNumbers[i] = sc.nextInt();
	        }

	      
	        Arrays.sort(lotto);
	        Arrays.sort(myNumbers);
	        
	        System.out.println("당첨 번호: " + Arrays.toString(lotto));
	        System.out.println("나의 번호: " + Arrays.toString(myNumbers));

	      
	        if (Arrays.equals(lotto, myNumbers)) {
	            System.out.println("당첨");
	        } else {
	            System.out.println("탈락");
	        }
	    }
	}
		 
	


                                                                                                                                                                                                                                                                                                                                                                                                