package com.kh.example.array;

public class A_Array {
	public void method1() {
		
		// 이름 arr, int 값 저장하는 9개 배열 공간 생성
		
		int[] arr; // 선언 : 배열명 arr이라는 공간을 Stack에 저장
		arr = new int[9]; // 할당 : int 타입의 9개 배열 공간을 Heap 메모리에 생성
		
		// 확인 1. arr에 주소 값이 들어가있는지 확인해보자.
		
		System.out.println("arr : " + arr);
		
		// 확인 2. 배열 arr에 자료형 기본 값이 들어있는지 확인하자.
		
		System.out.println(arr[0]);		
		System.out.println(arr[1]);		
		System.out.println(arr[2]);		
		System.out.println(arr[3]);		
		System.out.println(arr[4]);		
		System.out.println(arr[5]);		
		System.out.println(arr[6]);		
		System.out.println(arr[7]);		
		System.out.println(arr[8]);		
		
		System.out.println();
		
		// 위의 출력 내용을 for문 이용으로 간단히 해 보자.
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// 초기화 1. 인덱스를 이용해 초기화하기
		arr[0] = 10;	// → 각각의 인덱스에 내가 값을 집어 넣기
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 60;
		arr[6] = 70;
		arr[7] = 80;
		arr[8] = 90;
		
		// 초기화 2. 위 내용을 for문을 이용해 초기화하기 (규칙적)
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1) * 10;
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
	}
	public void method2() {
		// 선언과 할당 동시에 해 보기
		
		int[] iArr = new int[5];
//		double[] dArr = new double[2];
				
		// 각각 for문을 이용해 출력해보자.
		
		for(int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i] + " ");
		}
		System.out.println();
		System.out.println("iArr : " + iArr);
		
		
		// 선언과 할당, 초기화 한 번에 해 보기
		double dArr[] = {0.1, 0.2, 0.3, 0.4, 0.5, 5.555};
//			인덱스 넘버  →   0		1	2	3	  4	    5	
		for(int i = 0; i < dArr.length; i++) {
			System.out.print(dArr[i] + " ");
		}
		System.out.println();
		
		// 5개였던 iArr 배열을 27개로 늘려보자.
		
		iArr = new int[27];
		
		for(int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i] + " ");
		}
		System.out.println("iArr : " + iArr);
		
		iArr = null; // 배열 삭제
	}
}
