package com.kh.homework.shape.model.vo;

public class Square {
	private double height;
	private double width;
	private String color = "white";
	
	public Square() {}
	public Square(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	// 반환 값 x			매개 변수 o
	public void setHeight(double height) {
		this.height = height;	// this.필드명 = 변수명;
	}
	// 반환 값 o			매개 변수 x
	public double getHeight() {
		return height;	// return 필드명
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	public double getWidth() {
		return width;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String inform() {
		return " ";
	}
}
