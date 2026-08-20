#include <stdio.h>

int add(int x, int y);//함수의 원형(선언부)



int main(void) {

	int result;
	//사용자 정의 함수 호출
	//함수를 호출할 때는 정의한 함수의 이름
	//매개변수의 개수만큼 인자를 전달 해야한다

	result = add(3, 5);
	printf("함수가 반환한 값:%d\n", result);

	return 0;
}
int add(int x, int y) {
	return x + y;
}