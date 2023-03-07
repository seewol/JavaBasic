package com.kh.example.practice3.run;

import com.kh.example.practice3.model.vo.Circle;

public class Run {
	public static void main(String[] agrs) {
		
		Circle c = new Circle();
		
		System.out.print("원의 넓이 : ");
		c.getAreaOfCircle();
		System.out.print("원의 둘레 : ");
		c.getSizeOfCircle();
		
		System.out.println();
		c.incrementRadius();
		System.out.println(" == 반지름 1 증가 시킴 ==");
		System.out.println();
		
		System.out.print("원의 넓이 : ");
		c.getAreaOfCircle();
		System.out.print("원의 둘레 : ");
		c.getSizeOfCircle();
	}
}
