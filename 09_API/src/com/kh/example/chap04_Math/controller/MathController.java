package com.kh.example.chap04_Math.controller;

import java.util.Random;

public class MathController {
	 public void method() {
		 //상수 필드
		 double pi = Math.PI;
		 System.out.println("PI : " + pi);
		 
		 double num = 4.949;
		 double abs = Math.abs(num); // 절대값
		 System.out.println(abs); 
		 
		 double ceil = Math.ceil(num); // 올림
		 System.out.println(ceil); 
		 System.out.println(Math.ceil(2.1)); 
		 
		 double round = Math.round(num); // 반올림
		 System.out.println(round); 
		 
		 double floor = Math.floor(num); // 버림
		 System.out.println(floor); 
		 
		 double min = Math.min(ceil, floor); // 둘 사이의 최소값
		 System.out.println(min); 
		 
		 double max = Math.max(floor, num); // 둘 사이의 최대값
		 System.out.println(max); 
		 
		 double rint = Math.rint(num); // 가장 가까운 정수 값 반환
		 System.out.println(rint); 
		 System.out.println(Math.rint(2.1)); 
		 
		 double sqrt = Math.sqrt(3); // 제곱근 (값에 루트를 씌웠을 때 값)
		 System.out.println(sqrt);
		 System.out.println(Math.sqrt(4));
		 System.out.println(Math.sqrt(9));
		 
		 double pow = Math.pow(2, 3); // 몇 제곱인지 (2의 3제곱)
		 System.out.println(pow);
		 System.out.println(Math.pow(3, 3));
		 
		 double random = Math.random(); // 랜덤 값(난수) 뽑기
		 System.out.println(random);
		 double ran1to4 = (int)(Math.random() * 4 + 1);
		 System.out.println(ran1to4);
		
		 // Random 클래스 이용하기
		 Random r = new Random();
		 // nextInt() : int 범위 안에서의 랜덤 값 반환
		 int ran1 = r.nextInt();
		 System.out.println(ran1);
		 // nextInt(n) : 0부터 시작해 n개의 랜덤 값 반환 (ex. 0시작 4개 → 0, 1, 2, 3)
		 int ran2 = r.nextInt(4) + 1;
		 System.out.println(ran2);
	 }
}
