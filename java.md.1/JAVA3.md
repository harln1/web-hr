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

  
   * 배열은 한 번 생성하면 길이를 변경할 수 없다
   * 더 많은 데이터를 저장하거나 똑같은  배열을 새로 만드려면
   * 배열을 복사해야한다
   
  int[] arr01 = {1,2,3};

#### 1.얉은복사 (Shalow Copy)

  - 복사된 배열이나 원본 배열이 변경될때 서로 간의 값이 같이 변경된다(원본까지 변경됌)
  - int[] arr02 = arr01;
    arr02[1] = 100;
  
  System.out.println("arr01[1]: " +arr01[1]);
#### 2.깊은 복사 (Deep Copy)]
- 복사된 배열이나 원본 배열이 변결될때 서로간의 값은 바뀌지 않는다 (원본 변경x)
- int [] cards = {1,6,4,5,3,2};
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

## 예외 처리 
### 1. 예외 처리의 3단계 구조 (try-catch-finally)
- 프로그램이 예기치 않게 멈추는 것을 방지하고 안전하게 종료하기 위한 기본 틀입니다.
- 키워드 역할 비유 특징
- **try** 감시 "사고 발생 주의" 예외가 발생할 가능성이 있는 코드를 배치합니다.
- **catch** 수습 "119 구조대" 발생한 예외를 잡아 처리합니다. (매개변수 e로 정보 확인)
- **finally** 마무리 "뒷정리" 무조건 실행. DB 연결 종료나 파일 닫기 등 자원 해제에 사용합니다.

#### 💡 핵심 포인트
- Exception e: 
  - 모든 예외의 조상님입니다. 어떤 에러든 다 잡을 수 있지만, 디버깅을 위해 구체적인 예외 타입을 쓰는 것이 좋습니다.
- 실행 흐름:
  정상: try → finally
  예외: try(중단) → catch → finally

### 2. 예외 던지기 (throws vs throw)
- 예외를 일부러 발생시키거나, 처리를 뒤로 미룰 때 사용합니다.

#### 🥊 throw (폭탄 던지기)
- 위치: 메서드 내부
- 용도: 특정 조건에서 개발자가 직접 예외를 발생시킬 때 사용합니다.
- 예시: throw new IllegalArgumentException("나이 오류");
#### 🔄 throws (폭탄 돌리기)
- 위치: 메서드 선언부
- 용도: "내 안에서 에러가 날 수 있으니, 나를 부르는 네가 처리해!"라고 예고합니다.
- 예시: public void read() throws IOException { ... }

#### 3. 사용자 정의 예외 (Custom Exception)
- 표준 예외(NullPointer 등) 외에 우리 프로그램만의 특별한 규칙(예: 잔액 부족, 아이디 중복)이 필요할 때 만듭니다.
- 제작 및 사용 순서
  클래스 생성: Exception(필수 처리) 또는 RuntimeException(선택 처리)을 상속받습니다.
  생성자 구현: 부모 클래스(super)에 에러 메시지를 전달합니다.
  사용: 조건문에서 throw로 예외를 던지고, 호출부에서 try-catch로 잡습니다.
```java
// 1. 커스텀 예외 정의
public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// 2. 사용 및 던지기
public void checkAge(int age) throws InvalidAgeException {
    if (age < 0) throw new InvalidAgeException("음수 나이 불가: " + age);
}
```

### 📝 한 줄 요약
"try-catch로 직접 고치거나, throws로 넘기거나, throw로 문제를 제기하라!"

## 2026-04-06

## lombok
1. lombok 구글검색
2. 다운로드
3. lombok를 이클립스 담겨진 파일에 넣기
4. 우클릭 -> 터미널열기
5. java -jar (파일명적기->)lombok.jar
6. Project Lombok 창 뜸 -> Specity location...눌러서 이클립스 (동그라미) 눌르기
-> 인스털트업데이트? 오른쪽꺼 누르기 ->끝 -> 이클립스 껏다 다시 켜기

