package ex2_annotaion.standard.custom;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*; 
//사용자 정의 어노테이션
//개발자가 직접 새로운 어노테이션을 만들어 코드에 의미를 부여한다

//메타어노테이션
//어노테이션을 만들때 함께 사용하는 어노테이션
//어노테이션을 설명하는 어노테이션
//@Target : 어디에 붙일수 있는지 정하는 것 
//타겟대상 : ElementType 열거형 값을 넣는다
//ElementType.TYPE : 클래스 , 인터페이스 ,enum등에 붙일수 있다(메서드는 안됌)
//ElementType.FIELD:필드에 붙일수 있다
//ElementType.PARAMETER:매개변수에 붙일수있다
//ElementType.CONSTRUCTOR :생성자에 붙일수있다
//TYPE_USE :타입이 붇는 모든곳

//@RETENTION 어노테이션 정보를 언제까지 유지할 것인지 정한다
//SOURCE 소스 코드에만 남기고 컴파일 후 사라진다
//CLASS 클래스파일엔 남지만 실행중에는 못 읽는다
//RUNTIME :실행중에도 읽을수 있다
@Target({TYPE, FIELD, TYPE_USE, METHOD}) 
@Retention(RUNTIME)
public @interface MyAnnotation {
    //어노테이션도 값을 가질수있다
	String value(); //메서드 처럼 보이지만ㅁ 어노테이션이 가지는 속성
	String name() default "홍길동";
	int age() default 0;
}
