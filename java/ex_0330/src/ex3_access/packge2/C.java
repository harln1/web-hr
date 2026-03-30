package ex3_access.packge2;

import ex3_access.method.package1.A;

public class C {
	
	public C() {
		A a = new A();
		a.field1 = 1;
//		a.field2 = 1;
//		a.field3 = 1;
		
		a.method1();
//		a.method2();
//		a.method3();
	}

}

