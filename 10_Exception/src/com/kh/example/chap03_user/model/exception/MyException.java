package com.kh.example.chap03_user.model.exception;

public class MyException extends Exception {
	public MyException() {}
	public MyException(String message) { // 메세지 받으려고 만든 매개변수
		super(message);				 	  // super 생성자로 메세지 그대로 전달해 주면 됨
	}
}