package com.kh.example.chap03_assist.part01_buffer.model.dao;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferDAO {
	public void inputByte() {
		// 파일에 있는 데이터를 바이트 기반으로 빠르게 읽어오고 싶다
		// File				Stream			input
		//							 Buffered
		try(FileInputStream fis = new FileInputStream("c_buffer.txt");			// 기반 스트림
			BufferedInputStream bis = new BufferedInputStream(fis);) {	// 보조 스트림
			
			int value;	// 변수에 담지 않으면 read를 두 번 쓰니까 퐁당퐁당 출력돼서 그를 막기 위해 변수에 담음 
			while((value = bis.read()) != -1) { ; // 끝에 도착하면 -1 반환하니까 -1 아닐 때까지 돌아라
				System.out.print((char)value); // int형이니 char를 이용해 문자로 형변환
			}
						
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 보조 스트림 안에 기반 스트림이 들어있기 때문에, bis를 닫으면 fis도 자동으로 닫힘
		
		// try~with~resource를 통해 자동으로 close() 처리를 하는데
		// 그때 close()가 IOException을 위임했기 때문에 
		// IOException에 대한 예외 처리(catch)를 해줘야 한다
		
	}
	public void outputByte() {
		// 파일에 바이트 기반으로 데이터를 빠르게 쓰고 싶다
		// File		Stream				output
		// 						Buffered						// 객체 생성한 것 바로 넣기			// 이어쓰기
		try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("c_buffer.txt", true));) {
			bos.write(65);
			
			byte[] bArr = {66, 67, 68, 69};
			bos.write(bArr);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) { 
			e1.printStackTrace();
		}
		
	}
	public void outputChar() {
		// 파일에 문자 기반으로 데이터를 빠르게 쓰고 싶다
		// File	writer				
		//					Buffered
		try (FileWriter fw = new FileWriter("c_buffer2.txt");
			BufferedWriter bw = new BufferedWriter(fw);) {
			bw.write("안녕하세요\n");
			bw.write("어쿠루브\t");
			bw.write("헤어지던 밤");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public void inputChar() { // 읽어들이는 것
		
		try (BufferedReader br = new BufferedReader(new FileReader("c_buffer2.txt"));) {
//			FileReader fr = new FileReader("c_buffer2.txt");
//			BufferedReader br = new BufferedReader(fr);
			String temp;
			while((temp = br.readLine()) != null) {	
				System.out.println(temp);
			}
			// readline()은 한 문장씩 읽어오는 것 (지금까지는 1 byte or 한 글자씩이었는데)		
			// 끝에 도달하면 null을 반환한다
			// 마찬가지로 readLine을 두 번 쓰면 퐁당퐁당이 되니까 String 타입 변수에 담아주기
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
	public void inputIO() {
		// IO로 Scanner 만들기
		// 사용자가 숫자를 입력하면 그 숫자의 3배가 된 값 출력
								// 문자 기반,								byte 기반
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 보조 스트림을 중첩으로 사용할 수 있다 → 안에 기반 스트림이 존재한다면!
		
		System.out.print("정수 한 개를 입력하세요 : ");
		try {
			String value = br.readLine(); // 문자열로 받아서 파싱하는 작업
			int num = Integer.parseInt(value);
			
			System.out.println("X3 : " + (num*3));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
