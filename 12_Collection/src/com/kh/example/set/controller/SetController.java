package com.kh.example.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.TreeSet;

import com.kh.example.set.model.compare.DogComparator;
import com.kh.example.set.model.vo.Dog;

public class SetController {
	public void doSet() {
			HashSet<Dog> set = new HashSet<Dog>();
			set.add(new Dog("방울", 2.3));
			set.add(new Dog("구름", 6.2));
			set.add(new Dog("사랑", 11.9));
			
			System.out.println("set : " + set);	// 순서 유지 X
			
			set.add(new Dog("구름", 6.2));
			System.out.println("set : " + set);	// 중복 저장이 됨
			// 주소값이 다르기 때문에 중복 저장이 가능했다
			// 내용은 같지만 new 연산자로 인해 주소가 다르기 때문에 다른 객체로 인지
			// 만약 구름이를 레퍼런스 변수에 담아 추가했을 경우는 중복 저장이 안 된다
			
			// 그럼 equals()를 오버라이딩 해 보자
			
			HashSet<String> setStr = new HashSet<String>();
			setStr.add(new String("안녕"));
			setStr.add("반가워");
			setStr.add(new String("안녕"));
			System.out.println(setStr);
			
			System.out.println();
			
			
			LinkedHashSet<Dog> set2 = new LinkedHashSet<Dog>();
			// 중복 저장 X, 순서 유지 O
			set2.add(new Dog("초코", 2.1));
			set2.add(new Dog("콩이", 8.3));
			set2.add(new Dog("두부", 5.0));
			set2.add(new Dog("초코", 2.1));
			
			System.out.println("set2 : " + set2);
			
			set2.add(new Dog("로이", 6.1));
			set2.add(new Dog("공주", 5.2));
			set2.add(new Dog("왕자", 9.5));
			set2.add(new Dog("조이", 12.5));
			
			System.out.println("set2 : " + set2);
			
			System.out.println();
			
			// 이름 오름차순 TreeSet
			TreeSet<Dog> set3 = new TreeSet<Dog>(set2);
			System.out.println("set3 : " + set3);
			
			System.out.println();
			
			// 몸무게 내림차순, 이름 오름차순 TreeSet
			TreeSet<Dog> set4 = new TreeSet<Dog>(new DogComparator()); // 새로운 생성자를 가진 클래스를 객체로 생성해 줌
			set4.addAll(set3);
			set4.add(new Dog("해피", 6.1));
			
			System.out.println("set4 : " + set4);
			
			System.out.println();
			
			// ☆ set 안에 있는 element에 접근하는 방법
			// 방법 1. 향상된 for문 이용
			// 		for(초기식; 조건식; 증감식)
			//		for(임시변수:for재료)
			
			int[] arr = new int[4]; // 0 0 0 0
			for(int i = 0; i < arr.length; i++) {		// 원래 for문 (배열로 예시 듦)
				System.out.println(arr[i]);
			}
			
				// arr안에 있는 값을 하나씩 꺼내올 때 int num이라는 변수에 임시로 저장
			for(int num:arr) { 
				System.out.println(num);
			}
			
				// arr2안에 있는 값을 하나씩 꺼내올 때 String str이라는 변수에 임시로 저장
			String[] arr2 = {"벽돌", "컴퓨터", "휴지"};
			for(String str:arr2) {
				System.out.println(str);
			}
			
			for(Dog d:set4) {
				System.out.println(d);
			}
			
			System.out.println();
			
			// 방법 2. Set을 List에 옮기기
			ArrayList<Dog> list = new ArrayList<Dog>(set4); // addAll 쓰거나 매개변수(생성자) 이용해서 추가해줘도 됨
													// list 안에 set4의 데이터가 들어가 있는 상황!
			for(int i = 0; i < list.size(); i++) {	
				System.out.println(list.get(i));
			}
			
			System.out.println();
			
			// 방법 3. Iterator 이용하기
			Iterator<Dog> it = set4.iterator(); // set4 안의 iterator 메소드 사용
			while(it.hasNext()) {	// set4의 iterator 안에는 반환 타입 Dog가 담겨있는 상황		
				Dog d = it.next();	// 그래서 안에 있는 Dog를 d에 담아 출력
				System.out.println(d);
			}
			while(it.hasNext()) {	// Iterator는 단방향인데 위의 while에서 한 번 꺼냄
				Dog d = it.next();	// 따라서 지금 한 번 더 while을 해도 돌아가지 않는다
				System.out.println("one more : " + d);
			}						// 출력 안 됨
			
			System.out.println("==================");
			
			// 번외편. ListIterator 사용
			ListIterator<Dog> lit = list.listIterator(); // 반환 타입 Dog, list 안에는 Dog가 담겨있을 거니까
			while(lit.hasNext()) {	// 다음 값 있니? 해서 있으면 가져옴
				System.out.println(lit.next());
			}
			System.out.println("==================");
			while(lit.hasPrevious()) {	// 끝에 도달해 이전 값이 있니? 해서 있으면 가져옴
				System.out.println(lit.previous()); // 맨 앞까지 반복함
			}
	}
}
