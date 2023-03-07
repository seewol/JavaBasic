package com.kh.example.person.controller;

import com.kh.example.person.model.vo.Person;

public class PersonController {
	public void method() {
		
		Person[] pArr = new Person[5];
		// pArr 공간이 Stack에 만들어지고,
		// Person 객체가 들어갈 수 있는 5개의 공간이 Heap 메모리에 생김
		// Heap 메모리에 생긴 주소 값이 pArr에 들어간다.
		
		System.out.println("pArr : " + pArr);
		// 참조 변수(클래스 변수)는 주소 값을 반환한다.
		
		for(int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i]);
		}
		
		// 초기화 시키지 않은 참조 변수라 기본 값 null 반환.
		
//		pArr[0].getAge();
//		현재 해당 객체에는 아무 것도 들어있지 않는 상태 = null
//		공간만 호출해놓은 상태인데 메소드를 호출하는 것은 문제가 생김.
//		→ NullPointerException 발생.
//		∴ 객체 생성까지 해야 안에 있는 메소드를 활용할 수 있다.
		
		// 각 인덱스 별 공간에 객체를 생성해서 대입
		
		pArr[0] = new Person("강건강", 25, '남', 175.4, 74.2);
		pArr[1] = new Person("남나눔", 14, '남', 167.7, 61.5);
		pArr[2] = new Person("도대담", 34, '남', 182.0, 66.7);
		pArr[3] = new Person("류라라", 17, '여', 172.1, 55.6);
		pArr[4] = new Person("문미미", 28, '여', 160.2, 58.4);
				
		for(int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i]);
		} // pArr[i] 번째에 있는 것들을 돌려보자.
		  // 만들어진 객체에 대한 주소 값이 각 인덱스 별로 들어가 있다.
		  // 이렇게 객체가 생성된 후에야 pArr[0].getAge();처럼
		  // 메소드를 호출할 수 있다.
		
		for(int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i].personInfo());
		}
		
	}
	public void method2() {
		
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		int[] arr2 = {1, 2, 3};
		
		Person[] pArr = {new Person("박보배", 42, '여', 162.7, 44.8),
						 new Person("송성실", 23, '남', 175.4, 70.1),
						 new Person("윤예의", 11, '여', 153.2, 40.1)};
		
		for(int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i]);
			System.out.println(pArr[i].getName());
		}
	}
}
