package com.kh.example.test.model.vo2;

import com.kh.example.test.model.vo.Parent;
// import는 어디에 있는지 불러와 쓰는 것이니 다른 패키지면 써 주기.
public class Child4 extends Parent{
	public Child4() {
		
//		super.num = 10; // private 해당 클래스 내부만 가능
//		super.dNum = 0.4; // default 해당 패키지 내부만 가능
		super.bool = true; // 상속 전제 하에 다른 패키지도 가능
		super.ch = 'c'; // public 모든 곳 가능
	}
	
	

}
