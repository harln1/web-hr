## 2026-03-26

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

- 객체들을 만들어서 프로그래밍을 하는 방식
 - 특징: 
  
  **캡슐화** 데이터 동작을 하나로 묶고 실제 구현내용을 외부에 감추는것
### 객체


- 현실세계에서 표현할 수 있는 모든것

현실세계의 객체를 소프트웨어 객체로 설계하는 것을 객체 모델링 이라고 한다

#### 객체 모델링



객체의 특징과 동작을 추려내서 소프트 웬어 객체의 필드와 메서드로 정의하는과정
```java
public class Car{
public=접근제한자
class=클래스임
Car =클래스명


 int price;
 String color;
 String brand
필드(멤버) : 클래스를 통해서 만들어진 객체들이 가질 정보

}
```

## 객체생성용 클래스
public class Car{
    속성 (필드)
    행위(메서드)
}
이 두개만 들어갈수 있다 **꼭알아야함**