1. 이클립스들가기
2. 프로젝트 만들고 프로젝트안에폴더 만들기-> 롬복 ctrl+c ,폴더만든거에 ctrl+v
3. 폴더 우클릭-> Build Path->Add to Build Path 클릭

### lombak  써보기

1. module ex_0406 {
 requires lombok;
}
3. 
@Setter
@Getter
@ToString:오버라이딩 기능을 제공
@NoArgsConstructor :기본생성자
@AllArgsConstructor:모든 필드(변수)를 매개변수를 갖는 생성자
@RequiredArgsConstructor : final또는 @NonNull이 붙은 필드만 매매변수로 갖는 생성자
@Data :Getter Setter, hashCode(),eqyaks(),toString() 메서드가 자돋으로 생성

## 운영체제와 사용자 정보 출력
main 안에
### 운영체제 이름
  String **osName** = System.getProperty("os.name");

### 사용자 이름

  String **userName** = System.getProperty("user.name");

### 사용자 홈 티렉터리 경로
  String userHome = System.getProperty("user.hjome");
  
출력하기.
  System.out.println(osName);
  System.out.println(userName);
  System.out.println(userHome);

## Math (수학 함수)
```java
Math.abs(-10);          // 10 (절대값)
Math.ceil(5.3);         // 6.0 (올림)
Math.floor(5.8);        // 5.0 (내림)
Math.round(5.5);        // 6 (반올림, 정수반환)
Math.max(10, 20);       // 20 (최대값)
Math.random();          // 0.0 ~ 1.0 미만 실수
// 공식: (int)(Math.random() * 개수) + 시작값
```

## 1. StringBuilder (문자열 수정)
- String과 달리 데이터를 계속 더해도 메모리 낭비가 없다.
```java
StringBuilder sb = new StringBuilder("Java");
sb.append(" Study");    // "Java Study" (뒤에 추가)
sb.insert(0, "Hi ");    // "Hi Java Study" (특정 위치 삽입)
sb.delete(0, 3);        // 인덱스 0~2 삭제
sb.reverse();           // 문자열 뒤집기
String result = sb.toString(); // 최종 String으로 변환
```

## 2. Wrapper 클래스 (기본타입 ↔ 객체)
- 주로 문자열을 숫자로 바꿀 때 사용한다.
```java
int num = Integer.parseInt("100");      // 문자열 -> int
double dNum = Double.parseDouble("3.14"); // 문자열 -> double

Integer obj = 10; // 박싱 (기본 -> 객체)
int val = obj;    // 언박싱 (객체 -> 기본)
```

## 1. 날짜/시간 (LocalDate, LocalTime, LocalDateTime)
### LocalDateTime
- 날짜와 시간을 읽고 조작하기 위해 사용
- 시간을 관리하는 자료형
- 객체를 직접 만들지는 않음
### LocalDateTime.now()
- 현재 날짜와 시간을 반환
- of(년 월 일 시 분): 특정날짜생성

  - getYrar()
  - getMonth()
  - getDayOfMonth()
  - getHour()
  - getSecond()

  - withYear()
  - withHour() 날짜나 시간을 수정하는것도 가능하다

  - isBefore()
  - isAfter()
  - isEqual()

  - LocalDate: 생일, 기념일 등 (시간 필요 없을 때)
  - LocalTime: 출근 시간, 알람 등 (날짜 필요 없을 때)
  - LocalDateTime: 게시물 작성 시각, 로그 기록 등 (둘 다 필요할 때)
  - ChronoUnit: 디데이(D-Day)나 근속 연수 계산할 때

