package com.kh.example.test.controller;

import com.kh.example.test.model.vo.Child1;
import com.kh.example.test.model.vo.Child2;
import com.kh.example.test.model.vo.Parent;

public class InheritanceTest {
	public void method() {
		System.out.println("Parent 클래스의 num 필드에 접근 : num 안에 9 대입");
		Parent p = new Parent();
		p.setNum(9);
		// parent 클래스 안의 num은 현재
		// private 이기 때문에 set으로 접근해야 함.
		System.out.println("Parent 안에 있는 num : " + p.getNum());
		
		System.out.println();
		
		System.out.println("Child1 클래스의 str 필드 접근 : str에 Hello 대입");
		Child1 c1 = new Child1();
		c1.setStr("Hello");
		System.out.println("Child1 안에 있는 str : " + c1.getStr());
		
		System.out.println();
		
		System.out.println("Child2 클래스의 str필드 접근(str 안에 world 대입)");
		Child2 c2 = new Child2();
		c2.setStr("world");
		System.out.println("Child2 안에 있는 str : " + c2.getStr());

		System.out.println();
		
		c2.setNum(999); // c2 안에 setNum이 없었는데
		// parent에게 상속을 받아서 그 안에 있던 num에 값을 저장
		System.out.println("Child2 안에 있는 num : " + c2.getNum());
		System.out.println("Parent 안에 있는 num : " + p.getNum());
		
	}
}
