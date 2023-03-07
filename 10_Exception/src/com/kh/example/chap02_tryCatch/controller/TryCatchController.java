package com.kh.example.chap02_tryCatch.controller;

import java.io.IOException;
import java.util.zip.ZipException;

public class TryCatchController {
	public void method1() {
		System.out.println("method1() 호출됨...");
		method2();
		System.out.println("method1() 종료됨...");
	}
	public void method2() {
		System.out.println("method2() 호출됨...");
		try {						
			method3();						 
		} catch(ZipException e) {			
			System.out.println("ZipExeption 예외 잡음");
		} catch(IOException e) {
//			System.out.println("예외 잡았다!");	
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println("Exception 예외 잡음");
		} finally {
			System.out.println("예외 발생 여부와 상관 없이 무조건 수행됨...");
		}
		System.out.println("method2() 종료됨...");
	}
	public void method3() throws IOException {
		System.out.println("method3() 호출됨...");
		throw new IOException("에러 강제발생!!!");		
//		System.out.println("method3() 종료됨...");
	}
}
