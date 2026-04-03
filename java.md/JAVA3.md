# 2026-03-26

### 이차원 배열
- 1차원 배열을 요소로 갖는 배열

#### 2차원 배열의 초기화

```java
int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};->3개의 요소를 갖고있다
```
#### 생성: 길이 2개 지정

```java
int test [][] =  new int[2][3]; //2:2차원배열의 요소의 갯수 //3 :1차원 배열의 요소의 갯수

ex)int [][] ar = new int [2][3]
->{{1,2,3},{4,5,6,}}
```

#### 배열의 공간에 접근하는법
```java
배열명 [요소의  index ] [1차원 배열의 index];
 System.out.println(arr[1][1]);

 System.out.println(arr[1][1]);
 

  //arr.length :2차원 배열의 길이
  //arr[i].length 해당 1차원 배열의 길이
  
  for (int i = 0; i < arr.length; i++) {
   for (int j = 0; j < arr.length; j++) {
    System.out.println(arr[i][j]);{
```     

### 향산된 for문
```java
for(자료형변수: 배열){
    실행코드
}
 ```


##  Arrays
- 배열의 기느을 더 쉽게 사용가능
- Arrays.함수명()

### 배열의 출력 
- **toString()** 
- 반복문의 도움 없이 배열의 모든 요소를 출력할 수 있도록 도와준다 
- 배열에 들어있는 모든 요소를 하나의 문자열로 묶어서 출력
```java
int[] arr= {1,6,3,7,8,9,10,2,4,5}
system.out.println(Arrays.tostring(arr))'
```

### 배열의 정렬
  //sort()
  //기본적으로 오름차순 으로 정렬이 된다
  System.out.println("정렬전 :"+ Arrays.toString(arr));
  
  Arrays.sort(arr);
  System.out.println("정렬후 : "+ Arrays.toString(arr));
  
  for(int i : arr) {
   System.out.print(i+ " ");//임시적이 아니라 아예정렬댐
  }
  
### 내림차순정렬

  //Comparator.reverseOrder();
  //기본 자료형 배열은 내림차림 할 수 없다
  //기본타입의 클래스형인 Wrapper클래스가 있다
  Integer[] arr2 = {1, 3, 4, 2, 5, 7, 6, 8, 9, 10};

  //Arrays컨트롤 엔터
  Arrays.sort(arr2, Comparator.reverseOrder());

  
  System.out.println(Arrays.toString(arr2)); 
  
### 배열의  복사

  /*
   * 배열은 한 번 생성하면 길이를 변경할 수 없다
   * 더 많은 데이터를 저장하거나 똑같은  배열을 새로 만드려면
   * 배열을 복사해야한다
   */
  int[] arr01 = {1,2,3};

#### 1.얉은복사 (Shalow Copy)

  //복사된 배열이나 원본 배열이 변경될때 서로 간의 값이 같이 변경된다(원본까지 변경됌)
  int[] arr02 = arr01;
  arr02[1] = 100;
  
  System.out.println("arr01[1]: " +arr01[1]);
#### 2.깊은 복사 (Deep Copy)]
  //복사된 배열이나 원본 배열이 변결될때 서로간의 값은 바뀌지 않는다 (원본 변경x)
  int [] cards = {1,6,4,5,3,2};
  int[] newCards = new int [cards.length];
  
#### 반복문을 이용한 깊은복사
  for (int i = 0; i< cards.length ; i++) {
   newCards[i] = cards[i];
  }
  int [] newCards2 = Arrays.copyOf(cards, cards.length);
  
  newCards[1]=100;
  System.out.println("card배열 : "+Arrays.toString(cards));
  System.out.println("newcard배열 : "+Arrays.toString(newCards));
  System.out.println("newcard2배열 : "+Arrays.toString(newCards2));
 
### 배열이 같은지 비교
  //equals()
  int [] arr1 = {1,2,3};
  int[] arr3 = {1,2,3};
  
  System.out.println("두 배열이 같은가? :"+Arrays.equals(arr1, arr3));
 }
}

## 열거형 

