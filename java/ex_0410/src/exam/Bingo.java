package exam;

import java.util.*;

//빙고판의 생성 출력
public class Bingo {

	int[][] board = new int[5][5];

	public Bingo() {
		createBoard();
	}

	// 1~50사이의 난수가있다
		// 5*5의 빙고판에 25개의 숫자를 채운다
		// 겹치면 안됌

		// 만약 숫자가 오름차순으로 연속되게 나오면 섞어주기

		/*
		 * ex) 5 7 23 9 13 41 38 17 10 3
		 * 
		 */
	public void createBoard() {
		HashSet<Integer> set = new HashSet<>();
		// int[][] board = new int[5][5]; <- 이 줄을 지워야 멤버변수 board에 저장됩니다!

		while (set.size() != 25) {
			int rand = (int) (Math.random() * 50) + 1;
			set.add(rand);
		}

		List<Integer> list = new ArrayList<Integer>(set);
		Collections.shuffle(list);
		Iterator<Integer> iter = list.iterator();

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = iter.next();
			}
		}
		printBoard(); // 생성 후 초기 판 출력
	}

	public boolean markNumber(int number) { 
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == number) {
					board[i][j] = 0; // 맞춘 숫자는 0으로 변경
					return true;
				}
			}
		}
		return false;
	}

	// 현재 빙고판 상태 출력 메서드
	public void printBoard() {
		System.out.println("\n===== BINGO BOARD =====");
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 0) {
					System.out.print("XX "); // 0인 칸은 XX로 표시
				} else {
					System.out.printf("%02d ", board[i][j]);
				}
			}
			System.out.println();
		}
	}
	//빙고개수계산기능
	//현재 빙고판에서 완성된 빙고를 줄 수를 계산하는 countBingo()메서드 작성하기
	//빙고는 다음 기준으로 판단하시오
	//가로 5중 세로 5줄 대각선 2줄
	//총 빙고 개수를 int 로 반환하세요
	public int countBingo() {
		int totalBingo = 0;
		 for (int i = 0; i < 5; i++) {
		        int count = 0;
		        for (int j = 0; j < 5; j++) {
		            if (board[i][j] == 0) count++;
		        }
		        if (count == 5) totalBingo++;
		    }		   
		    for (int j = 0; j < 5; j++) {
		       
		    	 int count = 0;
		        for (int i = 0; i < 5; i++) {
		            if (board[i][j] == 0) count++;
		        }
		        if (count == 5) totalBingo++;
		    }	    
		    int diag1 = 0;
		    for (int i = 0; i < 5; i++) {
		        if (board[i][i] == 0) diag1++;
		    }
		    if (diag1 == 5) totalBingo++;	   
		    int diag2 = 0;
		    for (int i = 0; i < 5; i++) {
		        if (board[i][4 - i] == 0) diag2++;
		    }
		    if (diag2 == 5) totalBingo++;
		    return totalBingo;
		}
}