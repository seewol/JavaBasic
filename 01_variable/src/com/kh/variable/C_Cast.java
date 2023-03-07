package com.kh.variable;

public class C_Cast { // 클래스
	public void cast1() { // 메서드
		
		// A. 자동 형변환
		
		// ▼ 정수끼리의 자동 형변환
		byte bNum = 3;
		int iNum = bNum; // iNum은 저장 공간, bNum은 값
		// bNum은 1바이트, iNum은 4바이트 ≫ 자동 형변환 가능
		
		// ▼ 정수와 실수끼리의 자동 형변환
		float fNum = iNum;
		// 같은 4바이트지만 실수 float 범위가 더 넓다
		
		System.out.println("bNum = " + bNum);
		System.out.println("iNum = " + iNum);
		System.out.println("fNum = " + fNum);
		
		// ▼ 정수와 문자끼리의 자동 형변환
		int iNum2 = 'A';
		// 문자 A는 정수 65 ≫ 정수 65로 iNum2에 저장 (자동)
		char ch = 97;
		// 정수 97에 해당하는 유니코드 'a'가 ch에 저장
		
		System.out.println("iNum2 = " + iNum2);
		System.out.println("ch = " + ch);
		
		char ch2 = (char)iNum2;
		// iNum2에 정수 65가 저장되어 있기 때문에 형변환 필수
		// 또한 char에 int 저장은 자료형 타입이 맞지 않아 에러
		// 따라서 강제 형변환을 해 주어야 한다 ≫ (char)iNum2로

	}
	public void cast2() { // 다음 메서드
		
		// B. 강제 형변환
		
		int iNum = 10;
		long lNum = 100;
		
		// int result = iNum + lNum; ≫ 에러
		// long형을 int형에 저장할 수 없음
		// 따라서 int형으로 강제 형변환 후 저장해야 함
		// * 대입 연산자 오른쪽에서 왼쪽으로 저장됨
		
		// 방법 1. 수행 결과를 int형으로 강제 형변환
		int result = (int)(iNum + lNum);
		
		// 방법 2. long형 값을 int로 강제 형변환
		int result2 = iNum + (int)lNum;
		
		// 방법 3. 결과 값을 아예 long형으로 받기
		long result3 = iNum + lNum;
		
		System.out.println("result = " + result);
		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);
	
		
	}

}
