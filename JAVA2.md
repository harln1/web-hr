#### 기본자료형은 맨 앞이 소뮨자 여야함
변수이름 사용 ㄱㄴ  _ , $ if X If O


## 기억하기
### 1. JRE(Java Runtime Environment)

- JRE는 말 그대로 자바 실행 환경을 의미한다.
- JVM + 자바 프로그램 실행에 필요한 라이브러리(API), 실행 관련 파일을 묶어놓은 환경이다.

### 2. JVM

- 자바 가상 머신(Java Virtual Machine)은 자바 프로그램이 실행될 수 있는 가상의 컴퓨터(가상 머신) 입니다.
- 자바 코드를 컴파일 하여 바이트 코드로 만들면 이 코드가 자바 가상 머신 환경에서 실행됩니다.
- 현재 사용하는 컴퓨터의 운영체제에 맞는 자바 실행환경(JRE)가 설치되어 있다면 자바 가상 머신이 설치되어 있다는 뜻입니다.

### 컴파일

- **사람이 작성한 코드를 컴퓨터가 이해할 수 있게 기계어(0과 1)로 변환하는 과정**이다.
- 컴퓨터는 사람이 쓰는 언어를 직접 이해하지 못한다.
- 실행 가능한 형태로 변환해야 프로그램이 동작한다.
- 문법 오류를 실행전에 찾는 역할도 한다.

### 바이트코드

- JVM이 이해하고 실행할 수 있는 중간 언어이다.
- **자바 코드를 적은 파일(확장자가 .java)를 컴파일 하면 .class 확장자의 바이트코드 파일이 생성**된다.
- 바이트코드는 CPU가 직접 실행하는 언어가 아니라 JVM이 읽어서 해당 운영체제에 맞는 기계어로 변환한 뒤 실행한다.

### 기계어

- CPU가 직접 이해하고 실행할 수 있는 언어이다.
- **0과 1로 구성된 이진수 명령어 형태**이며, 운영체제와 CPU구조에 따라 다르게 구성된다.

### JDK
환경변수 설정
1.전역 설정
[내PC] - [속성] 선택    [시스템] - [고급시스템 설정 ]클릭->
OR [시스템 환경 변수 편집]->
[시스템 속성] 창에서 [환경변수] 를 클릭
새로만들기 -> 이름 설정 -> 디렉터리 찾아보기 -> C ->JAVA->

자바 프로젝트 구성

SCR 폴더
- 소스코드가 저장되는 폴더
- 패키지 단위로 폴더가 만들어지고, 그 안에 파일이 위치한다
- 작성하는 모든 파일은 이곳에 저장된다

JRE Sustem Library
- 프로젝트 실행에 필요한 코드들의 묶음
- 기본적인 기능이 들어있다.
- 프로젝트 생성시 자동으로 추가된다

패키지
- 관련있는 클래스끼리 묶어놓는 폴더 개념
- scr폴더 안에 하위 폴더로 생성된다

클래스
- 자바 프로그램의 기본 구성 단위
- 자바에서 모든 코드는 반드시 클래스 블록( { } ) 안에 있어야한다

메서드
- 클래스 안에서 정의된 함수
- 기능

정수형(byte)
-byte = 1byte차지
1byte -> 8bit
 00000000->011111111
