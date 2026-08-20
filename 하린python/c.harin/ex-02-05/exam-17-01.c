#include <stdio.h>

int main(void) {
    int num = 3;
    int* ptr = &num;  
    int** dptr = &ptr;  

   
    printf("%p %p %p\n", (void*)ptr, (void*)dptr, (void*)*dptr);
    //더블포인터를 가지고 3을 출력하기
    printf("%d\n", **dptr);
    ptr2 = *dptr; //ptr1이 저장하고있는 주소 (num의 주소)를 ptr2에 저장
    //ptr룰 통해 num의 값을 9로 바꾸고 dptr를 통해 출력하기
    *ptr2 = 9;
    printf("%d %d\n"num, **dptr);

    return 0;
}
