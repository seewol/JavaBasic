package com.kh.example.practice4.model.vo;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout;

public class Book {
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	public Book() {} // 생성자
	
	public Book(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	public Book(String title, String publisher, String author,
			int price, double discountRate) {
		this(title, publisher, author);
		this.price = price;
		this.discountRate = discountRate;
	}
	
	public void inform() { // 메소드
		System.out.println(title + ", " + publisher + ", " + author
				+ ", " + price + ", " + discountRate);
		
	}
}
