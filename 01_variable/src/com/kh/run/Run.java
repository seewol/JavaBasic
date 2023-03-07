package com.kh.run;

import com.kh.variable.C_Cast;

public class Run {
	
//	 기능 실행을 위한 메인 메서드 선언
	public static void main(String[] args) {
		
//		어디에 누구를 부를 건지 이곳에서 선언해야 함
//		클래스 → 메서드 순서로 꺼내서 호출해 오기
		
//		A_Variable av = new A_Variable();
//		import 必, 호출하고자 하는 클래스 위치를 알려주는 역할
//		import 단축키 ≫ ctrl + shift + o
//		＊A_Variable은 참조형, av는 변수가 됨
//		그러면 new A_Variable은 값이 되겠다
		
		/* 만약 다른 패키지에 속해있는 같은 이름의 클래스를 
		 * 부르고 싶다면 import문을 또 적는 것이 아니라,
		 * 클래스가 속한 패키지 명까지 기입해줘야 한다.
		 * com.kh.variable.A_Variable av
		 * = new com.kh.variable.A_Variable();
		 * (가독성을 위해 대입 연산자를 엔터로 구분했다)*/
		
//		av.declareVariable(); // 호출 시 ;로 마침
//		av 안에 '.' 있는 declareVariable 메서드 호출
		
//		System.out.println(); // 줄바꿈을 위해 추가
		
//		av.initVariable();
//		위에 쓴 클래스 호출 그대로 이용해 메서드 호출
		
//		B_Constant bc = new B_Constant();
//		bc.finalConstant();
		
		C_Cast cc = new C_Cast();
		cc.cast1(); // cc 안의 cast1을 호출함
		cc.cast2();
		
//		D_PrintMethod dp = new D_PrintMethod();
//		dp.printlnExample();
//		dp.printExample();
//		dp.printfExample();
	
//		E_keyboardInput eki = new E_keyboardInput();
//		eki.inputScanner1(); // eki 안의 inputScanner1을 호출
//		eki.inputScanner2();
		
//		E_keyboardInput_test ekt = new E_keyboardInput_test();
//		ekt.inputScannerTest();
		
	}

}
