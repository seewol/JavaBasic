package com.kh.example.chap02_abs.family.model.vo;

import java.io.Serializable;

// 인터페이스 사이에서의 상속은 extends 이용 / 다중 상속 가능
public interface Basic extends Cloneable, Serializable{ // 인터페이스는 항상 추상 메소드, 상수형 필드가 들어가야 함
	// 인터페이스에서의 필드는 항상 상수 필드
	public static final double PI = 3.14;
	String name = "생명체"; // public static final 생략 가능
//	private int a;
	
	// 인터페이스에서의 메소드는 항상 추상 메소드
	public abstract void eat(); 
	void sleep(); 		  // public abstract 생략 가능
	
}
