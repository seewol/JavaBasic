package func;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		/* 키보드로 입력 받은 하나의 정수가 양수이면 
		 * "양수다", 양수가 아니면 "양수가 아니다"를 출력하세요 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String str = num >= 0 ? "양수다." : "양수가 아니다.";
		System.out.println(str);
		
	}
	
	public void practice2() {
		/* 키보드로 입력 받은 하나의 정수가 양수이면 "양수다", 
		 * 양수가 아니면 "양수가 아니다"를 0이면 "0이다"를 출력하세요 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String str = num > 0 ? "양수다" : (num == 0 ? "0이다" : "음수다.");
		System.out.println(str);
	}
	
	public void practice3() {
		/* 키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 
		 * 짝수가 아니면 “홀수다“를 출력하세요.	 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		String str = num % 2 == 0 ? "짝수다" : "홀수다";
		System.out.println(str);
	}
	
	public void practice4() {
		/* 모든 사람이 사탕을 골고루 나눠가지려고 한다. 
		 * 인원 수와 사탕 개수를 키보드로 입력 받고 1인당 동일하게
		 * 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요. */
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println();
		
		int people2 = candy / people;
		int candy2 = candy % people;
		
		System.out.println("1인당 사탕 개수 : " + people2);
		System.out.println("남는 사탕 개수 : " + candy2);
	}

	public void practice5() {
		/* 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
		이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력 처리 하세요 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년(숫자만) : ");
		String strGrade = sc.nextLine();
		int grade = Integer.parseInt(strGrade);
		System.out.print("반(숫자만) : ");
		String strNum = sc.nextLine();
		int num = Integer.parseInt(strNum);
		System.out.print("번호(숫자만) : ");
		String strNum2 = sc.nextLine();
		int num2 = Integer.parseInt(strNum2);

		// next, nextInt, nextfloat, nextdouble 다음에 nextLine을 쓰면 안 됨
		// 따라서 정수를 문자열로 입력 받은 후 파싱해주어야 한다. 
		
		System.out.print("성별(M/F) : ");
		String strGender = sc.next(); // nextLine 대신
		char gender = strGender.charAt(0);
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble();
		
		String student = gender == 'M' ? "남학생" : "여학생";
		
		System.out.println(grade + "학년 " + num + "반 " + num2 + "번 " + name + " " + student + "의 성적은 " + score + "이다.");
	}
	
	public void practice6() {
		/* 나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지, 
		성인(19세 초과)인지 출력하세요 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String str = age <= 13 ? "어린이" : (age > 13 && age <= 19 ? "청소년" : "성인");
				
		System.out.println(str);
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int all = kor + eng + math;
//		double avg = (kor + eng + math) / 3.0;
		double avg = all / 3.0;
		System.out.println("합계 : " + all);
		System.out.println("평균 : " + avg);
		
		String str = kor >= 40 && eng >= 40 && math >= 40 && avg >= 60 ? "합격" : "불합격";
		
		System.out.println(str);
	}

	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		char gen = sc.nextLine().charAt(7); // 문자열로 받아 char로 추출하는 것.
		
		String result = gen == '1' || gen == '3' ? "남자" : "여자";
		
		System.out.println(result);
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;	// 선언만 초기화는 안 함.
		int input;
		
		System.out.print("정수1 : ");
		num1 = sc.nextInt();
		System.out.print("정수2 : ");
		num2 = sc.nextInt();
		System.out.print("입력  : ");
		input = sc.nextInt();
		
		// 비교 연산자는 결과 값을 boolean으로 반환한다.
		System.out.println(input > num2 || input <= num1);
	}
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		boolean result = (num1 == num2 && num2 == num3) ? true : false;
		
		System.out.println();
		System.out.println(result);
	}
	
	public void practice11() { // ???? 부동소수점..
		
		Scanner sc = new Scanner(System.in);
		System.out.print("A사원의 연봉 : ");
		int aNum = sc.nextInt(); 
		System.out.print("B사원의 연봉 : ");
		int bNum = sc.nextInt(); 
		System.out.print("C사원의 연봉 : ");
		int cNum = sc.nextInt(); 
		
		double incenA = aNum * 0.4;
		double incenB = bNum * 0.0;
		double incenC = cNum * 0.15;
		
		String str1 = "3000 이상";
		String str2 = "3000 미만";
		
		System.out.println("A사원 연봉/연봉+a : " + aNum + "/" + (aNum + incenA));
		System.out.println(aNum + incenA >= 3000 ? str1 : str2);
		System.out.println("A사원 연봉/연봉+a : " + aNum + "/" + (aNum + incenB));
		System.out.println(aNum + incenB >= 3000 ? str1 : str2);
		System.out.println("A사원 연봉/연봉+a : " + aNum + "/" + (aNum + incenC));
		System.out.println(aNum + incenC >= 3000 ? str1 : str2);
	}
}
