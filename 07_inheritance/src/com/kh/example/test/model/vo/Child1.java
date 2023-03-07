package com.kh.example.test.model.vo;

public class Child1 {
	private String str;
	
	public Child1() {
		
		Parent p = new Parent();
//		p.num = 10; // private이라 Parent 내부에서만 가능
		p.dNum = 10;
		p.bool = false;
		p.ch = 'a';
		
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	public String getStr() {
		return str;
	}
}
