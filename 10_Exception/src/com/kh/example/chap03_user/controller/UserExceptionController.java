package com.kh.example.chap03_user.controller;

import java.util.Scanner;

import com.kh.example.chap03_user.model.exception.MyException;

public class UserExceptionController {
	public void inputAge() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		try {
		checkAge(age);
		} catch(MyException e) {
			e.printStackTrace();
		}
	}
	public void checkAge(int age) throws MyException {
		
		if(age < 19) {
			// 예외 강제 발생 (사용자 정의)
			throw new MyException("청소년은 입장 불가능합니다."); // 매개변수 필요하면 () 안에 집어넣으면 됨
		} else {
			System.out.println("입장 가능합니다.");
		}
	}
}