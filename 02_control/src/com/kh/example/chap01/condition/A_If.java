package com.kh.example.chap01.condition;

import java.util.Scanner;

public class A_If {
	public void method1() {
		// 키보드로 입력한 숫자가 양수인지 음수인지 출력하기
		
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하시오 : ");
		int num = sc.nextInt();
		
//		if(num > 0) {
//			System.out.println("입력한 숫자는 양수입니다.");
//		}
//		if(num < 0) {
//			System.out.println("입력한 숫자는 음수입니다.");
//		}
		
		// 위의 두 if문을 합쳐서 조건 2개로 작성해보자.
		
//		if(num > 0 ) {
//			System.out.println("입력된 숫자는 양수입니다.");
//		} else if(num < 0) {
//			System.out.println("입력된 숫자는 음수입니다.");
//		} else {
//			System.out.println("입력된 숫자는 0입니다.");
//		}
		
		// 0을 추가하고 싶다면?
		
		if(num > 0) {
			System.out.println("입력된 숫자는 양수입니다.");
		} else if(num == 0) {
			System.out.println("입력된 숫자는 0입니다.");
		} else { // else는 조건문 안 씀
			System.out.println("입력된 숫자는 음수입니다.");
		}
	}
	public void method2() {
		// 키보드로 입력한 숫자가 짝수인지 홀수인지 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 아무거나 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num + "은 짝수입니다.");
		} else {
			System.out.println(num + "은 홀수입니다.");
		}
	}
	public void method3() {
		// 키보드로 성별(M/F)를 입력받고 여성인지 남성인지 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성별을 입력하세요(M/F) : ");
//		String strGender = sc.nextLine();
//		char gender = strGender.charAt(0);
		char gender = sc.nextLine().charAt(0);
		
		// 소문자 m과 f도 포함시켜보자.
		
		if(gender == 'M' || gender == 'm') {// 하나만 true여도 true
			System.out.println("남성입니다.");			
		} else if (gender == 'F' || gender == 'f') {
			System.out.println("여성입니다.");
		} else {
			System.out.println("성별을 알 수 없습니다.");
		}
	}
	public void method4() {
		// 키보드로 성별(M/F)를 입력받고 여성인지 남성인지 출력
		// method3에서 반복됐던 System.out.println 모으기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성별을 입력하세요(F/M) : ");
		char gender = sc.nextLine().charAt(0);
		
		String result = ""; // String 타입의 메모리 공간에 값이 저장된 상태.
		// result라는 이름의 변수를 만든 상황
		// 참조 자료형에는 주소 값이 이미 있고, 기본 값(null)이 있다.
		if(gender == 'F' || gender == 'f') {
			result = "여성"; // 위에 만든 result에 초기화
		} else if (gender == 'M' || gender == 'm') {
			result = "남성"; // result에 다시 초기화
		} else {
			result = "오타"; // 변수의 특성을 이용해 재사용 중
		}
		
		System.out.println(result + "입니다.");
	}
	public void method5() {
		// 이름을 입력 받아 본인 이름이 맞는지 확인
		// 문자열 비교하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
//		if(name == "박지은") < 같은 의미지만, 문자열은 비교할 수 없다.
		if(name.equals("박지은")) { // 그래서 equals() 메소드를 활용!
			System.out.println("본인이 맞습니다.");
		} else {
			System.out.println("본인이 아닙니다.");
		}
		
		if(!name.equals("박지은")) {
			System.out.println("접근할 수 없습니다.");
			// 하나씩 풀어서 독해해보기.
		}
	}
	
}