```java
LocalDate.now();              // 날짜 (2024-05-20)
LocalTime.now();              // 시간 (14:30:15)
LocalDateTime now = LocalDateTime.now(); // 날짜+시간

now.getYear();                // 연도 추출
now.plusDays(10);             // 10일 뒤 (새 객체 반환)
now.withMonth(12);            // 12월로 변경 (새 객체 반환)

// 포맷 적용
DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
now.format(fmt);
```
#### 날짜 차이 계산하기 (ChronoUnit)
isBefore, isAfter는 선후 관계만 알 수 있지만, "정확히 며칠이나 차이 날까?"가 궁금할 때 자바에서는 ChronoUnit을 씁니다.
```java
LocalDateTime start = LocalDateTime.of(2024, 1, 1, 0, 0);
LocalDateTime end = LocalDateTime.now();

// 두 날짜 사이의 '일'수 차이 계산
long daysBetween = ChronoUnit.DAYS.between(start, end);
// 두 날짜 사이의 '개월'수 차이 계산
long monthsBetween = ChronoUnit.MONTHS.between(start, end);

System.out.println("D-Day: " + daysBetween);
```
## 1. 정규표현식 (Regex)
- 문자열이 형식이 맞는지 검사할 때 사용한다.

```java
String str = "java123";
String regExp = "^[a-z][a-z0-9]{4,11}$"; // 소문자시작, 숫자혼용, 5~12자

boolean isMatch = str.matches(regExp); // true/false 반환
```
a-z:소문자
A-Z:대문자
0-9:0부터9까지
? :없거나 한개
+ :한개거나 이상
[]:안에 적힌것중 한개 ex)[abc]->a,b,c중 한글자
[가-힣] : 한글전체
^[0-9]+$ : 숫자만 (1개 이상)
^[a-zA-Z]+$ : 영문자만
\\d : 숫자 ([0-9]와 같음)
\\w : 알파벳+숫자
```java
 이메일 형식 검사
  아이디부분 : 영문,숫자,_
  도메인포함
  예시 : test01@gmail.com

  str= "test01@gmail.com";
  regExp = "[a-zA-Z0-9]+@[a-z0-9]+.[a-z]{2,}";
       
   System.out.println(str.matches(regExp));

```

# 2026-04-07

## 1. StringTokenizer (문자열 분리)
- split() 메서드와 비슷하지만, 구분자가 많거나 성능이 중요할 때 더 유리합니다.
- countTokens(): 현재 남아있는 토큰(단어)의 개수를 반환합니다.
- hasMoreTokens(): 꺼낼 토큰이 더 있는지 확인(T/F)합니다. 주로 while문과 함께 씁니다.
- nextToken(): 다음 토큰을 하나씩 꺼내옵니다.

## 2. Wrapper 클래스 (기본 타입을 객체로!)
- int, double 같은 기본형 데이터를 Object처럼 객체로 다뤄야 할 때 사용합니다.
- Integer, Double, Character,Character :문자형
- Parsing: Integer.parseInt("10")처럼 문자열을 숫자로 바꿀 때 가장 많이 씁니다.
- Box/Unbox: 숫자 10을 Integer 객체로 자동으로 바꿔주는 기능(Autoboxing) 덕분에 요즘은 편하게 섞어 씁니다.
```java
int → Integer (Full name)
char → Character (Full name)

박싱(Boxing) & 언박싱(Unboxing):
Integer num = 10; (기본형을 객체로 자동 변환 - 오토박싱)
int n = num; (객체를 기본형으로 자동 변환 - 오토언박싱)
요즘 자바는 이 과정을 자동으로 해주기 때문에 마치 같은 타입처럼 섞어서 쓸 수 있습니다.
```
## 3. Math 클래스 (수학 계산)
- System 클래스처럼 모든 메서드가 static이라 객체 생성 없이 바로 씁니다.
- Math.abs(): 절대값
- Math.max(a, b) / min(a, b): 최대/최소값
- Math.random(): 0.0 ~ 1.0 사이의 난수 발생 (가장 활용도 높음)
- Math.round(): 반올림

