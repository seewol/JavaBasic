package com.kh.operator;

public class A_LogicalNagation {
	
	// 논리 부정 연산자 !
	
	public void method() {
		System.out.println("true의 부정 : " + !true);
		System.out.println("false의 부정  : " + !false);
		
		boolean bool1 = false;
		boolean bool2 = true;
		
		System.out.println();
		
		System.out.println("bool1 : " + bool1); // false
		System.out.println("!bool1 : " + !bool1); // true
		System.out.println("bool2 : " + bool2); // ture
		System.out.println("!bool2 : " + !bool2); // false
		System.out.println("!!bool1 : " + !!bool1); // false
		System.out.println("!!bool2 : " + !!bool2); // true
		
	}

}
