package com.kh.variable;

public class A_Variable { // 클래스 영역
	public void declareVariable() { // 메서드 영역
//		메인 메서드가 아니기 때문에 실행될 수 없음
		
//		[변수 선언 후 초기화하기]
//		A. 변수 선언 : 메모리 영역에 공간 할당 ≫ 자료형 변수명;
//		1. 논리형
		boolean isTrue; // 기본값 false
//		2. 숫자형
//		2-1. 정수형
		byte bNum;
		short sNum;
		int iNum;
		long lNum;
//		2-2. 실수형
		float fNum;
		double dNum;
//		3. 문자형
//		3-1. 문자 (한 글자 이상)
		char ch;
//		3-2. 문자형 (0 글자 이상)
		String str;
		
		/* 메소드 영역에 변수를 만들어 놓으면
		 * 그 변수 안에 값을 한 번은 꼭 초기화(저장)해야 한다.
		 * 그래야 출력을 하는 등 사용할 수 있기 때문이다.
		 * ★ 지역변수(local variable)는 필수로 초기화
		 */
		
//		B. 변수 초기화(대입)
		
		isTrue = false;
		
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L;
		
		fNum = 4.0f;
		dNum = 8.0d; // d 생략 가능
		
		ch = 'A'; // 문자는 홑따옴표
		str = "ABC"; // 문자열은 쌍따옴표

		System.out.println("isTrue의 값 : " + isTrue);
		System.out.println("bNum의 값 : " + bNum);
		System.out.println("sNum의 값 : " + sNum);
		System.out.println("iNum의 값 : " + iNum);
		System.out.println("lNum의 값 : " + lNum);
		System.out.println("ch의 값 : " + ch);
		System.out.println("str의 값 : " + str);
		
		
		
	}
	
	public void initVariable() {
		
//		[초기화와 선언 동시에 하기]
		
		boolean isTrue = false;
		
		byte bNum = 1;
		short sNum = 2;
		int iNum = 4;
		long lNum = 8L;
		
		float fNum = 4.0f;
		double dNum = 8.0d;
		
		char ch = 'A';
		String str = "ABC";
		
		System.out.println("boolean의 값 = " + isTrue );		
		System.out.println("bNum의 값 = " + bNum );		
		System.out.println("sNum의 값 = " + sNum );		
		System.out.println("iNum의 값 = " + iNum );		
		System.out.println("lNum의 값 = " + lNum );		
		System.out.println("fNum의 값 = " + fNum );		
		System.out.println("dNum의 값 = " + dNum );		
		System.out.println("ch의 값 = " + ch );		
		System.out.println("str의 값 = " + str );		
		
	}
	
}
