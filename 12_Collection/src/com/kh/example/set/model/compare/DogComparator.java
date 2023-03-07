package com.kh.example.set.model.compare;

import java.util.Comparator;

import com.kh.example.set.model.vo.Dog;

public class DogComparator implements Comparator<Dog> {

	@Override
	public int compare(Dog o1, Dog o2) {
		// 몸무게 내림차순, 이름 오름차순 TreeSet
		// o1 : 비교 주체
		// o2 : 비교 대상
		if(o1.getWeight() > o2.getWeight()) {
			return -1; // 오름차순일 경우는 1이니 반대로
		} else if(o1.getWeight() == o2.getWeight()) {
			// 몸무게 같을 경우 이름 오름차순 정렬
			return o1.getName().compareTo(o2.getName());
		} else {
			return 1;
		}
		
	}
}
