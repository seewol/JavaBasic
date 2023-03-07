package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Book;

public class Run {
	public static void main(String[] args) {
		
		Book b = new Book();
		b.inform();
		
		Book b2 = new Book("박지은", "멋지다", "정말로");
		b2.inform();
		
		Book b3 = new Book("박지은", "진짜", "힘내라", 100, 99.9);
		b3.inform();
		
	}
}
