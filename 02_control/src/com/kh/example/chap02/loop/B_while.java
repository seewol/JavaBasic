package com.kh.example.chap02.loop;

import java.io.StreamCorruptedException;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

public class B_while {
	public void method1() {
		// 1부터 5까지 출력하기
		// for문으로 먼저 한 번 출력해보기
		
//		for(int i = 1; i <= 5; i++) {
//			System.out.println(i);
//		}
		
		int i = 1;					// 초기식
		while(i <= 5) {				// 조건식
			System.out.println(i);	// 수행할 문장
			i++;					// 증감식
		}
	}
	public void method2() {
		// 5부터 1까지 출력하기
		
		int i = 5;
		while(i >= 1) {
			System.out.println(i);
			i--;
		}
	}
	public void method3() {
		// 정수 두 개를 입력 받아 그 사이 숫자를 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 두 개를 입력합시다.");
		System.out.println("단, 첫 번째 숫자가 두 번째 숫자보다 작아야 합니다.");
		System.out.print("첫 번째 숫자 : ");
		int start = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int end = sc.nextInt();
		
		// 숫자를 서로 반대로 입력할 경우도 고려하자.
		
		int min = 0;
		int max = 0;			// 초기식
		
		if(start > end) {
			max = start;
			min = end;			// 오른쪽 값이 왼쪽 변수로 대입!
		} else {
			min = start;		// 조건을 설정해 줌.
			max = end;
		}
		
		while(min <= max) {		// 조건식 (참일 때 수행, 거짓이 되면 멈춤)
			System.out.println(min);
			min++;				// min이 max가 될 때까지 1씩 증가해 출력.
		}
	}
	public void method4() {		
		// 1부터 10 사이의 임의 난수를 정하자.
		// 그리고 1부터 난수까지의 정수 합을 도출하자.
		
		int random = (int)(Math.random() * 10 + 1);
		
		int sum = 0; // 합을 더할 공간
		
		int i = 1;		// 초기식
		while(i <= random) { // 조건식
			sum += i;	// 누적 합 구하기 : sum = sum + i
			i++;		// 증감식
		}
		System.out.println("1부터 " + random + "까지의 합 : " + sum);
	}
	public void method5() {
		// 문자열을 입력 받아 인덱스 별로 문자 출력
		// 문자열 입력 : apple
		// 0 : a
		// 1 : p
		// 2 : p		제로인덱스는 0부터 시작
		// 3 : l
		// 4 : e
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();

		for(int i = 0; i <= 4; i++) {
			char ch = str.charAt(i);
			System.out.println(i + "는 " + ch);
		}
	}
	public void method5_1() {
		// method5에 length() 사용하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();

		int length = str.length();
		
		for(int i = 0; i < length; i++) { // 왜 < 냐면 인덱스는 0부터니까.
			char ch = str.charAt(i);
			System.out.println(i + " : " + ch);
		}
	}
	public void method5_2() {
		// method5_1 압축하기.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();

		// 문자열의 길이(글자수)를 반환한 만큼 돌리겠다는 소리.
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i); // 문자열에서 
			System.out.println(i + " 는 " + ch);
		}
	}
	public void method6() {
		// 위 메소드들을 토대로 switch를 사용해 메뉴 만들기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 1~5 출력");
		System.out.println("2. 5~1 출력");
		System.out.println("3. 두 개의 정수 사이 숫자 출력");
		System.out.print("메뉴 번호를 선택하시오 : ");
		int menu = sc.nextInt();
		
		// 조건식 결과 값 : 정수, 문자, 문자열
		switch(menu) {
		case 1 : method1(); break;
		case 2 : method2();	break;
		case 3 : 
			method3(); 
			break;
		default :
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	public void method6_1() {
		// 종료 버튼을 추가했음.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 1~5 출력");
		System.out.println("2. 5~1 출력");
		System.out.println("3. 두 개의 정수 사이 숫자 출력");
		System.out.println("9. 종료");
		System.out.print("메뉴 번호를 선택하시오 : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1 : method1(); break;
		case 2 : method2(); break;
		case 3 : method3(); break;
		case 9 : System.out.println("종료합니다."); break;
		default : System.out.println("잘못 입력했습니다.");
		}
	}
	public void method6_2() {
		// 한 번 실행하고 끝나니까 종료하고 싶을 때까지 반복하고 싶음
		// (몇 번 반복할 지 횟수는 모름 → while문)
		Scanner sc = new Scanner(System.in);
	
		int menu = 0; // 변수 선언 (초기식)
		
		while(menu != 9) {	// 9. 종료 아니면 계속 반복
			System.out.println("1. 1~5 출력");
			System.out.println("2. 5~1 출력");
			System.out.println("3. 두 개의 정수 사이 숫자 출력");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호를 선택하시오 : ");
			
			menu = sc.nextInt();	// 정수 입력 받기.
			
			switch(menu) {
			case 1 : method1(); break;
			case 2 : method2(); break;
			case 3 : method3(); break;
			case 9 : System.out.println("종료합니다."); break;
			default : System.out.println("잘못 입력했습니다.");
			}
		}
	}
	public void method7() {
		// return 사용해 종료하도록 하기.
		
		Scanner sc = new Scanner(System.in);
		
		// 무한 반복문이 된다. → 무조건 true이므로 for(;;)과 같다.
		while(true) {
			System.out.println("1. 1~5 출력");
			System.out.println("2. 5~1 출력");
			System.out.println("3. 두 개의 정수 사이 숫자 출력");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호를 선택하시오 : ");
			
			int menu = sc.nextInt(); // 다시 자료형 선언해줌.
			
			switch(menu) {
			case 1 : method1(); break;
			case 2 : method2(); break;
			case 3 : method3(); break;
			case 9 : System.out.println("종료합니다."); return;
			default : System.out.println("잘못 입력했습니다.");
			}
		}
	}
	public void method8() {
		// 키보드로 문자열을 입력 받아 해당 문자열의 길이 출력
		// exit가 들어올 때까지 반복 (반복 횟수 상관 없고 사용자가 exit 입력 - 종료)
		
		Scanner sc = new Scanner(System.in);
		
		// 반복해야 하는데 종료 시점까지는 돌려야 하니까 while!
		
		// 변수 str을 밖에 빼 주어야 조건식 성립이 가능하다.
//		String str = null;
		String str = ""; // 초기화 (초기식)
		while(!str.equals("exit")) {	// exit 나오면 false로 정지
			System.out.println("문자열을 입력하세요.");
			str = sc.nextLine();
			System.out.println(str + "의 길이 : " + str.length());
		}
	}
	public void method8_1() {
		// method8과 조건문을 먼저 만났냐 안 만냐에 따른 차이
		
		Scanner sc = new Scanner(System.in);
		
		String str = null;
		
		/* do에 있는 부분이 먼저 실행되기 때문에
			사용자가 입력한 값이 str에 있어 null이 사라짐 */
		do {
			System.out.print("문자열을 입력하세요 : ");
			str = sc.nextLine(); // null값 사라짐
			System.out.println(str + "의 길이 : " + str.length());
		} while(!str.equals("exit"));
	}
	public void method8_2() {
		// 키보드로 문자열을 입력 받아 해당 문자열의 길이 출력
		// exit가 들어올 때까지 반복 (반복 횟수 상관 없고 사용자가 exit 입력 - 종료)
		
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		
		while(true) {	// 계속 돌아감.
			System.out.print("문자열을 입력하세요 : ");
			str = sc.nextLine();
			System.out.println(str + "의 길이 : " + str.length());
		
			if(str.equals("exit")) {
				System.out.println("사용을 종료합니다.");
				break;
			}
		}
	}
}
