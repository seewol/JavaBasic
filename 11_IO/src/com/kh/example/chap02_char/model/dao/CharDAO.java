package com.kh.example.chap02_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharDAO {
	public void fileSave() { // 파일이 있어야 읽어오니까 쓰는 것부터 진행

		// 파일에 데이터를 문자단위로 쓰고 싶다
		FileWriter fw = null;

		try {
			fw = new FileWriter("b_char.txt", true);

			fw.write("와! IO 재밌다^^ㅎ!");
			fw.write('A');
			char[] cArr = { 'a', 'p', 'p', 'l', 'e' };
			fw.write(cArr);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void fileSave2() { // 주석은 지워줌

		try (FileWriter fw = new FileWriter("b_char.txt", true);) {

			fw.write("와! IO 재밌다^^ㅎ!");
			fw.write('A');
			char[] cArr = { 'a', 'p', 'p', 'l', 'e' };
			fw.write(cArr);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void fileOpen() {
		// 파일로부터 데이터를 문자단위로 읽어오고 싶다

		FileReader fr = null;

		try {
			fr = new FileReader("b_char.txt");

//			// 1. 배열에 데이터 담아서 출력
//			int size = (int)new File("b_char.txt").length();
//			char[] chArr = new char[size];
//			fr.read(chArr);
//			
//			for(int i = 0; i < chArr.length; i++) {
//				System.out.println(chArr[i] + " ");
//			}

			// 2. 하나씩 읽어오면서 바로 출력

//			int value;
//			while((value=fr.read()) != -1) {
//				System.out.println((char)value +" ");
//			}

			while (true) {
				int value = fr.read();
				if (value == -1) { // read 메소드는 끝에 닿으면 -1을 반환함
					break; // 그니까 -1이 아닐 때까지만 돌도록 하는 것
				}
				System.out.print((char) value + " ");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void fileOpen2() { // 주석은 지움

		try (FileReader fr = new FileReader("b_char.txt");) {

			while (true) {
				int value = fr.read();
				if (value == -1) { // read 메소드는 끝에 닿으면 -1을 반환함
					break; // 그니까 -1이 아닐 때까지만 돌도록 하는 것
				}
				System.out.print((char) value + " ");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
