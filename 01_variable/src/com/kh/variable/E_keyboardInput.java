package com.kh.variable;

import java.util.Scanner;

public class E_keyboardInput {
	public void inputScanner1() {
		
		// 이름, 나이, 키 입력 받기
		
		// ① Scanner 생성
		Scanner sc = new Scanner(System.in);
		// 사용자의 입력을 처리하는 클래스로 () 안에 System.in을 필수로 넣자.
		
		// ② import 작성 (패키지, 클래스 사이 위치)
		// Scanner가 어디에 위치해 있는지 찾아줘야 함
		// 먼저 작성해도 상관 없고, 스캐너 생성 후에
		// 단축키 ctrl + shift + o로 해도 상관 없다.
		
		System.out.print("이름을 입력하세요 : "); // 줄바꿈 안 됨
		
		// ③ 키보드 입력 값 받기
		// 이름을 입력받을 거니까 문자열 키보드 입력 값 받기
		String name = sc.nextLine(); // sc.nextLine();은 입력 받아올 수 있음
		// ★☆ 콘솔에서 입력받은 문자열 박지은이 sc.nextLine에 입력이 되고,
		// 대입 연산자로 인해 오른쪽은 왼쪽으로 저장되니까 name에 그 값이 저장된다.
		
		// Run으로 가자!
		
//		Run에서 실행시켰지만 아래 콘솔에 아무 것도 뜨지 않음
//		하지만 보면 Terminate (빨간 네모)가 활성화되어 있음 ≫ 대기 상태
//		아직 실행중이라는 뜻 ≫ 위의 문자열(값)을 입력받을 때까지.
		
//		아래 콘솔에 이름(문자열) 입력하고 엔터 하면 네모가 비활성화 됨
//		엔터를 치자마자 sc.nextLine();에 박지은이 저장됨
//		박지은을 받아온 후 날아감. (입력받기만 하고 저장은 하지 않음.)
		
//		▶ 따라서 변수에 저장해주어야 함.
//		문자열을 받는 변수 String를 선언하고 저장해보자!
//		≫ String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt(); // 정수 입력받을 거니까 int age라는 변수에 담기
		
		System.out.print("키를 입력하세요 : ");
		double height = sc.nextDouble();
		
		System.out.println(name + "님은 " + age + "세이며, " + "키는 " + height + "cm입니다.");
		
	}
	
	public void inputScanner2() {
		
		// 이름, 나이, 주소, 성별 입력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
//		int age = sc.nextInt();
		// nextInt() 다음에 nextLine() 쓰면 아무것도 안 뜬다.
		// ↑ 얘가 남기고 간 \n을 ↑ 얘가 읽어서 홀랑 없애기 때문.
		
		// ☆ 해결책
		// 1. 버퍼 안에 남아있는 줄바꿈(엔터 : \n) 제거
		// 2. age를 문자열로 받은 후 파싱 ★
		
		// [해결책 1]
		// sc.nextLine(); 버퍼에 줄바꿈 바꿔주는 역할
		
		// [해결책 2]
		String strAge = sc.nextLine();
		int age = Integer.parseInt(strAge);
		
		System.out.print("주소를 입력하세요 : ");
		String address = sc.nextLine();
		
		System.out.print("성별을 입력하세요(F/M) : ");
		String strGender = sc.nextLine();
		char gender = strGender.charAt(0);
		// 문자열 nextLine()으로 받아온 입력 값을 strGender에 저장 후,
		// 가리키는 문자열에서 n번째에 있는 문자를 char로 변환한다.
		
		System.out.printf("%s(%d, %c)님이 사는 곳은 %s입니다.", name, age, gender, address);
		
		// [해결책 3]
		// sc.next(); 문자형 입력 값, 띄어쓰기를 구분자로 인식함.
		// 서울시 은평구 → 서울시 만 읽어옴.
		
	}
	
}