- 사용법
```java
package ex2_enum;

import java.util.Calendar;

// 1. 클래스 밖이나 안에서 'enum' 키워드로 정의해야 합니다.
enum Week {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class WeekExample {
 
 public static void main(String[] args) {
  
  열거형을 사용하는 이유
- 문자열로 상태를 관리하는 경우
 오타가나도 그냥 문자열 이기 때문에 프로그램은 일단 실행이 된다
 String status = "배송줭";
- 상태를 숫자로 관리하는 경우
  1이 주문 완료인지 ,배송중인지, 배송완료인지 관계자 외에는 알 수 없다


  int status =1;
  
  // 열거형을 사용하는 법 
  Week today = null; 
  
  //날짜 랑 시간 정보를  가진 객체이다.
  Calendar cal = Calendar.getInstance();
  
  //오늘의 요일을 얻는다(1~7)
  int weekNum = cal.get(Calendar.DAY_OF_WEEK);
  
  switch (weekNum) {
     case 1: today = Week.SUNDAY; break;
     case 2: today = Week.MONDAY; break;
     case 3: today = Week.TUESDAY; break;
     case 4: today = Week.WEDNESDAY; break;
     case 5: today = Week.THURSDAY; break;
     case 6: today = Week.FRIDAY; break;
     case 7: today = Week.SATURDAY; break;
 }
 if (today == Week.SUNDAY) {
    System.out.println("일요일엔 축구를 합니다");
  }else {
   System.out.println("열심히 자바를 공부합니다");
  }
  //열거형에 들어가는 값은 그냥 문자열이 아니라 week타입 안에 정의된 상수입니다
  //우리가 만드는 열거형도 하나의 타입 (자료형) ㅇ이라고 할 수 있다
  
  //상수들의 배열 (값을 바꿀수있는)
 }
}
  ```
## 객체 지향 프로그래밍

- 프로그램을 객체 단위로 나눠 설계하고 구현하는 방식
- 사용하지 않았을때의 문제:
  - 데이터와 기능이 따로논다,관리도 힘들고, 재사용도 힘들다

 ### 객체 지향의 4대특징: 
  **캡슐화** 
  - 데이터 동작을 하나로 묶고 실제 구현내용을 외부에 감추는것
  - 데이터를 보호하는 개념 필드에 직접 접근 못하게함
    - 필드는 제공된 메서드 통해서만 접근가능

  **상속**
  - 기존 클래스의 내용을 물려 받는 기능 (필드,메서드 )
    -언제쓸까?. 코드를 재사용할때 사용하면 좋음

  **다형성**(상속을 이해해야 함)
  - 하나의 타입으로 여러 객체를 다룰 수 있는 성질
  <부모가 여러개의 자식한테 물려줌,같은 가족인데 성격은 다름>
  <타이어 - 타이어마다 성능이 다르다>

  **추상화**(상속 이해 필요)
  - 클래스를 단순화 시키는 것



### 핵심개념

1. ### class
- 설계도 , 우리가 만든 참조 자료형
```java
public class Car{
public=접근제한자
class=클래스임
Car =클래스명

ex. int price;
   String color;
   String brand
필드(멤버) : 클래스를 통해서 만들어진 객체들이 가질 정보
}
```

 ### 객체
 ```java
 클래스명 변수명 = new 클래스명()

```
- class 를 통해 만들어 진 것
- 현실세계에서 표현할 수 있는 모든것
- 필드에 객체만의 정보를 넣거나 필드의 내용을 사용할 수 있다
```java
객체변수명.필드명
```
- 클래스에 정의된 기능을 호출하여 사용할수있다
```java
객체변수명.메서드명
```
- 현실세계의 객체를 소프트웨어 객체로 설계하는 것을 객체 모델링 이라고 한다
  #### 객체 모델링
  - 객체의 특징과 동작을 추려내서 소프트 웬어 객체의 필드와 메서드로 정의하는과정

#### 객체생성용 클래스
public class Car{
    속성 (필드)
    행위(메서드)
}
클래스 안에는이 두개만 들어갈수 있다 **꼭알아야함**
  - 필드: 객체가 가지는 정보(상태,속성) (이름,나이 키,몸무게 ...)
  - 메서드: 각 객체가 할수있는 동작 (공부,먹는다,잔다...)

