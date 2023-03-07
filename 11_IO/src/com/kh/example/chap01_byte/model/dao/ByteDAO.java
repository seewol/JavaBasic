package com.kh.example.chap01_byte.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDAO {
	public void fileOpen() {

		FileInputStream fis = null;

		try {
			// 파일로부터 byte 단위로 데이터를 읽어올 수 있는 스트림
			fis = new FileInputStream("a_byte.txt");

//			// 값을 읽어오는 방법
//			
//			// 1. 파일의 크기를 가져와 배열을 만들어 저장한 후 출력
//			File file = new File("a_byte.txt");
//			long size = file.length();
//			byte[] bArr = new byte[(int)size];
//			fis.read(bArr);
//			
//			for(int i = 0; i < bArr.length; i++) {
//				System.out.print(bArr[i] + " ");
//			}					// 문자로 바꾸고 싶으면 char로 형변환하면 됨
			
			System.out.println();

			// 2. 배열을 사용하지 않고 하나씩 바로 출력

//			int value;
//			while((value=fis.read()) != -1) { // -1일 때까지 돌아야 하니까 -1이 아닐 때만 돌라는 의미
//				System.out.print((char)value + " ");
//			} // 하나는 while 조건부에 쓰고, 하나는 읽어올 때 쓰고 반복되어 퐁당퐁당으로 결과가 나옴

			while (true) {
				int value = fis.read();
				if (value == -1) {
					break; // break; 걸리면 나가서 else 안 써도 됨
				}
				System.out.print((char) value + " ");
			}

		} catch (FileNotFoundException e) { // 만들어진 게 없어서 에러 뜸
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void fileOpen2() {
		
		try(FileInputStream fis = new FileInputStream("a_byte.txt");) {

			System.out.println();

			while (true) {
				int value = fis.read();
				if (value == -1) {
					break;
				}
				System.out.print((char) value + " ");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void fileSave() {

		FileOutputStream fos = null; // 전역변수가 되도록 밖으로 빼줌
		// 왜냐면 finally에 fos.close()를 불러왔기 때문에 !
		try {
			// 파일에 byte단위로 데이터를 작성하는 스트림
			fos = new FileOutputStream("a_byte.txt", true);
			// 원래 작성해주는 스트림이지만 알아서 생성까지 해 줌.

			// write(int b) : void
			fos.write(97); // 아스키 코드 'a'로 저장됨

			// write(byte[] b) : void
			byte[] bArr = { 98, 99, 100, 101, 102, 103 };
			// b c d e f g
			// 0 1 2 3 4 5
			fos.write(bArr);

			// write(byte[] b, int off, int len) : void
			// off : 시작하는 위치, len : 내가 쓸 바이트 개수
			fos.write(bArr, 0, 2);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { // 부모 클래스가 가장 밑으로!
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// fos에 노란 줄을 확인해 보면 열려줘서 닫아야 한다
		// 에러가 나도 한 번 열어준 길은 꼭 닫아줘야 한다
	}
	
	public void fileSave2() {
		
	
		// 왜냐면 finally에 fos.close()를 불러왔기 때문에 !
		try(FileOutputStream fos = new FileOutputStream("a_byte.txt", true);) {
			// 파일에 byte단위로 데이터를 작성하는 스트림
			
			// 원래 작성해주는 스트림이지만 알아서 생성까지 해 줌.

			// write(int b) : void
			fos.write(97); // 아스키 코드 'a'로 저장됨

			// write(byte[] b) : void
			byte[] bArr = { 98, 99, 100, 101, 102, 103 };
			// b c d e f g
			// 0 1 2 3 4 5
			fos.write(bArr);

			// write(byte[] b, int off, int len) : void
			// off : 시작하는 위치, len : 내가 쓸 바이트 개수
			fos.write(bArr, 0, 2); // 배열에서 0번째 1번째

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { // 부모 클래스가 가장 밑으로!
			e.printStackTrace();
		} 
		
	}
}