## 4. Arrays 클래스 (배열 도우미)
- 배열을 직접 반복문 돌려 처리하기 귀찮을 때 씁니다.
  - Arrays.sort(): 배열을 순식간에 오름차순 정렬해줍니다.
  - Arrays.toString(): 배열 안의 내용을 한눈에 보기 좋게 [1, 2, 3] 형태로 출력해줍니다.

## 리플렉션
- 메타정보를 `class객체` 로  관리한다

## 제네릭타입
```java
package ex3_generic;

public class GenEx<T> {

 //제네릭타입의 변수 value;
 T value;
 //value 값을 반환하는 getValue();
 public T getValue() {
  return value;
 }
 //value값을 세팅하는 setValue();
 public void setValue(T value) {
  this.value = value;
 }
}
--------------------------
package ex3_generic;                                                                      
public class Main {
 public static void main(String[] args) {
  GenEx<String> v1 = new GenEx<String>();
  
  v1.setValue("Java");
  System.out.println(v1.getValue());
  
  //제네릭 타입이 정수인객체 v2
  //값 넣고 출력
  GenEx<Integer> v2 = new GenEx<Integer>();
  v2.setValue(123);
  System.out.println(v2.getValue());
  
  //제네릭 타입이 문자형인 객체v3
  GenEx<Character> v3 = new GenEx<Character>();
  v3.setValue('A');
  System.out.println(v3.getValue());
  
 }
```

# 2026-04-08

## 일반 객체의 생성
- Car car = new Car(); >>컴파일 시점에 클래스가 확정
- Class clazz = Class.forName("클래스명"); >> 실행중에 클래스 결정이 가능

언제 사용할까?
  - 플러그인 : 기본 프로그램에 외부 기능을 끼워넣는 것 (롬복 추가 와 비슷,도움이되는 외부기능을 따로 설치해서 추가하는 느낌)
    - 메인 프로그램 : 이미지 편집기
    - 외부 플러그인 : 흑백필터 , 블러필터 , 선명한필터

LOG(로그):프로그램이 실행 되면서 남기는 기록
- 사용자가 로그인을 시도했을때
- 주문내역을 저장했을때
- 에러가 발생했을때 

## 어노테이션

### 메타 어노테이션 (Meta-Annotation)
- @Retention: 어노테이션이 언제까지 살아남을지(유지 범위) 결정합니다.
  RetentionPolicy.SOURCE: 소스 코드에만 있고 컴파일 시 사라짐.
  RetentionPolicy.CLASS: 클래스 파일까지는 남지만 실행 시에는 참조 불가.
  RetentionPolicy.RUNTIME: (가장 많이 사용) 실행 중(Runtime)에도 리플렉션을 통해 정보를 읽을 수 있음.
- @Target: 어노테이션을 어디에 붙일지(적용 대상) 결정합니다.
  ElementType.TYPE: 클래스, 인터페이스, Enum.
  ElementType.FIELD: 변수(필드).
  ElementType.METHOD: 메서드.
### 2. 나만의 어노테이션 (Custom Annotation)
- 직접 만들 때는 @interface를 사용하고, 위에 공부한 메타 어노테이션을 붙여줍니다.
```java
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // 실행 중에도 읽을 수 있게 설정
@Target(ElementType.METHOD)        // 메서드에만 붙일 수 있게 설정
public @interface MyAnnotation {
    String value() default "기본값"; // 속성을 정의할 수 있음
    int count() default 1;
}
```
### 제네릭
- 타입을 미리 고정하지 않고 나중에 정할수 있게 만드는 문법
- 어떤 타입이든 담을수 있는 틀을 만든뒤, 사용할때 타입을 정하는 방식이다.

# 2026-04-09
## List 컬렉션의 2가지 핵심 특징
- 순서 유지: 데이터를 넣은 순서대로 저장되며, 인덱스(0, 1, 2...)로 접근할 수 있습니다.
- 중복 허용: 동일한 값(객체)을 여러 번 저장할 수 있습니다.