#####  문제
배열에다 학생 객체 3개 넣기

 1. class 필드
- 설계도 , 우리가 만든 참조 자료형
```java
public class Car{
public=접근제한자
class=클래스임
Car =클래스명
```
--------------------------------
1. Student 필드
```java
package ex3_class;

public class Student {
 //필드 (학생이 가져야하는 정보)
 String name;
 int age;
 int score;
}
```
-------------------------------
2. StudentMain필드
```java
public static void main(String[] args) {

   {객체:클래스명 변수명 = new 클래스명()}
   Student minsu = new Student();
  
   minsu .name = "민수 ";
   minsu .age = 20;
   minsu .score = 100;
   Student gildon = new Student();
   gildon .name = "길동 ";
   gildon .age = 20;
   gildon .score = 100;
   Student yonghee= new Student();
   yonghee .name = "영희";
   yonghee .age = 20;
   yonghee .score = 100;

  따로따로  관리하기 힘드니깐
  배열은 같은 타입의 데이터만 넣을 수 있다 데이터의 타입은 배열앞에 명시한다
   Student[] students = {minsu,gildong,yonghee};

   System.out.println(students[0].name); //0번 = 민수.이름

       //배열에 들어있는 내용을 모두 출력하기 **반복문사용**
   for (int i = 0; i < students.length; i++) {
   System.out.println("이름: " +students[i].name);
   System.out.println("나이: " +students[i].age);
   System.out.println("점수: " +students[i].score);
   System.out.println("\n----------------------");
 }
}
```
# 2026-03-27
## 메서드
- 만들고 싶은 기능 , 자주사용하는 기능을 만드는 것
- 여러개 정의가 가능하다
### **retrun 밑에는 아무것도 없어야한다**
### 메서드 선언
```java
**외우기**
메서드 구조
접근 제한자 반환형 메서드명(매개변수){
    실행하고자 하는 명령
    return 반환값;
   }
```
  - 반환타입: 메서드를 호출하고 메서드는 블록안에 코드를 실행후 결과값을 반환(반환값이 없을때 void)

#### 메서드 명(함수명)
- 메서드 호출 할때 사용
  - 메서드의 호출: 
    - 객체x => 메서드호출 x 
    - 메서드 내부에서 메서드 정의x (호출은 가능)  메서드 외부에서 메서드 호출 불가능

#### 매개변수
- 메소드를 호출 할 때 전달한 매개값을 받기위해 사용
- 변수 = 지역변수(메모리 에서 stack영역에 만들어짐)
```java
ex)double divide(int x , int y){...}
               매개 변수 ,매개변수
```
#### 가변길이 매개변수
```java
int [] values 
```
### 메서드 오버로딩
 - 같은 이름을 사용하는다 다양한 매개값을 처리할수 있다.
    - 1. 매개변수의 개수가 달라야한다
    - 2. 개수가 같으면 타입이 달라야한다
    - 3. 개수와 타입이 같다면 순서가 달라야한다

 ```java
 ex)
 int plus (int x , int y){ //plus (이름)는/은 무조건 같게

 }
 double plus(double x , double y){

 }
 ```

##### 문제 1. "메서드가 호출되었습니다" 라고 출력되는  printInfo 메서드 작성해보기
```java
package ex1_method;
public class MethodExample {
 public void printInfo() {
  System.out.println("메서드가 호출 되었습니다");
 }

MethodMain클래스에서 출력해보기

public class MethodMain {
 public static void main(String[] args) {
  
  MethodExample m = new MethodExample();
  m.printInfo();
```
--------------------
문제 2. 두 수를 더하여 반환하는 add 메서드 작성
```java
package ex1_method;

public class MethodExample {
 public int add(int a, int b) { //반환할때의 타입 : z =>int
  return a+b ; //반환할때  return

  MethodMain클래스에서 출력해보기

  MethodExample a = new MethodExample();

  int result = m.add(10,7);
  System.out.println(result);
  ```
  --------------------------
  문제 3. 원의 넓이를 구하는 circleArea 메서드 작성하기 원의 넓이 :3.14 *반지름*반지름 반지름을 외부에서 받아서 넒이를 정하기
  ```java
  //1.메서드를 정의한다
 public double circleArea(double r) {//2외부에서 받을 값이 있으면.double r 매개변수 준비
  return 3.14*r*r; //3. 연산 결과를 보내줘야하면 return 계산 식 준비

    MethodMain클래스에서 출력해보기
    //1.객체가 정의되어야 한다
    MethodExample m = new MethodExample();
    
    m.circleArea(5); //5=인자
    
    System.out.println(return);
  ```
