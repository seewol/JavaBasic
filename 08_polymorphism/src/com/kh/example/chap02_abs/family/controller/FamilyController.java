package com.kh.example.chap02_abs.family.controller;

import com.kh.example.chap02_abs.family.model.vo.Baby;
import com.kh.example.chap02_abs.family.model.vo.Basic;
import com.kh.example.chap02_abs.family.model.vo.Family;
import com.kh.example.chap02_abs.family.model.vo.Mother;

public class FamilyController {
	public void method() {
//		Family F1 = new Family(); // 추상 클래스는 불완전하기 때문에 객체 생성 불가
		new Mother();
		new Baby(); // Mother나 Baby를 이용해 객체 생성하면 됨
		
		Family f1 = new Mother(); // 추상 클래스는 참조 변수로 사용이 가능
		Family f2 = new Baby();	  // 자식 객체를 부모 변수에 담음
		
//		Basic b = new Basic();
		
		Basic b1 = new Mother(); // 객체 생성은 불가능하지만, 참조 변수 사용은 가능!
		Basic b2 = new Baby();
	}
}
