package array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ArrayPractice {
	public void practice1() {
//		길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//		순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
		
	}
	public void practice2() {
//		길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//		역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요
		
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
			System.out.print(arr[i] + " ");
		}
		
	}
	public void practice3() {
//		사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
//		1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
		
	}
	public void practice4() {
//		길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
//		배열 인덱스를 활용해서 귤을 출력하세요.
		
		String[] sArr = new String[5];
		
		sArr[0] = "사과";
		sArr[1] = "귤";
		sArr[2] = "포도";
		sArr[3] = "복숭아";
		sArr[4] = "참외";
		
		System.out.println(sArr[1]);

	}
	public void practice5() {
//		문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
//		개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0); // 문자 입력받기
		
		char[] chArr = new char[str.length()]; // length() 문자열 길이를 반환하는 메소드
		// 문자열 길이 만큼의 배열 chArr을 생성
		
		int count = 0;
		
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		
		for(int i = 0; i < str.length(); i++) {
			chArr[i] = str.charAt(i); // 배열 인덱스 i번째에 i번째 문자를 저장 (인덱스로 초기화)
			// 문자열 길이 만큼의 배열 chArr
			
//			chArr[0] = e;
//			chArr[1] = v;
//			chArr[2] = e;
//			chArr[3] = r;
//			chArr[4] = y;
			
			if(ch == chArr[i]) {	// 입력받은 문자가 배열 chArr 인덱스에 저장된 것과 같으면 count를 증가시킨다.
				count++;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println(ch + " 개수 : " + count);
	}
	public void practice6() {
//		“월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
//		입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
//		범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
		
		String[] arr = {"월", "화", "수", "목", "금", "토", "일"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num >= 0 && num <= 6) {
			System.out.println(arr[num] + "요일");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 넣을 값 : ");
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println();
		System.out.println("총 합 : " + sum);
		
		
	}
}
