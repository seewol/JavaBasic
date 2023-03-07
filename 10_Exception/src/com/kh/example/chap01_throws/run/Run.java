package com.kh.example.chap01_throws.run;

import com.kh.example.chap01_throws.controller.ThrowsController;

public class Run {
	public static void main(String[] args) /* throws Exception */ {
		System.out.println("정상적으로 시작됨...");
		
		ThrowsController tc = new ThrowsController();
		
		try {						// exception 발생 가능성 있는 코드 기입
			tc.method1();			// 예외가 아닌 것들도 try 안에 넣을 수 있다
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("정상적으로 종료됨...");
	}
}
