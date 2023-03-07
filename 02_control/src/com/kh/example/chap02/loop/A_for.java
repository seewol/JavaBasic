package com.kh.example.chap02.loop;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class A_for {
	public void method1() {
		// 1부터 5까지 출력하기
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}
	public void method2() {
		// 자기 소개 5번 하기
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("내 이름은 박지은이야!");
		}
	}
	public void method3() {
		// 5부터 1까지 정수 출력하기
		
		for(int i = 5; i >= 1; i--) {
			System.out.println(i);
		}
	}
	public void method3_1() {
		// 8부터 3까지 출력하기
		
		for(int i = 8; i >= 3; i--) {
			System.out.println(i);
		}
//		위의 식과 똑같음. → 8부터 시작해야 하니 출력 값을 8 시작으로 맞춰줌.
		for(int i = 3; i <= 8; i++) {
			System.out.println(11-i);
		}
	}
	public void method4() {
		// 1부터 10 사이의 홀수만 출력
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 != 0) {	// i % 2 == 1 과 같다.
				System.out.println(i);
			}
		}
			// or
		for(int i = 1; i <= 10; i+=2) {
			System.out.println(i);
		}
	}
	public void method5() {
		// 정수 두 개를 입력 받아 그 사이 숫자를 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 두 개를 입력하세요.");
		System.out.println("단, 첫 번째 숫자가 두 번째보다 작아야 합니다.");
		System.out.print("첫 번째 숫자 : ");
		int start = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int end = sc.nextInt();
		
					// start부터 end까지 수 출력
//		for(int i = start; i <= end; i++) {
//			System.out.println(i);
//		}
		
//		추가로 숫자를 잘못 입력할 경우까지 고려하고 싶다면?
		
		int min = 0;	// 큰 수, 작은 수를 고정할 변수 초기화
		int max = 0;
		
		if(start < end) {
			min = start;
			max = end;
		} else {			// (start >= end)
			max = start;	// start를 더 크게 입력할 경우 큰 변수에 담도록 설정
			min = end;
		}
		
		for(int i = min; i <= max; i++) {
			System.out.println(i);
		}
	}
	public void method5_1() {
		// 정수 하나를 입력받아 그 수가 1~9 사이의 수 일 때만 그 수의 구구단 출력
		// 조건이 맞지 않으면 "1~9 사이의 양수를 입력해야 합니다." 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1 && num <= 9) {	// 조건이 ture면 안의 for문을 수행+반복
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d x %d = %d%n", num, i, num * i);
			}
		} else { // 조건이 맞지 않으면 for문을 지나쳐 else문 수행
			System.out.println("1~9 사이의 양수만 입력해주세요.");
		}
	}
	public void method6() {
		// 난수 Math.random(); → 실수를 반환함
		// System.out.println(Math.random());  →  0 <= Math.random(); <= 1
		
		// 1부터 10까지 임의의 난수를 정해 1부터 난수까지의 정수 합 출력하기
					
		int random = (int)(Math.random() * 10 + 1); // 난수 형변환 후 random에 저장
		
		int sum = 0;	// 정수 합계를 저장하기 위한 변수
		
		for(int i = 1; i <= random; i++) {
			sum += i;			
		}
			System.out.println("1부터 " + random + "까지의 합 : " + sum);
	}
	public void method6_1() {
		// 1부터 50까지 임의의 난수를 뽑아 홀수인지 짝수인지 판별하기
		
		int random = (int)(Math.random() * 50 + 1);
		
		String result = null;	// 메모리 영역에 result 이름의 변수를 만든 상황
								// 왜냐면 문구를 묶어주려고.
		if(random % 2 == 0) {
			result = "짝수";
		} else {
			result = "홀수";
		}
		System.out.println("추첨한 수는 " + random + "으로 " + result + "입니다.");
	}
	public void method7() {
		// 2단부터 9단까지 출력하기
		// printf() 사용하기
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d%n", i, j, i * j);
			}
		}
	}
	public void method8() {
		// 아날로그 시계 출력 : 0시 0분 ~ 23시 59분
		// 마찬가지로 printf() 사용하기
		
		for(int i = 0; i <= 23; i++) {
			for(int j = 0; j <= 59; j++) {
				System.out.printf("%d시 %d분%n", i, j);
			}
		}
	}
	public void method9() {
		// 별 찍기
		// 한 줄에 *가 5번 출력되는데, 그 줄은 사용자가 입력한 만큼 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 수를 입력 : ");
		int row = sc.nextInt();
		
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print("*");
			} System.out.println();
		} 
	}
	public void method10() {
	}
}