## 🛠️ 꼭 외워야 할 주요 구현체 (Class)
- 가장 많이 쓰이는 두 가지를 상황에 맞춰 골라 써야 합니다.
- `ArrayList`: 가장 대중적,  내부적으로 배열을 사용하여 데이터 검색이 매우 빠름, 하지만 중간에 데이터를 넣거나 뺄 때는 뒤의 데이터를 밀거나 당겨야 해서 속도가 느려질 수 있습니다.
- `LinkedList`: 데이터들이 서로 앞뒤로 연결된 형태입니다. 추가나 삭제가 빈번할 때 유리하지만, 특정 데이터를 찾는 검색 속도는 ArrayList보다 느립니다.

## 📝 자주 쓰는 필수 메서드 (암기 추천)
`1. add (넣고)`
`2. get (꺼내고)`
`3. size (몇 개지?)`

- **add(E e)**: `<추가>` 데이터를 리스트 맨 끝에 넣을 때
  `list.add("데이터");`
- **add(int index, E e)**: `<중간 삽입>` 원하는 특정 위치(인덱스)에 데이터를 끼워 넣을 때
  `list.add(1, "새 데이터"); (1번 자리에 삽입, 뒤는 밀려남)`
- **set(int index, E e)**: `<치환>` 특정 위치의 데이터를 다른 데이터로 바꿀 때
  `list.set(0, "바꿀 데이터"); (0번 자리를 덮어씀)`
- **get(int index)**: `<반환/가져오기>` 특정 위치에 있는 데이터를 꺼내서 볼 때
  `String value = list.get(2); (2번 자리 데이터 읽기)`
- **remove(int index)**: `<삭제>` 특정 위치의 데이터를 지울 때
  `list.remove(0); (0번 데이터 삭제, 뒤는 당겨짐)`
- **clear()**: `<전체 삭제>` 리스트 안의 모든 데이터를 한꺼번에 지울 때
  `list.clear();`
- **size()**: `<크기 확인>` 리스트에 데이터가 총 몇 개 들어있는지 확인할 때
  `int count = list.size();`
- **contains(Object o)**: `<검색>` 리스트 안에 특정 데이터가 들어있는지 확인할 때 (T/F)
  `boolean hasData = list.contains("데이터");`

```java
package ex1_List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
 
 public static void main(String[] args) {
  List<String> list = new ArrayList<String>();
  
  //리스트에 데이터 추가(add)하기
  list.add("A");
  list.add("B");

  if (list.add("C")) {
   System.out.println("데이터가 정상적으로 추가 되었습니다");
  }else {
   System.out.println("데이터가 정상적으로 추가 되지않았습니다");
  }

  //내가 원하는위치에 데이터넣기
  list.add(1,"데이터"); //1번자리에 데이터 들어감 [A, 데이터, B, C]
  
  //데이터 값 바꾸기 (set)
  list.set(1,"D");//[A, D, B, C]
  
  //리스트에 들어있는 데이터를 하나만 꺼내기
  String s = list.get(0);
  System.out.println(s);//A
  
  //리스트의 출력
  System.out.println(list);
 }

}
```
# 2026 - 04- 10

## 컬렉션 프레임 워크
- 프레임워크 : 인터페이스나 클래스를 준비해놓고 사용하는것
### 인터페이스
- 상수
- 추상메서드
#### list인터페이스
- 순서가 있다 (index가 존재한다)
- 중복이 가능하다
- 넣는대로 들어간다
- ArratList(>>대표적이 List인터페이스를 구현한 클래스), LinkesLise...

## 1. Set
- Set은 수학의 집합과 같습니다.
- 중복 불가: 똑같은 데이터를 두 번 넣어도 하나만 저장됩니다.
- 순서 없음: 넣은 순서대로 나온다는 보장이 없습니다.(index가 없기 때문에) 
  (주머니에 마구 집어넣는 느낌)