--------------------
문제 4. 원의 둘레를 구하는 circleRound메서드 정의 반지름은 외부에서 전달받는다
 //원의둘레 : 2*3.14*반지름
 //메서드 내부에서 둘레를 구하고 출력한 다음에 종료
```java
public void circleRound(double r2) {
  System.out.println( 2*3.14*r2);

  MethodMain클래스
m.circleRound(5);
```

## 생성자 
- 메모리에 객체를 올리는 역할
- 객체의 필드를 초기화 해주는 역할
### 기본생성자
- 반환타입 없다
- 생성자의 이름은 반드시 클래스명 
  - **생성자 이름**
  - 직관적인 이름 사용하기
  - 가능한 초기화 시킬 필드 명과 동일한 이름을 사용하는 것이 좋다

### 생성자의 오버로딩 (overloading)
- 같은 이름으로 서로 다른 개수, 타입의 매개변수를 각각 처리하는 방법
- 매개변수의 개수가 다르거나,타입이 다르거나,순서가 달라야한다
  - 반환형은 달라도 상관없음, 매서드(OR 생성자)명은 같아야한다
```java
ex)
<class>
public class Korean {

 //필드를 3개 갖고있음
 String nation = "대한민국";
 String name ;
 String ssn ;
 
 //생성자 선언 반드시 클래스랑 이름이 같아야한다
 public Korean(String name , String ssn) { 
  this.name = name; //필드명과 동일한 이름, 
  this.ssn = ssn; **필드와 지역변수를 구분하기 위해 this. 꼭 사용하기**
 }                  ㄴ>this: 이 메서드를 호출 한 객체 자신을 의미한다
 
 //객체의 정보를 출력하는 printInfo매서드 만들기
 //국적,나이,주민번호
 
 public void printInfo () {
  System.out.println("국적: "+nation);
  System.out.println("이름: "+name);
  System.out.println("주민번호: "+ssn);
  ---------------------------------
<main>
public static void main(String[] args) {

  Korean k1 = new Korean("박자바","011225-1234567");
   
  k1.printInfo();
```
## 인스턴스 멤버

### 정적맴버(static)
- 하나를 수정하면 공유하는 다른객체도 값이 바뀐다
```java
<class>
public class Calculator {
//static 키워드가 붙어있으면 메모리에 한번만 올라간다
 //모든 객체가 static필드의 값을 공유한다

 //원주율 파이 :3.141593
 static double pi = 3.141592;

 //외부에서 두 수를 받아 더하여 반환하는 plus 메서드 작성하기
 static public int plus(int x, int y) {
  return x+y;
  
 }
 //외부에서 두 수를 받아 더하여 반환하는 minus 메서드 작성하기
 static public int minus (int x, int y) {
  return x-y;
  ----------------------------------
  <main>
  public class calculatorMain {
 public static void main(String[] args) {
  //정적필드 , 정적 메서드는 객체 생성없이 호출가능하다
  //사용방법
  //클래스명.필드명
  //클래스명.메서드명();
  System.out.println(Calculator.pi);
  
  //클래스 객체 필드 메서드 생성자
```
### final 필드

- 초기값이 저장되면 이것이 최종적이 값이 됨(초기값이 저장되면 프로그램 도중 수정 불가)
# 2026-03-30

