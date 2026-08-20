#include <stdio.h>

int main(void) {
	int num = 999;
	int* ptr = &num;
	int** dptr = &ptr;
	int*** tptr = &dptr;

	//포인터들을 가지고 999 출력해보기
	printf(" % d % d % d % d\n", num,*ptr,**dptr,***tptr);

	return 0;
}