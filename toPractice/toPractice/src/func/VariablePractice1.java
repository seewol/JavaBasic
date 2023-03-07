package func;

import java.util.Scanner;

public class VariablePractice1 {
	public void inputScanner() {
		
		// 이름, 성별, 나이, 키 입력받기 (변수에 담고 출력하시오)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		String strGender = sc.nextLine();
		char gender = strGender.charAt(0);
		
		System.out.print("나이를 입력하세요 : ");
//		int age = sc.nextInt();
		
		String strAge = sc.nextLine();
		int age = Integer.parseInt(strAge);
		
		System.out.print("키를 입력하세요(cm) : "); // ★★
		
		double height = sc.nextDouble();
//		String strHeight = sc.nextLine();
//		double height = Double.parseDouble(strHeight);
				
//		System.out.printf("키 %.1f인 %d살 %c자 %s님 반갑습니다^^", height, age, gender, name);
		// ★★ .1f >> %0.nf 이면 소수점 n째 자리까지 적겠다는 의미
		// println 으로도 코드 써 보기
		
		System.out.println("키 " + height + "인 " + age + "살 " + gender + "자 " + name + "님 반갑습니다^^");
	}
}
