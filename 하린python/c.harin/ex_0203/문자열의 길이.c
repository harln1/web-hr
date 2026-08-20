#include <stdio.h>
#include <string.h>

int main(void) {
	char str1[100];
	char str2[100];
	printf("문자열 1입력: ");
	fgets(str1, sizeof(str1), stdin);

	printf("문자열 2입력");
	fgets(str2, sizeof(str2), stdin);

	int len1 = strlen(str1);
	int len2 = strlen(str2);

	if (len1 > len2) {
		printf("%s\n %s\n", str1, str2);

	}
	else {
		printf("%s\n%s\n", str2, str1);
	}



	return 0;
}