## 상수 final 
- 값을 넣은다음 변경 불가
```java
static final int FEE= 1000;(상수) FEE는 대문자로
```
## 패키지
- 단순히 클래스를 분리하는 용도가 아니라 클래스별 구분자 역할도 한다
  - 패키지도 **계층구조** 로 만들수 있다
  계층: 도트(.)을 기준으로 계층이 생긴다
  ex)com.kumho.Tire
  ex)com 
    ㄴkumho
      ㄴTire
    ㄴhankook
      ㄴTire
      보통은 회사 도메인 역순으로 패키지를 정한다
 
 클래스를 만들면서 다른 클래스를 필드로 사용할 수 있다
 - 결합도 :다른 파일이랑 코드의 연관 **최대한 낮추기**             
 - 응집도 : 하나의 파일 내에서 코드의 연관성 **최대한 높이기**

## 접근제한자
public : 모든접근허용 어디든지 사용가능
private : 같은 패키지 내 다른 클래스 어디든지 사용가능
protected: 현재 클래스 에서만 사용가능
default
필드,생성자,메서드,클래스에도 붙일수 있다

## 디자인패턴
- 객체를 하나만 만들어야하는 경우
- 객체 생성이 너무 복잡한 경우
- 기능은 비슷한데 구현 방법이 여러개인 경우
- 객체들끼리 너무 강하게 연결되어있어 수정이 어려운경우

=> 개발자들이 오랜시간 동안 많이 쓰인 설계방법을 정리해둔 것이 디자인 패턴
- 깔끔하게 코드를 작성할수있다

## 싱글톤 패턴
- 객체를 메모리에 한번만 올리고, 올라간 객체를 계속 사용하는 방식
1.생성자 private으로 정의 해서 외부에서 호출하지 못하도록한다
2.클래스 내부에서 static으로 객체를 하나 생성한다(private)
3.클래스 내부에서 만든 객체를 사용할 수 있도록 public으로 된 메서드를 만든다
- 

## 상속
- 부모클래스의 필드나 메서드를 자식 클래스에서 사용할 수 있는것
  - 관련 있는 것들 끼리 묶는것

자식 클래스가 상속받을 클래스를 고른다
ex)클래스명 extends 상속받을 클래스명{

}


# 2026-03-31

## 1. 상속과 매서드의 재정의 

### 오버라이딩(overriding)
- 메서드가 오버라이딩 되면 부모메서드 는 숨겨지고 자식 메서드가 우선적으로 사용
- 부모 클래스의 메서드와 이름, 매개변수 타입 및 개수, 리턴 타입이 모두 같아야 합니다.
```java
@Override -> 어노이테이션
컴파일러한테 오버라이드된 메서드 라고 알려주는 것
```

## 2.상속의 제약 (final & 접근 제한)

### final + 클래스
- 상속 불가능: final 클래스는 부모 클래스가 될 수 없습니다. 
```java
ex) public final class String
```
### final + 메서드
- 오버라이딩 불가 : 자식 클래스에서 이 메서드를 재정의할 수 없다.

### protected 접근제한자
- 같은 패키지 내의 클래스에서 접근 가능합니다.
- 다른 패키지라도 자식 클래스라면 접근할 수 있습니다. (상속 관계 필수)

## 3. 객체 참조 키워드 (this & super)

### this (나자신)
- 호출한 객체 자신
```java
this.필드명 
-> 인스턴스 필드와 매개변수 이름이 같을 때 구분하기 위해 사용

this() 
-> 같은 클래스 내의 다른 생성자를 호출할 때 사용
```
### super (부모님)

- 부모 객체를 가리킵니다.

```java
super.필드명 
-> 자식 클래스에서 부모 클래스의 필드를 사용하고 싶을 때 (이름이 같을 때 구분용)

super.메서드명() 
-> 오버라이딩으로 숨겨진 부모의 메서드를 강제로 호출할 때 사용.

super() 
->  부모 클래스의 생성자를 호출. 
  자식 생성자 첫 줄에 반드시 있어야 함 (생략 시 자동 추가).
```

## 4. 다형성의 핵심 (타입 변환)

