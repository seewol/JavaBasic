package com.kh.example.chap04_field.run;

import com.kh.example.chap04_field.controller.KindsOfVariable2;

public class Run {
	public static void main(String[] args) {
		
		KindsOfVariable2 v2 = new KindsOfVariable2();
		
		// static 변수 부르는 법
		
		KindsOfVariable2.staticNum = 10;
		
		v2.test();
		
		v2.test();
		
		KindsOfVariable2 v22 = new KindsOfVariable2();
		v22.test();
		
//		testNum : 11
//		staticTestNum : 11
//		testNum : 12
//		staticTestNum : 12
//		testNum : 11
//		staticTestNum : 13
	}

}
