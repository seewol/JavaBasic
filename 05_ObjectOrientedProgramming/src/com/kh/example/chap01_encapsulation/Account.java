package com.kh.example.chap01_encapsulation;

public class Account {
	 private String name = "박지은";
	 private String phone = "010-1234-1234";
	 private String pwd = "wldms12!";			// 속성 값 설정
	 private int bankCode = 2023;
	 private int balance = 0;
	
	// 입금 메소드
	
	public void deposit(int money) { // 매개변수
		
		if(money > 0) {
			balance += money;
			System.out.println(name + "님의 계좌에 " + money + "원이 입금되었습니다.");
		} else {
			System.out.println("잘못된 금액이 입력되었습니다.");
		}
	}
	
	// 출금 메소드
	
	public void withdraw(int money) {
		
		if(money <= balance) {
			balance -= money;
			System.out.println(name + "님의 계좌에서 " + money + "원이 출금되었습니다.");
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}
	
	// 잔액 조회 메소드
	
	public void displayBalance() {
		System.out.println(name + "님 계좌 잔액은 " + balance + "원입니다.");
	}
}
