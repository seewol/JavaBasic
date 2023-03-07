package com.kh.general.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			if(num > 1) {
				for(int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				} break;
			} else {
				System.out.println("1이상의 숫자를 입력해주세요.");
			}
		}
	}
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i = num; i >= 1; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			if(num > 1) {
				for(int i = num; i >= 1; i--) {
					System.out.print(i + " ");
				} break;
			} else {
				System.out.println("1 이상의 숫자를 입력해야 합니다.");
			}
		}
	}
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		int i = 1;
		while(i <= num) {
			sum += i;
			if(i != num) {
				System.out.print(i + " + ");
			} else {
				System.out.println(i + " = " + sum);
			}
			i++;
		}
	}
}	
