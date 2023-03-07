package com.kh.example.chap01_encapsulation;

public class Run {
	public static void main(String[] args) {
		
		Account a = new Account(); // 같은 패키지라 import 안 해도 됨
		a.displayBalance();
		
		a.deposit(1000000);
		a.displayBalance();
		
		a.withdraw(800000);
		a.displayBalance();
		
//		a.balance -= 300000;
		
		a.displayBalance();
		
	}

}
