package IcanDoIt;

import java.security.PublicKey;
import java.util.Scanner;

import org.ietf.jgss.Oid;

public class MyNote1 {
	public void for1() {
		// for문 예제1 : 출력 메소드를 통해 가로, 세로 구분
		/* 1
		   2
		   3			이렇게 결과 내기
		   4
		   5
		   12345	
		 */
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);	// 세로 출력
		}
		for(int i = 1; i <= 5; i++) {
			System.out.print(i);
		}	
	}
	public void for2() {
		// for문 예제2 : 1부터 5까지의 합 구하는 예제
		
		int sum = 0;	// int 기본 값인 0으로 sum 초기화
						// 합을 저장할 공간 생성
		for(int i = 1; i <= 5; i++) {	// 1~5까지 더할 것
//			sum = sum + i;
			sum += i;
			System.out.printf("1부터 %d 까지 더한 값 : %d%n", i, sum);
		}	
		/*
			 		sum	+ i	  sum
			 i = 1 → 0 + 1  →  1
			 i = 2 → 1 + 2	→  3
			 i = 3 → 3 + 3  →  6
			 i = 4 → 6 + 4  →  10
			 i = 5 → 10 + 5 →  15		
		*/
			
		}
	public void for3() {
		// 중첩 for문 예제 : 별 찍기 (가로 8개씩 5줄로)
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 8; j++) {
				System.out.print("*");		// 줄바꿈 없이 출력하기 위해
			}	
			System.out.println(); 		// 8번 돌아 * 8개 찍은 후 줄바꿈
		} 
		
		/* 결론적으로 바깥 큰 for문이 1번 돌 때
		   안쪽 작은 for문은 8번 돌게 된다.
		   ∴ i가 5가 될 때까지 반복을 수행함
		 */
	}
	public void for4() {
		// 중첩 for문 예제2 : 별 찍기 (트리 모양으로 맨 밑은 * 5개)
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {	// 
				System.out.print("*");
			}	
			System.out.println();
		}
	}
	public void for5() {
		// 3부터 15까지 임의의 난수를 정해 1부터 난수까지의 정수 합 출력하기
		
		int random = (int)(Math.random() * 15 + 1);
		
		int sum = 0;
		
		for(int i = 3; i <= random; i++) {
			sum = sum + i;
		}
			System.out.println("3부터 " + random + "까지의 합 : " + sum);
	}
	public void StringResultNull() {
		// 1부터 50까지 임의의 난수를 뽑아 홀수인지 짝수인지 판별하기
		
		int random = (int)(Math.random() * 50 + 1);
		
		String result = null;
		
		if(random % 2 != 0) {
			result = "홀수";
		} else {
			result = "짝수";
		}
		System.out.println("추첨된 수는 " + random + "로 " + result + "입니다.");
	}
	public void for6() {
		// 별 찍기
		// 한 줄에 *가 5번 출력되는데, 그 줄은 사용자가 입력한 만큼 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 줄 수를 입력 : ");
		int row = sc.nextInt();
		
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print("*");
			} System.out.println();
		}
	}
	public void for4_1() {
		// 트리 모양으로 별 찍기 총 10줄
		
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			} System.out.println();
		}
	}
	public void for4_2() {
		// 트리 모양으로 별 찍기 (사용자가 입력한 줄 수 만큼)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 트리 줄 수를 입력하세요 : ");
		int row = sc.nextInt();
		
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			} System.out.println();
		}
	}
	
	
	public void while1() {
		// 1부터 몇까지 더해야 100을 넘지 않는지 알아보기
		
		int sum = 0;
		int i = 0;
		while(sum <= 100) {	// sum이 100 안 넘을 때까지 증가
			System.out.printf("%d : %d%n", i, sum);
			sum += ++i;	// i를 계속 증가시켜 더해야 함
			// 누적은 sum에다가 하기
		}
	}
	public void while2() {
		// 정수 두 개를 입력 받아 그 사이 숫자를 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 두 개를 입력하세요.");
		System.out.println("단, 첫 번째 숫자는 두 번째보다 작아야 합니다.");
		System.out.print("첫 번째 숫자 : ");
		int first = sc.nextInt(); 
		System.out.print("두 번째 숫자 : ");
		int second = sc.nextInt();
		
		// 숫자를 서로 반대로 입력할 경우도 고려하자.
		
		int min = 0;
		int max = 0;
		
		if(first > second) {
			max = first;
			min = second;
		} else {
			min = first;
			max = second;
		}
		
		while(min <= max) {
			System.out.println(min);
			min++;
		}
	}
	public void while3() {
		// 1부터 10 사이의 임의 난수를 정하자.
		// 그리고 1부터 난수까지의 정수 합을 도출하자.
		
		int random = (int)(Math.random() *10 + 1);
		
		int sum = 0;
		
		int i = 1;
		while(i <= random) {
			sum += i; // sum = sum + i;
			i++;
		}
		System.out.println("1부터 " + random + "까지의 합 : " + sum);		
	}
	public void while3_1() {
		// 1부터 10 사이의 임의 난수를 정하자.
		// 그리고 1부터 난수까지의 정수 합을 도출하자.
		
		int random = (int)(Math.random() * 10 + 1);
		
//				// 1부터 난수까지 1씩 증가시킨 정수의 합
//		for(int i = 1; i <= random; ++i) {
//			sum += i; // i부터 random까지의 누적 합을 구하는 식..
//		}
		int sum = 0;
		
		int i = 1;
		while(i <= random) {
			sum += i;
			++i;
		}		
		System.out.println("1부터 " + random + "까지 합 : " + sum);
	}
	public void for7() {
		// 문자열을 입력 받아 인덱스 별로 문자 출력
		// 문자열 입력 : apple
		// 0 : a
		// 1 : p
		// 2 : p		제로인덱스는 0부터 시작
		// 3 : l
		// 4 : e
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		for(int i = 0; i <= 4; i++) {
			char ch = str.charAt(i); // i 수만큼 돌 거니까
			System.out.println(i + "는 " + ch);
		}
	}
	public void for7_1() {
		// 문자열을 입력 받은 후, 메소드 length()를 활용해
		// 인덱스 별로 문자를 출력해보도록 하자.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();	// 문자열 받아오기
		
		// 문자열 길이를 반환하는 메소드 사용 (글자 수니까 int)
		int length = str.length();	// 문자열 길이
		
		// 길이를 얻었으니까 인덱스 별로 문자 붙이기
		for(int i = 0; i < length; i++) {	// 제로인덱스는 0부터라 '<' 사용
			char ch = str.charAt(i);		// str 문자열에서 ch 문자 뽑기
			System.out.println(i + " 는 " + ch);
		}
	}
	public void for7_2() {
		// for7_1 압축하기.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println(i + " 는 " + ch);
		}
	}
}
