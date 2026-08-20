#include <stdio.h>

//아무영역에도 속해있지 않은 변수
//프로그램의 모든 곳에서 사용가능한 전역변수 
int outer = 10;

 int main(void) {

	//특정영역 안쪽에서 선언된 변수는
	//선언된 영역 안쪽에서만 사용가능한 지역변수 이라고 한다
	int inner = 3;
	inner++;
	printf("%d\n", inner);
	inner++;

	//영역이 중첩됐을땐
	//바깥쪽 영역에 있는 변수는 안쪽 영역에서도 사용할 수 있다



	return 0;
}