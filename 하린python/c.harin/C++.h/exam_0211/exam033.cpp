#include <iostream>

using namespace std;

int main() {
	//변수의 초기화
	int pizza{ 10 };
	cout << "피자의 갯수:" << pizza << endl;
	pizza = 5;
	cout << "바뀐 피자의 갯수:" << pizza<<"조각" << endl;
	return 0;
}