package com.kh.operator;

import java.util.Scanner;

import javax.sound.midi.VoiceStatus;

public class G_Triple {
	public void method1() {
		// Q. 입력한 정수가 짝수인지 홀수인지 판별
	
		Scanner sc = new Scanner(System.in);
	
		System.out.print("정수를 입력하세요 : ");
	
		int num = sc.nextInt();
		
		String result = num % 2 == 0 ? "짝수입니다" : "홀수입니다";
		
		System.out.println("숫자 '" + num + "' 는(은) " + result);
		
	}
	public void method2() {
		// Q. 입력한 성별이 여자인지 남자인지 판별
		// 성별을 입력하세요(M/F) :
		// 남자입니다 혹은 여자입니다 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성별을 입력하세요(M/F) : ");
		String strGender = sc.nextLine();
		char gender = strGender.charAt(0);
		
		String result = gender == 'M' ? "남자입니다" : (gender == 'F' ? "여자입니다" : "잘못 입력했습니다.");
		
		System.out.println("성별은 " + result);
		
	}
	public void method3() {
		// Q. 입력한 정수가 양수인지 아닌지 판별하기
		// 정수 하나 입력 :
		// 양수다 혹은 음수다 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "양수입니다" : (num == 0 ? "0입니다." : "음수입니다.");
		
		System.out.println("입력한 숫자는 " + result);
		
	}
	
}
