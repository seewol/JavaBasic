package com.kh.example.test.model.vo2;

import com.kh.example.test.model.vo.Parent;

public class Child3 {
	public Child3() {
	Parent p = new Parent();
	
//	p.num = 10; // private
//	p.dNum = 0.4; // default 서로 같은 패키지만 가능
//	p.bool = false; // protected 같은 패키지거나 후손 생성자일 경우 가능
	p.ch = 'a'; // public이라 어디든 가능
	
	}
}