- HashSet: Set인터페이스를 구현한 대표적인 클래스
## 2.Map
- 인터페이스가 별도로 존재
- key,value로 구문하여 저장하는 방식을 사용함

## 1. TreeSet (Tree 구조의 Set)
TreeSet은 Set의 성질을 그대로 가지면서 자동 정렬 기능이 추가된 클래스입니다.
자동 정렬: 데이터를 넣자마자 오름차순(기본값)으로 정렬됩니다.
검색 최적화: 이진 검색 트리(Binary Search Tree) 구조를 사용해 특정 값을 찾는 속도가 매우 빠릅니다.
주요 메서드 (TreeSet 전용):
first(): 가장 작은 값 (맨 앞)
last(): 가장 큰 값 (맨 뒤)
higher(value): 입력값보다 큰 값 중 가장 가까운 값
lower(value): 입력값보다 작은 값 중 가장 가까운 값

## 반복자(Iterator)
- 컬렉션 객체를 순회하면서 하나씩 꺼내거나 / 지우는 기능
- Set은 index 가 없는 컬렉션에서 데이터를 하나씩 꺼내줄 수 있는 방법
- 반복자 객체는 컬렉션 객체로부터 iterator() 메서드르르 사용해 생성이 가능하다
List<Integer> list = new ArrayList();

list.iterator();

hasNext(): 
- 다음에 출력할 요소가 있으면 true 아니면 false
- 결과가 t/f 로 나온다는 것은 조건식(if),반복문의 조건에 들어갈수있다
   - next() :컬렉션에서 요소를 하나 반환

향상된 for문도 내부에서 반복자를 기반으로 동작을 한다
 
### 1. Iterator의 핵심 메서드
hasNext(): 꺼낼 다음 요소가 남아있는지 확인 (있으면 true, 없으면 false)
next(): 다음 요소를 실제로 꺼내오기
remove(): next()로 꺼낸 요소를 컬렉션에서 삭제

# 2026 - 04 -13

## Map인터페이스
- Key와 Value가 한쌍으로 하나의 데이터로 저장된다는 것
- Hash Map  : Map 인터페이스를 구현한 대표적인 클래스
- put(key,value); :데이터의 삽입
    - ㄴ>없으면 추가 , 있으면 value의 갱신이 일어남
- get(Key):해당 key와 연결된 value값을 반환
- getOrDefalult(Key, default): 해당 key의 value 가 있으면 반환,없으면 default값을 반환
- remove(key):map에 들어있는 데이터를 삭제
- size() :컬렉션의 크기를 반환
- isEmpty() :컬렉션이 비어있는지 검사
- containskey(key):해당key가 포함되어있는지 검사
- containsValue(value):해당 value가 포함되어 있는지 검사

- keySet():map에 들어있는 모든 key만 추출하여 Set 에 저장
- values():map에 들어있는 모든 value들만 가져오기
- entrySet():map에 들어있는 데이터를 하나씩 꺼내서 Set에 저장

## 람다식 (lambda expression)

### 람다식 (lambda expression)장점
1. 간단하게 작성할수있다

### 람다식 기본 문법
- 반환타입과 메서드명은 제거
  - (매개변수)->{실행문}
### 생략법
1. 매개변수의 타입을 생략할 수 있다
    - 매개변수가 두개 이상일때 타입을 둘 다 생략해야한다
2. 매개변수가 1개 일땐 소괄호 생략 가능
    - (X)->{return x;};
    - x -> {returnx;};
     ㄴ> 2개 이상일 때는 안됌, 하려면
      타입을 전부다 생략 하고 소괄호는 생략 불가능함
      
      반환할 값이 없고 명령이 1줄 이면 중괄호 생략이 가능하다

      명령이 1줄이고 return과 중괄호를 같이 생략 할 수 있다

      함수식을 변수에 담을 수 있다

     
