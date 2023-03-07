package func;

import java.util.Scanner;

public class CastingPractice1 {
	public void method() {
		// 키보드로 문자 하나를 입력 받아 그 문자의 유니코드를 출력하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
//		int num = ch;							// 형변환
		System.out.println(ch + " unicode : " + (int)ch);
	}
	
}
