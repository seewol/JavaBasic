package com.kh.example.chap00_file.controller;

import java.io.File;
import java.io.IOException;

public class FileController {
	public void method() {

		try {
			// ★ 파일 생성
			File f1 = new File("test.txt"); // File은 기본 생성자가 없어서 매개변수 생성자를 만듦
			f1.createNewFile();				// 오류가 나서 봤더니 IOException 발생. 잡아줘야 함
			// 파일을 만들 경로를 지정해주지 않으면 프로젝트 최상단에 파일 생성
			
			File f2 = new File("c:/test/test.txt"); // c 드라이브 안에 test 폴더 만들고 test 텍스트 파일 만들겠다
							 // c:\\text\\test.txt 와 같음 (진짜 역슬래쉬를 하나를 쓰려면 \\ 두 번 써야 함)
			f2.createNewFile();
			
			File f3 = new File("c:\\temp1\\temp2"); // 경로만
			File f4 = new File("c:\\temp1\\temp2\\test.txt"); // 파일까지
//			f4.createNewFile();
			// 파일 만들 경로를 지정해주지 않으면 파일까지 알아서 만들어주지는 않고 에러 발생
			// ★ 디렉토리 생성
			f3.mkdirs(); 		// 경로를 만듦 (make directory 여러 개!)
			f4.createNewFile(); // 경로를 만들어준 후 실행하니 파일이 생겼다
			f4.delete(); 		// 하지만 바로 만들었던 파일 삭제
								
			// ★ 존재 여부 확인
			System.out.println(f2.exists());	// test 폴더의 test 파일
			System.out.println(f3.exists());	// 폴더 자체
			System.out.println(f4.exists());	// 폴더에 들어가는 test라는 파일 (마지막에 삭제해서 false)
			
			System.out.println(f3.isFile());	// 파일 여부 확인 (파일이 아니라 폴더라 false)
			
			System.out.println(f1.getName());			// 파일 명
			System.out.println(f1.getAbsolutePath());	// 절대 경로 (절대적인 경로)
			System.out.println(f1.getPath());			// 상대 경로 (상대적으로 나오는 경로)
			System.out.println(f1.length());			// 파일 크기
			
		} catch (IOException io) { // IOException을 부를 수 있는 e라고 이름 설정
			io.printStackTrace();  // 이름 설정은 꼭 e가 아니어도 된다
		}

		// 이후 패키지를 선택하고 f5를 누르면 text.txt 파일이 생긴 걸 알 수 있다.
		// d 드라이브를 확인해 보면 파일이 프로그램 최상단에 생성된 것을 확인 가능함
	}
}