### 자동타입변환
- 부모 타입에 선언된 기능만 쓸 수 있지만, 오버라이딩된 메서드는 자식 것이 호출됨. (다형성)
```
부모클래스 변수 = 자식객체;
```

### 강제타입변환
- 이미 자동 타입 변환된 객체를 다시 원래의 자식 타입으로 되돌릴 때만 사용 가능합니다.
```
자식클래스 변수 = (자식클래스) 부모타입객체;
```

### 객체 타입 확인 (instanceof)
- 강제 타입 변환을 하기 전의 안전장치입니다.
```
부모변수 instanceof 자식타입 (결과는 true/false)
잘못된 타입 변환을 시도하면 ClassCastException 에러가 발생하므로, 이 연산자로 체크하는 것이 좋습니다.
```

```java
ex) Parent p = new Child(); // 1. 자동 타입 변환
    p.parentMethod();       // 가능
    // p.childMethod();     // 불가능 (부모 타입이라 안 보임)

    if(p instanceof Child) { // 3. 타입 확인
    Child c = (Child) p; // 2. 강제 타입 변환
    c.childMethod();     // 이제 가능!
    }
```

# 2026-04-01

## Java 상속(IS-A)

### 1. IS-A 관계 (상속)
- "자식은 부모의 한 종류이다" (Dog is an Animal).
- extends 키워드 사용.
```java
SchoolBus sb = new SchoolBus();
System.out.println(sb instanceof Car); // true (SchoolBus는 Car이다)
```

### 2. N차 상속 (다단계)
- Car → Bus → SchoolBus
- 자식은 부모뿐만 아니라 조상의 필드와 메서드까지 모두 사용 가능.
```java
class Car { String power = "Engine"; }
class Bus extends Car { int seats = 40; }
class SchoolBus extends Bus { 
    // power(조상), seats(부모) 모두 사용 가능
}
```

### 3. Object 클래스
- 자바 모든 클래스의 최상위 조상.
- extends를 안 써도 자동 상속됨 (toString, equals 등 기본 제공).
### 4. Arrays.toString(배열)
- 배열의 주소값이 아닌 실제 데이터를 대괄호[] 형태로 출력할 때 사용.
```java
Object,Arrays.toString
int[] arr = {1, 2, 3};
System.out.println(arr);           // [I@... (주소값)
System.out.println(Arrays.toString(arr)); // [1, 2, 3] (실제 값)
```

### 5. Sealed & Permits (상속 제한)
- **sealed**: 클래스 봉인 (아무나 상속 불가).
- **permits**: 상속을 허용할 자식 클래스를 직접 지정.
- 허락받은 자식은 final, non-sealed, sealed 중 하나를 반드시 선언해야 함

```java
// Car는 Bus만 상속 허용
sealed class Car permits Bus { }

// 허락받은 Bus는 아래 3가지 중 하나로 선언 필수
final class Bus extends Car { }         // 더 이상 상속 불가
// non-sealed class Bus extends Car { } // 다시 누구나 상속 가능하게 개방
// sealed class Bus extends Car permits ... { } // 계속 봉인 유지
```

### 6.인터페이스
- 일반필드 X
- 상수 , 추상메서드 , 디폴트메서드, 정적메서드 , private메서드
  - 동작에 대한 가이드라인 제공
- 같은 범주에 있는 것들이 아니여도됌
```java
fly();
class Bird{};
class Airplane{};
```

- 추상 클래스와 마찬가지로 직접 객체를 만드는것이 불가능하다
- 인터페이스를 구현할 클래스가 있어야한다
```java
class Impl implements 인터페이스명{};
```
 

# 2026-04-02

## 1.인스턴스 멤버 클래스

- 바깥 객체가 있어야 생성이 가능하다.
```java
public class Outer{
 private String name; //필드

 //인스턴스 멤버 클래스
 public class Inner{
  private String name;
 }
}
```

### 인스턴스 내부 클래스

