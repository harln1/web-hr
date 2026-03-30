package ex3_access.package1; // 패키지 경로를 동일하게 맞춤

public class A {
    public int field1;     // 어디서든 접근 가능
    int field2;            // 같은 패키지(package1)에서 접근 가능
    private int field3;    // 오직 A 클래스 내부에서만 접근 가능

    public void method1() { }
    void method2() { }
    public void method3() { } // 존재하지 않던 method3 추가

    public A() {
        // 클래스 내부이므로 모든 필드/메서드 사용 가능
        field1 = 1;
        field2 = 2;
        field3 = 3;
        
        method1();
        method2();
        method3();
    }
}