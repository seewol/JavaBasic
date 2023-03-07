package com.kh.example.list.model.compare;

import java.util.Comparator;

import com.kh.example.list.model.vo.Student;

public class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// o1 : 비교 주체
		// o2 : 비교 대상
		// 이름 내림차순
//		return -o1.getName().compareTo(o2.getName());
		
		String standardName = o1.getName();
		String objectName = o2.getName();
		if(standardName.compareTo(objectName) == 0) { // 이름이 같으면
			Integer standardScore = o1.getScore();
			Integer objectScore = o2.getScore();
			
//			return standardScore.compareTo(objectScore); // 점수로 오름차순 진행
			
			if(standardScore > objectScore) {
				return 1;
			} else if(standardScore == objectScore) {
				return 0;
			} else {
				return -1;
			}
		} else {
			return -o1.getName().compareTo(o2.getName()); // 이름으로 내림차순 진행
		}
	}
}
