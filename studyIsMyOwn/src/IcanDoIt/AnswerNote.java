package IcanDoIt;

import java.util.Scanner;

public class AnswerNote {
	public void method() {
	/* 키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 
	 * 양수가 아니면 “양수가 아니다“, 0이면 "0이다"를 출력하세요	*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String str = num > 0 ? "양수입니다" : (num == 0 ? "0이다" : "음수다");
		System.out.println(str);
	}

}
