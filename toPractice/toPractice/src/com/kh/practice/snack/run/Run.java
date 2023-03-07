package com.kh.practice.snack.run;

import com.kh.practice.snack.view.SnackMenu;

public class Run {
	public static void main(String[] args) {
		SnackMenu sm = new SnackMenu();
		sm.menu();
		
		/* 먼저 스낵 컨트롤러 안에 스낵 객체를 만들어 종류, 이름, 맛 등을 저장했다.
	그런데 스낵 메뉴에서 정보를 바로 출력하려면 그 안에 새로 스낵 객체를 만들어서
	s.information(); 이런 식으로 메소드 입력을 해야 하는데,
	그러면 우리가 원하는 입력 값이 아닌 각 타입의 기본 값으로 출력이 된다.
	따라서 스낵 컨트롤러 안에 우리가 만든 스낵 객체에 대한 정보를 출력하도록
	confirmData() 메소드를 만들어 놓고, 스낵 메뉴에서 그 메소드를 이용해 출력하는 것이다.*/
	
	}
}