2의 0승 2의 1승 2의 2승 '''''2의6승
164+32+16+8+4+2+1=127을 1byte는 담을 수 있다

정수형 (short)
short = 2byte

정수형(int) 제일 많이쓴다!!!!
int = 4byte

정수형 (long) <int보다 크고  log을 쓸땐 뒤에 l,L을 붙여서쓴다)
long = 8byte

int var1 = 0b1011; 
맨앞 0b를 붙이면 2진수를 쓸수잇다
int var2 = 0206;
맨앞 0 만 붙이면 8진수를 쓸수잇다
int var3 = 365;
10진수
int var4 = 0xB3;
맨앞 0x를 적어야 16진수가 된다

-----------------------------------
2026.3.23
## java특징

(운영체제(하드웨어 와 소프트웨어 의 중간 역할을 하는 프로그램))
**1.운영체제에 구애 받지 않는다.**
- 한번만 작성하면(만들면) 어디서든 실행된다.

**2.객체지향 프로그래밍(OOP)**
object(객체)-oriented(지향) progtamming

**3.자동 메모리 관리**
메모리 -> 컴퓨터 RAM 부품
프로그램을 실행하면 메모리의 일정량을 차지한다.
프로그램 내부에서 사용되지 않는 것들을 자바가 알아서 제거(메모리 관리를 자바가 해준다.)

**변수 ** : 데이터를 담는 상자다
프로그램에서 데이터를 저장하기위해 메모리 공간에 이름을 부여한것


**자동 타입 변환**
1.작은자료형 -> 큰자료형
2.문자형데이터 -> 정수
		
	
**강제형변환(명시적형변환)**
ex>  	
        #long > int
	long var3 = 300;
	int var4 = (int)var3;

1.큰 자료형->작은자료형
2.정수->문자
**주의** 실수 -> 정수 실수를 정수로 바꿀때 소수점 아래의 값은 손실된다
		
자바는 실행 성능을 향상시키기 위해 컴파일 단계에서 연산을수행
	 컴파일 (이부분에서   )
자바코드 ->  (오류를 찾는다)바이트코드 -> JVM이실행 -> 결과가 출력

메서드(함수와 같은말임)
클래스 안에 정의된 함수


		//정수  	:%d (나이
		//실수	:%f (키
		//문자형	:%c
		//문자열 	:%s (이름,주소
		//논리형 	:%b

----------------------------------------------------
2026.3.24
클래스 안에 정의된 메서드를 사용하기 위해서는 객체를 생성해야한다
객체 생성법 : new 클래스명 ( );
int x = 100;
char c = 'a';
Scanner Sc = new Scanner( );

System.in =>키보드 입력을 받는 기본통로

package ex4_input;

** import java.util.Scanner;** //java.util 패키지에 있는 Scanner 클래스

public class SannerExample {
	public static void main(String[] args) {
		//클래스에 정의되어있는 기능을 사용하려면
		//클래스를 객체로 만드는 작업을 해야한다
		Scanner sc = new Scanner**(System.in)**;
		String name,address;
		int age;
		double height;
		
		System.out.print("이름 : ");
		name = sc.next();
		System.out.println("주소 : ");
		address = sc.next();

		//객체를 통해 클래스 안에 정의된 기능을 호출
		System.out.print("나이 : ");
		age = sc.nextInt();		
		System.out.print("신장 : ");
		height = sc.nextDouble();

		System.out.printf("당신의 이름은 %s 입니다\n",name);
		System.out.printf("당신의 주소는 %s 입니다\n",address);
		System.out.printf("당신의 나이는 %d세 입니다\n",age);
		System.out.printf("당신의 신장은 %.1fcm 입니다\n",height);
	}

}
 

 =  : 우변에 값을 좌변에 대입한다
int n1 = 10;
int n2 = 7;
복합대입연산자  : 산술연산자 + 대입연산자
+= , -= , *= , %= , /=

int x = 10;
x += 3;       // x = x+3 =>> x=10+3 =>>> x=13
System.out.println(x);

x -= 2; //x = x-2 =>> x= 13-2 =>>11
System.out.println(x);
x *= 5; //x = x * 5 =>> x= 11*5=>>>55


* 삼항조건연산자
boolea ? 피연산자 : 피연산자2
ex)
 int x = 10;
System.out.println(x>5? "크다" : "작다"); /x가 5보다 큰지? 맞으면 "크다" : 아니면 "작다"

int z = 10;
String result = x>5 ? "크다" : "작다";
System.out.println(result);
		
int a = 10;
int b = 15;
boolean result2 = ++a >= b ?  true: false;
System.out.println(result2);

//정수문자형 또한 가능하다
//삼항연산자의 중첩이 가능하다
int score = 85;

char grade = score > 90 ? 'A': score>80 ? 'B' : 'c'; 
//점수가 90보다 크니? 크면 A ,점수가 80보다 크니?B ,둘다아니면 C
System.out.println("성적 : " + grade);
	}
}

*  조건문 
 if 와 switch
1.단순 if문
if (조건식) { 조건식이 참일때 실행할 문장. } 

2.기본형
if (조건식) { 

} else{

}

2-2.기본형
if (조건식) { 

} else if{

}else if{

}else{
}

2.switch
== 만 사용가능

 switch (비교값){
case 조건값 : 멈췄을떄 실행할 문장
	breake;
case 조건값2:
	breake;
default :일치하는 조건이 없을때 실행됌


		
break 를 빼먹으면 fall-through 가 발생한다

int num = 2;
String result ;
switch(num) {
case 1:
result= "A";
break;
case 2:
//			result= "B";
//			break;
//		case 3:
//			result= "C";
//			break;
//		default: 
//			result= "D";
//			break;
			//=>  표현식 
		String result  = switch(num) { 
		case 1->"A";
		case 2 -> "B";
		case 3 -> "C";
		default -> "F";
		};
		System.out.println(result);
        훨신 짧고 간편하다



4.for문
package ex4_for;

import java.util.Scanner;

public class ForExample {
	public static void main(String[] args) {
		//지역변수 :특정 영역 내에서 만들어진 변수는 해당영역 내에서만 사용할 수 있음
		//안에서 만들어진 변수는 바깥에서 사용할수 없지만, 바깥에서 만든 변수는 안쪽애서 사용할ㅇ수있다
		for(int i = 1; i<=3 ; i++) {//1<=3 보다 작으니 i++ ,2<=3 작음 i++,3<=3같음 i++,4<=3 안작음 
			System.out.println(i+"");                 //3번 반복댐 = 1 , 2 ,3 이 결과로 나온다
			
		}
		
		
		System.out.println("-----------------------------");
		for (int i = 5; i>0 ;i-- ) {
			System.out.print  (i+"");
		}
		System.out.println("\n------------------------------");
		int sum = 0; //총합을담을변수
		for (int i = 1; i<10; i++) {
			sum += i; //sum = sum+i 가 10번반복
		}
		System.out.println("1~10 까지의 총 합: " + sum);
		System.out.println("\n-------------------------");
		
		//1부터 10까지 3의 배수만 출력하는 for문 작성하기
		for (int i = 1; i <= 10; i++) {
		    if (i % 3 == 0) { // i가 3의 배수라면
		        System.out.println("3의 배수: " + i);
		    }
		}
      
--------------------------
2025-03-25






