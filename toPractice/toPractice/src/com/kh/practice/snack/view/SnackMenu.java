package com.kh.practice.snack.view;

import java.awt.image.AffineTransformOp;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

import com.kh.practice.snack.controller.SnackController;

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
		String flavor = sc.nextLine();
		System.out.print("개수 : ");
		String strNumOf = sc.nextLine();
		int numOf = Integer.parseInt(strNumOf);
		System.out.print("가격 : ");
		String strPrice = sc.nextLine();
		int price = Integer.parseInt(strPrice);
		
		String result = scr.saveData(kind, name, flavor, numOf, price);
		System.out.println(result);
		
		System.out.print("저장한 정보를 확인하시겠습니까?(y/n) : ");
		String strCh = sc.nextLine();
		char ch = strCh.charAt(0);
		
		if(ch == 'y' || ch == 'Y') {
			String data = scr.confirmData();
			System.out.println(data);
		}
	}
}
