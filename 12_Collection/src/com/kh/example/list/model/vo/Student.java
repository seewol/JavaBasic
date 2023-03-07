package com.kh.example.list.model.vo;

public class Student implements Comparable<Student> {
	private String name;
	private int score;
	
	public Student() {}
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return name + "(" + score + "점)";
	}
	
	@Override	
	public boolean equals(Object obj) {
				// 모든 클래스의 최상위라 뭐든 다 들어올 수 있게 Object로 설정하고
				// 앞으로 받아올 클래스와 내 것이 같은지 비교하는 것임
		// 같은 객체인지 다른 객체인지 비교
		// 1. 객체 자체 비교
		if(this == obj) { 	// 내가 가진 주소값과 매개변수로 넘어온 주소값 비교
			return true;	// 주소값이 같으니까 같은 객체
		}
		if(obj == null) {	// equals()가 호출되었다는 것은 객체가 이미 무조건 생성됨
			return false;
		}
		if(getClass() != obj.getClass()) {
			return false;	// 내가 가진 클래스와 넘겨받은 클래스가 같지 않다 = false
		}
		// 내가 가진 주소값을 이용해서 객체 자체로 비교를 해보았음
		
		// 2. 객체 내용 비교
		Student other = (Student)obj; // 매개변수로 받은 obj를 Student로 다운 캐스팅 형변환
		if(name == null) {
			if(other.name != null) {  // 내 이름은 null인데 다른 이름은 null이 아니다? false
				return false;
			}
		} else if(!name.equals(other.name)) {	// 안의 내용을 비교해보겠다
			return false;
		}
		if(score != other.score) {	  // 다를 것들만 지금까지 걸러놓은 것
			return false;
		}
		return true;	// 아닌 경우는 false로 다 걸렀으니까 마지막에 남은 게 true
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;	// 컴퓨터가 연산하기 좋은 적당한 크기의 소수
		int result = 1;
		result = prime * result + (name == null? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}
	
	@Override
	public int compareTo(Student o) {
		// 이름(String) 오름차순
		String otherName = o.name; // 전달받은 애를 비교대상 name으로 꺼내 놓기
		int result = name.compareTo(otherName);
		// 비교 주체(내가 가진 name)와 비교 대상(매개변수로 전달받은 otherName)으로 정렬
		// 비교 주체가 비교 대상과 같으면 0
		// 비교 주체가 비교 대상보다 크면 1
		// 비교 주체가 비교 대상보다 작으면 -1 ≫ 오름차순
		
		return result;
	}
}
