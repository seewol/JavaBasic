package com.kh.example.chap01_poly.test.controller;

import com.kh.example.chap01_poly.test.mode.vo.Child1;
import com.kh.example.chap01_poly.test.mode.vo.Child2;
import com.kh.example.chap01_poly.test.mode.vo.Parent;

public class PolyController {
	// 다형성 : 자식 객체를 부모 클래스 타입에 담는 기술
	
	public void method() {
		
		System.out.println("1. 부모타입 레퍼런스로 부모 객체를 다루는 경우");
		Parent p1 = new Parent();
	  // ㄴ부모 타입 레퍼런스		ㄴ부모 객체
		p1.printParent();
		
		System.out.println("2. 자식타입 레퍼런스로 자식 객체를 다루는 경우");
		Child1 c1 = new Child1();
		// ㄴ자식타입 레퍼런스	ㄴ자식 객체
		c1.printChild1();
		c1.printParent(); // 후손 클래스 안에 부모가 들어있어서 호출 가능
		
		System.out.println();
		
		System.out.println("3. 부모타입 레퍼런스로 자식 객체 다루는 경우");
		
		Parent p2 = new Child2(); // 다형성 적용
		// ㄴ부모타입 레퍼런스	ㄴ자식 객체
		// 업 캐스팅
		// 자식 객체를 부모 변수에 담음
		p2.printParent();
//		p2.printChild2(); 
		// 내가 만든 객체는 Child2()가 맞지만, 해당 객체를 Parent()에서 담고 있기 때문에 
		// Parent() 안의 printParent()까지만 볼 수 있다. printChild2()는 못 봄.
		
		// 다운 캐스팅 : 자식 객체의 멤버를 호출하기 위해 부모 레퍼런스 변수를 자식 타입으로 형변환하는 것.
		
		((Child2)p2).printChild2();
		
		System.out.println();
		
		System.out.println("4. 자식타입 레퍼런스로 부모 타입 객체 다루는 경우");
//		Child2 c2 = new Parent(); 
		// 부모 객체는 애초에 자식 타입 레퍼런스에 담을 수 없다.
		
		
		System.out.println();
		System.out.println("==== 다형성 간단 예제 ====");
		System.out.println();
		
		// 1. 메소드 매개변수에서의 다양성
		test(new Child1());
		test(new Child2());
		
		// 2. 객체배열에서의 다형성
		Parent[] pArr = new Parent[4];
		pArr[0] = new Child1();
		pArr[1] = new Child2();
		pArr[2] = new Child2();		// 다형성 적용된 상태
		pArr[3] = new Child1();
		
		for(int i = 0; i < pArr.length; i++) {
//			pArr[i].printParent();
			
//			if(i == 0 || i == 3) {
//				((Child1)pArr[i]).printChild1();
//			} else {
//				((Child2)pArr[i]).printChild2();
//			}
//		}
			if(pArr[i] instanceof Child1) {
				((Child1)pArr[i]).printChild1(); // 조상 타입 참조변수가 자손 타입 객체 가리키는지
			} else if(pArr[i] instanceof Child2) {
				((Child2)pArr[i]).printChild2(); 
			}
			
			pArr[i].print(); // parent 타입의 레퍼런스 변수, 안에는 자식 객체 담김(다형성)
			
		}
		
		
		
	}
	
//	public void test(Child1 c1) {} // 같은 이름이지만 매개변수 타입을 달리 해 오버로딩
//	public void test(Child2 c2) {}
	public void test(Parent p) {} // 부모 타입으로 자식 객체를 받고 있어 문제 생기지 않음.
}
