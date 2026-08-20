#include <stdio.h>
//더블 포인터를 이용하여 num1 과 num2 에 들어있는 값 교환하기
void swapNumber(int** dptr1,int** dptr2) {
	int* temp=
	*dptr1 = *dptr2;
	*dptr2 = trmp;
	 

}
int main(void) {
	int num = 66, num2 = 99;
	int* ptr1 = &num1;
	int* ptr2 = &num2;

	printf("*ptr1:%d,*ptr2:%d\n", *ptr1, *ptr2);
	swapNumber(&pt1, &ptr2);
	printf("*ptr1:%d,*ptr2:%d\n", *ptr1, *ptr2);

	return 0;
}