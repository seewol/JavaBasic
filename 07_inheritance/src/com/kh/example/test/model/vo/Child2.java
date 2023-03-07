package com.kh.example.test.model.vo;

public class Child2 extends Parent{
	private String str;
	
	public Child2() {
		System.out.println("Child2 : " + this);
		
//		super.num = 10; // private이라 후손 생성자도 얄짤 없음.
		super.dNum = 0.4; // default라서 가능
		super.bool = false; // protected 같은 패키지, 후손 생성자 가능
		super.ch = 'a'; // public 모든 곳 가능
		
	}
	public void setStr(String str) {
		this.str = str;
	}
	public String getStr() {
		return str;
	}
	
	
}
