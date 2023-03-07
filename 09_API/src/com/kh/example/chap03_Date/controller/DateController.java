package com.kh.example.chap03_Date.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateController {
	public void method() {
		Date today = new Date(); // 기본 생성자는 가능
		System.out.println(today);
		
		// Tue Feb 21 14:46:13 KST 2023
		System.out.println(today.getTime()); // 1676958373172
		
		Date time = new Date(1676958373172L);
		System.out.println(time);
		
		Date date = new Date(2023, 2, 21); // deprecated
		// 내가 원하는 날짜와 시간으로 출력하지 못한다
		
	}
	public void method2() {
//		Calendar c = new Calendar(); // abstract라 객체 생성 불가
		Calendar c = Calendar.getInstance(); // getInstance() 이용해 객체 생성
		System.out.println(c);
		
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = c.get(Calendar.MONTH); // 달은 제로 인덱스로 카운팅
		System.out.println(month + 1);	   // 원하는 달은 + 1
		
		int date = c.get(Calendar.DATE);
		System.out.println(date);
		
		int amPm = c.get(Calendar.AM_PM);
		System.out.println(amPm); 		   // 오전은 0, 오후는 1 출력
		String sAmPm = amPm == 0 ? "오전" : "오후";
		System.out.println(sAmPm);
		
		int hour = c.get(Calendar.HOUR);
		System.out.println(hour);				  // 오전 오후 기준 시간
		int hour24 = c.get(Calendar.HOUR_OF_DAY); // 24시간 기준으로
		System.out.println(hour24);
		
		int min = c.get(Calendar.MINUTE);
		System.out.println(min);
		
		int sec = c.get(Calendar.SECOND);
		System.out.println(sec);
		
		int milsec = c.get(Calendar.MILLISECOND);
		System.out.println(milsec);
		
		int day = c.get(Calendar.DAY_OF_WEEK); // 주 기준 며칠 지났는지
		System.out.println(day); 			   // 일요일 1 부터 시작 ! (ex. 화 = 3)
		
		System.out.printf("%d년 %d월 %d일 %s %d시 %d분 %d초", year, month+1, date, sAmPm, hour, min, sec);
	}
	
	public void method3() {
		int year = 2023;
		int month = 6; // month는 0이 1월
		int date = 13;
		int hour = 14;
		int min = 50;
		int sec = 0;
		
		GregorianCalendar gc = new GregorianCalendar(year, month, date, hour, min, sec);
		System.out.println(gc);
		
		int endYear = gc.get(Calendar.YEAR);
		int endMonth = gc.get(Calendar.MONTH+1);
		int endDate = gc.get(Calendar.DATE);
		int endHour = gc.get(Calendar.HOUR_OF_DAY);
		int endMin = gc.get(Calendar.MINUTE);
		int endSec = gc.get(Calendar.SECOND);
		
		System.out.printf("우리는 %d년 %d월 %d일 %d시 %d분 %d초에 수료한다!", 
						endYear, endMonth, endDate, endHour, endMin, endSec);
		
		System.out.println();
		
		// 요 방법을 많이 씀.
		long time = gc.getTimeInMillis();
		Date endDay = new Date(time);
		System.out.println(endDay);
		
		// 날짜 위에 있음
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E요일 a hh시 mm분 ss초 SSS");
		// 년 : yyyy, 월 : MM, 일 : dd, 요일 : E, 오전오후 : a, 시간 : hh, 분 : mm, 초 : ss
		String fmt = sdf.format(endDay);
		System.out.println(fmt);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String fmt2 = sdf2.format(endDay);
		System.out.println(fmt2);
	}
}