```java
package ex1_innerclass.instanceclass;

//1.클래스내부에서만 쓰는 전용 객체
//- 외부에 공개할 필요가 없는경우
public class Car {
 
 //인스턴스 내부 클래스
 private class Engine{
  void start() {
   System.out.println("엔진 시동");
  }
 }
 //Engine  클래스는 Car내부에만 의미가 있음 외부에 노출할 필요가 없음
 void run() {
  Engine engine = new Engine();
  -------------
  main
  public class Main {
 public static void main(String[] args) {
  Car c = new Car();
  c.run();//다른 사용자는 이 메서드를 실행만 할뿐 안에 어떻게 되어있는지 모른다
 }
 }

}
```
## 2.정적 멤버 클래스
- 내부클래스인데 Static이 붙은 형태
- 바깥 객체에 소속된 내부 클래스 처럼 보이지만,
  바깥 객체가 없어도 독립적으로 만들수 있는 내부클래스
```java
public class Outer {

 int a = 10; //일반필드(멤버변수)
 static int b = 20; //정적필드(클래스변수)
 
 static class Inner {
        void print() {
            // System.out.println(a); // [에러] static은 인스턴스 변수에 직접 접근 불가
            System.out.println(b);    // [성공] static 멤버끼리는 접근 가능
        }
  
        void print(Outer outer) {
            System.out.println(outer.a); // [성공] 전달받은 'user' 객체의 a를 출력
```
## 지역 내부 클래스
- 외부 클래스의 메서드 안에 선언되고, 그 메서드 안에서만 사용되는 클래스
```java
public class Outer {
 int num = 10;
 void method() {
  //지역내부클래스
  class Local{
   void print() {
    //바깥 클래스의 필드와 메서드를 사용할수있다
    System.out.println(num);
     }
  }
  Local local = new Local();
  local.print();

```

## 익명 클래스

- 말 그대로 이름이 없는 클래스를 말한다.
- 명시적으로 클래스를 선언하지 않기 때문에 쉽게 객체를 생성할 수 있다는 장점이 있다.
- 주로 **필드값, 로컬 변수 값, 매개변수값**으로  사용된다.
- 클래스를 상속해서 만들 경우 **익명 자식 객체**라고 한다.
- 인터페이스를 구현해서 만들 경우 **익명 구현 객체**라고 한다.

### 익명 자식 객체

- 익명 자식 객체는 부모 클래스를 상속받아 다음과 같이 생성된다.
- 이렇게 생성된 객체는 부모 타입의 필드, 로컬 변수, 매개변수의 값으로 대입할 수 있다.

```java
new 부모생성자(매개값,...){
 //필드
 //메소드
}
```

```java
package ch09.sec07.exam01;

public class Tire {
 public void roll() {
  System.out.println("일반 타이어가 굴러갑니다.");
 }
}
package ch09.sec07.exam01;

public class Car {
 //필드에 Tire 객체 대입
 private Tire tire1 = new Tire();

 //필드에 익명 자식 객체 대입
 private Tire tire2 = new Tire() {
  @Override
  public void roll() {
   System.out.println("익명 자식 Tire 객체 1이 굴러갑니다.");
  }
 };

 //메소드(필드 이용)
 public void run1() {
  tire1.roll();
  tire2.roll();
 }

 //메소드(로컬 변수 이용)
 public void run2() {
  //로컬 변수에 익명 자식 객체 대입
  Tire tire = new Tire() {
   @Override
   public void roll() {
    System.out.println("익명 자식 Tire 객체 2가 굴러갑니다.");
   }
  };
  tire.roll();
 }

 //메소드(매개변수 이용)
 public void run3(Tire tire) {
  tire.roll();
 }
}

package ch09.sec07.exam01;

public class CarExample {
 public static void main(String[] args) {
  //Car 객체 생성
  Car car = new Car();
  
  //익명 자식 객체가 대입된 필드 사용
  car.run1();
   
  //익명 자식 객체가 대입된 로컬변수 사용
  car.run2();
  
  //익명 자식 객체가 대입된 매개변수 사용
  car.run3(new Tire() {
   @Override
   public void roll() {
    System.out.println("익명 자식 Tire 객체 3이 굴러갑니다.");
   }
  });
 }
}

```

# 2024-04-03


