package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	public void method1() {
		// 입력한 정수 값이 1~100 사이의 숫자인지 확인하자.
		
		Scanner sc = new Scanner(System.in);
		// Scanner는 안내문을 꼭 써주자 (실행되는지 확인 겸)
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		boolean result = (num >= 1 && num <= 100);
		//				 (num > 0 && num < 101) 정수라 이것도 가능?
		System.out.println("입력한 정수 값이 1~100 사이 숫자입니까? " + result);

	}
	public void method2() {
		// 입력한 문자 값이 대문자인지 확인하자!
		// 대문자이면 true, 아니면 false
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영문자 하나 입력 : ");
		String str = sc.nextLine();
		char ch = str.charAt(0);
		
		boolean result1 = ch >= 'A' && ch <= 'Z';
		System.out.println("입력한 문자가 대문자입니까? : " + result1);
		
		// 입력한 문자 값이 Y 또는 y인지 확인
		
		char ch2 = sc.nextLine().charAt(0);
		System.out.println("계속 하시겠습니까? " + (ch2 == 'Y' || ch2 == 'y'));
	}
	
}
