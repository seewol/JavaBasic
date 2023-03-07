package com.kh.example.test.run;

import com.kh.example.test.controller.InheritanceTest;

public class Run {
	public static void main(String[] args) {
		InheritanceTest it = new InheritanceTest();
		it.method();
		
//		new InheritanceTest().method();
		// 하나만 실행하니까 변수 없이 한 줄로 만들어줌.
	}
}
