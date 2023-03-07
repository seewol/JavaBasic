package com.kh.example.array;

import java.util.Arrays;

import javax.sound.midi.SysexMessage;

public class B_ArrayCopy {
	public void method1() {
		
		// ★ 얕은 복사
		
		int[] originArr = {1, 2, 3, 4, 5}; // 배열, 할당, 초기화 한 번에!
		int[] copyArr = originArr;
		
		// 얕은 복사 후, 같은 주소 값을 가졌는지 확인하자.
		
		System.out.println("originArr : " + originArr);
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		
		System.out.println("copyArr : " + copyArr);
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		
		// originArr[0]의 값을 99로 바꾸고 copyArr의 인덱스 0 값을 보자.
		
		System.out.println();
		System.out.println("originArr[0] = 99;");
		
		originArr[0] = 99;
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
	}

	public void method2() {
		
		// ★ 깊은 복사
		
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[5]; // 별도의 새 공간 생성
		
		System.out.println("originArr : " + originArr);
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		System.out.println("copyArr : " + copyArr);
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		
		// 각각 세팅을 마쳐놓은 상태
		
		// ◆ 1. for문을 이용한 1:1 값 복사
		for(int i = 0; i < originArr.length; i++) {
			copyArr[i] = originArr[i];
		}
		
		// 원본 배열이 바뀌어도 복사된 배열에 영향을 끼치지 않는지
		// originArr[0]만 99로 바꾸어 저장해줌.
		
		originArr[0] = 99;
				
		System.out.println("originArr : " + originArr);
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		System.out.println("copyArr : " + copyArr);
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
	}
	public void method3() {
		
		// ◆ 2. arraycopy()를 이용한 복사
		
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[10]; // 별도의 새 공간 생성
		
		System.out.println("originArr : " + originArr);
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		System.out.println("copyArr : " + copyArr);
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		
		// System.arraycopy(원본 배열, 복사 시작 위치, 복사 배열,
		//					붙여넣기 시작할 위치, 복사 길이)
		
		// Q. 원본 배열의 0번째부터 원본 배열의 길이만큼 복사 후,
		// 복사 배열 3번째부터 붙여넣자.
		
		System.arraycopy(originArr, 0, copyArr, 3, originArr.length);
		
		System.out.println("originArr : " + originArr);
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		System.out.println("copyArr : " + copyArr);
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}	
		System.out.println();
	}
	public void method4() {
		
		// ◆ 3. arrays.copyOf() 를 이용한 복사
		// → arrays 클래스에 있는 copyOf()
		
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[10]; // 별도의 새 공간 생성
		
		System.out.println("originArr : " + originArr);
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		System.out.println("copyArr : " + copyArr);
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}	
		System.out.println();
		
		// Arrays.copyof(original, newLength)
		//		original : 원본 배열
		//		newLength : 복사할 길이 or 새로운 배열의 크기
		
		copyArr = Arrays.copyOf(originArr, originArr.length);
//	   	길이 10										  길이 5
		
		System.out.println("originArr : " + originArr);
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		System.out.println("copyArr : " + copyArr);
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}	
		System.out.println();
	}
}
