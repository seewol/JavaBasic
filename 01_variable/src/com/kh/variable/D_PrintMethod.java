package com.kh.variable;

public class D_PrintMethod {
	public void printlnExample() {
		
		System.out.println("안녕하세요");
		System.out.println("반갑습니다");
		System.out.println(); // 아무것도 안 넣은 건 줄바꿈
		
	}
	public void printExample() {
		
		System.out.print("안녕하세요");
		System.out.print("반갑습니다");
//		System.out.print(); // print 메서드는 공백 불가능
		
		System.out.println(); // 줄바꿈
		// 메인 메서드에서 실행시 깔끔하게 보이기 위해
		
	}
	public void printfExample() {
		
		String str1 = "안녕하세요";
		String str2 = "반갑습니다";
		
		// 안녕하세요, 박지은입니다. 반갑습니다.
//		System.out.printf("%s, 박지은입니다. %s.", str1, str2);
		
		System.out.println();
		
		int age = 30;
		String name = "박지은";
		String job = "학생";
		boolean isTrue = true;
		
		// 안녕하세요, 저는 30살 박지은 학생입니다. 성격은 착합니다.(false)
		// 만나서 정말 반갑습니다. ≪ 까지 printf()로 출력하기
		
		System.out.printf("%s, 저는 %d살 %s %s입니다. "
				+ "성격은 착합니다.(%b) 만나서 정말 %s.%n",
				str1, age, name, job, isTrue, str2);
		
		System.out.println(); // 줄바꿈 (%n이나 \n도 가능)
		
		// printf()를 println()으로 바꿔 출력하기
		System.out.println(str1 + ", 저는 " + age + "살 " + name 
				+ " " + job + "입니다. 성격은 착합니다.(" + isTrue 
				+ ") 만나서 정말 " + str2 + ".");
		
	}

}
