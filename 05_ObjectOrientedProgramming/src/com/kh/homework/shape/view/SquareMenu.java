package com.kh.homework.shape.view;

import java.util.Scanner;

import com.kh.homework.shape.controller.SquareController;

public class SquareMenu {
	private Scanner sc = new Scanner(System.in);
	
	private SquareController sqrController = new SquareController();
	
	public void inputMenu() {
	}
	
	public void createSquare() {
	}
	
	public void getPerimeter() {
	}
	
	public void getArea() {
	}
	
	public void paint() {
	}

	public void printInformation() {
	}

	public void intputMenu() {
		System.out.println("1. 사각형 생성");
		System.out.println("2. 사각형 둘레 구하기");
		System.out.println("3. 사각형 면적 구하기");
		System.out.println("4. 사각형 색칠하기");
		System.out.println("5. 사각형 정보 조회");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴 번호 : ");
	}
	
}
