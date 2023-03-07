package com.kh.pratice.snack.view;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

import com.kh.pratice.snack.controller.SnackController;

public class SnackMenu {
	Scanner sc = new Scanner(System.in);
	SnackController scr = new SnackController();
	
	public void menu() {
		
		System.out.println("스낵류를 입력하세요.");
		System.out.print("종류 : ");
		String kind = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("맛 : ");
		String falvor = sc.nextLine();
		System.out.print("개수 : ");
		String strNumOf = sc.nextLine();
		int numOf = Integer.parseInt(strNumOf);
		System.out.print("가격 : ");
		String strPrice = sc.nextLine();
		int price = Integer.parseInt(strPrice);
		
		String resultSave = scr.saveData(kind, name, strPrice, numOf, price);
		System.out.println(resultSave);
		
		System.out.print("저장한 정보를 확인하시겠습니까?(y/n) : ");
		String resultCh = sc.nextLine();
		char ch = resultCh.charAt(0);
		
		if(ch == 'y' || ch == 'Y') {
			String resultConfirm = scr.confirmData();
			System.out.println(resultConfirm);
		}
		
	}
}
