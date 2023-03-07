package com.kh.variable;

import java.util.Scanner;

public class E_keyboardInput_test {
	public void inputScannerTest() {
		// 이름, 나이, 주소, 성별 입력하기 (성별은 F/M)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		// 파싱 parsing은 문자열을 다른 기본형으로 바꿔주는 것.
		System.out.print("나이(숫자만)를 입력하세요 : ");
		String strAge = sc.nextLine();
		int age = Integer.parseInt(strAge);
		
		// 이제 문제 없이 nextLine()이 주소 데이터를 입력받을 수 있다.
		
		System.out.print("주소를 입력하세요 : ");
		String address = sc.nextLine(); // 자료형 변수 = 값
		
		// 성별을 받을 건데 한 글자로만 받고 싶어. char
		
		System.out.print("성별을 입력하세요(F/M) : ");
		String strGender = sc.nextLine();
		char gender = strGender.charAt(0);
		
		System.out.printf("%s(%d, %c) 님은 %s에 삽니다.", name, age, gender, address);
				
	}

}
