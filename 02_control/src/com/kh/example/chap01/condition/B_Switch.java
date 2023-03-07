package com.kh.example.chap01.condition;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class B_Switch {
	public void method1() {
		// 키보드로 입력한 숫자가 짝수인지 홀수인지 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		switch(num % 2) { // 일치하는 결과 값이 위치한 case로 이동
		case 0 :
			System.out.println("짝수입니다.");
			break;
		default : // case 1도 되지만 결과 값이 2개 뿐이라 이거 씀.
			System.out.println("홀수입니다.");
		} // 끝이라 break 생략 가능
		
//		Switch는 정수, 문자, 문자열만 결과 값으로 받을 수 있다.
//		boolean(true, false)는 결과 값으로 못 받기 때문에,
//		크고 작음을 비교할 수 없다. (비교 연산자 사용 못 함.)
	}
	public void method2() {
		// 키보드로 성별(M/F) 입력 받고, 여성인지 남성인지 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성별(M/F)를 입력하시오 : ");
		char gender = sc.nextLine().charAt(0);
		
		// 소문자 'm'과 'f'도 출력하고 싶다.
		// case도 묶어주고 싶다.
		
		String result = null;
		
		switch(gender) {
		case 'M' :
		case 'm' :
			result = "남성";
			break;
		case 'F' : case 'f' :
			result = "여성";
			break;
		default :
			result = "오타";
		}
		System.out.println(result + "입니다.");
		
	}
	public void method3() {
		// 이름을 입력받아 본인 이름이 맞는지 확인
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		switch(name) {
		case "박지은" :
			System.out.println("본인입니다.");
			break;
		default :
			System.out.println("본인이 아닙니다.");
		}
	}
	public void method123() {
		// 메뉴를 출력해봅시다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 짝수/홀수 판별");
		System.out.println("2. 남성/여성 판별");
		System.out.println("3. 이름으로 본인 판별");
		System.out.print("메뉴 번호 입력(숫자만) : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("1번 메뉴 : 짝수/홀수 판별입니다.");
			method1();
			break;
		case 2:
			System.out.println("2번 메뉴 : 남성/여성 판별입니다.");
			method2();
			break;
		case 3 : 
			System.out.println("3번 메뉴 : 이름으로 본인 판별입니다.");
			method3();
			break;
		default :
			System.out.println("메뉴 번호를 잘못 입력하셨습니다.");
		}
		
	}
	
}
