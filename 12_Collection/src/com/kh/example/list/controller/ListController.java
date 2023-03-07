package com.kh.example.list.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.example.list.model.compare.StudentComparator;
import com.kh.example.list.model.vo.Student;

public class ListController {
	public void doList() {
		ArrayList l = new ArrayList(); // import 해서 ArrayList 생성
		
//		ArrayList<Student> list = new ArrayList<Student>();
		ArrayList<Student> list = new ArrayList<>(3); // 타입 추론, 3개짜리 공간 생성
		// 타입 추론 : 뒤의 <>를 비워둬도 앞에 있는 것을 그대로 가져다가 추론
		
		list.add(new Student("테스트", 0));
		list.add(new Student("도대담", 60));
		list.add(new Student("남나눔", 90)); // 3개 공간 추가 완료
		
		System.out.println("list : " + list);
		
		list.add(new Student("하현호", 85)); // 한 개 더 추가
		
		System.out.println("list : " + list);
		// 배열이었으면 ArrayIndexOutOfBound 뜸
		// ArrayList라 객체를 추가해도 자동으로 크기 증가된 걸 알 수 있다
		
		System.out.println("현재 list에 담긴 element의 개수 : " + list.size());
		
		// add(E e) : boolean
		list.add(new Student("문미미", 66));
		System.out.println("list : " + list);
		System.out.println("현재 list에 담긴 element의 개수 : " + list.size());
		
		// add(int index, E e)
		// 0 index에 류라라 100점 추가
		list.add(0, new Student("류라라", 100));
		System.out.println("list : " + list);
		
		// 3 index에 강건강 40점 추가
		list.add(3, new Student("강건강", 40));
		System.out.println("list : " + list);
		
		// remove(int index) : E
		// 1 index에 위치한 객체 삭제
		list.remove(1);
		System.out.println("list : " + list);
		
		// remove(Object o) : boolean
		list.remove(new Student("강건강", 40));
		System.out.println("list : " + list);
		
		l.add(new String("java"));	// l은 제네릭 하지 않아 무슨 타입이든 넣을 수 있음
		l.add(new Integer(10));			
		System.out.println("l : " + l);
		l.remove(new String("java"));
		System.out.println("l : " + l);
		
		// Collections.sort()
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("우진기");
		strList.add("박지은");
		strList.add("문찬우");
		strList.add("유기훈");
		System.out.println("strList : " + strList);
		Collections.sort(strList);
		System.out.println("strList : " + strList);
		Collections.sort(strList);
		
		Collections.sort(list);
		// name 오름차순 하겠다고 설정해서 이제 빨간 줄 안 뜸
		System.out.println("list : " + list);
		
		list.add(new Student("도대담", 32));
		list.sort(new StudentComparator());
		System.out.println("list : " + list);
		
		// set(int index, E e):E
		list.set(3,  new Student("박보배", 85));	// 수정, 변경 메소드
		System.out.println("list : " + list);
		
		// get(int index):E
		Student s = list.get(2);	// 반환 메소드
		System.out.println(s);
		
		// subList(int index1, int index2):List<E>
		System.out.println(list.subList(2, 5)); // 끝의 인덱스 5는 포함하지 않음
		
		// contains(Object o):boolean
		// indexOf(Object o):int
		
		System.out.println(list.contains(new Student("남나눔", 90)));
		System.out.println(list.contains(new Student("차청춘", 74)));
		// 만약 equals()를 오버라이딩 하지 않았다면 
		// 안에 있는 주소값이 같지 않기 때문에 둘 다 false를 반환함
		
		System.out.println(list.indexOf(new Student("남나눔", 90)));
		System.out.println(list.indexOf(new Student("차청춘", 74)));
		// 남나눔의 인덱스 5번이 나오고, 없는 사람은 -1이 나온다
		
		// clear():void
		// isEmpty():boolean
		System.out.println("list : " + list);
		System.out.println(list.isEmpty());		// 비었는지 묻는 것
		list.clear();							// 비우는 것
		System.out.println("list : " + list);
		System.out.println(list.isEmpty());
		
	}
}
