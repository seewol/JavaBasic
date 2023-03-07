package com.kh.example.chap03_assist.part02_object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.example.chap03_assist.part02_object.model.vo.Member;

public class ObjectDAO {
	public void fileSave() {
		Member[] mArr = {	// 3개의 배열을 가지고 있는 객체 배열 생성 (import 함)
				new Member("user01", "pass01", "강건강", "kang123@iei.or.kr", 25, '남', 1257.3),
				new Member("user02", "pass02", "남나눔", "nam123@iei.or.kr", 17, '남', 1242.0),
				new Member("user03", "pass03", "도대담", "doh123@iei.or.kr", 32, '남', 2614.5)
		};
		
		// 객체를 입력, 출력하는 보조 스트림은 바이트 기반밖에 없기 때문에 Stream 가능
		// 따라서 writer나 reader같은 문자 기반은 쓸 수 없음!
		
		// ★ 객체를 파일에 쓰고 싶다
		try(FileOutputStream fos = new FileOutputStream("d_object.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) { // IOException을 throws 하고 있음
			for(int i = 0; i < mArr.length; i++) {
				oos.writeObject(mArr[i]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileOpen() {
		Member[] mArr = new Member[5];
		
		// ★ 파일에 저장된 객체를 읽어오고 싶다
		try (FileInputStream fis = new FileInputStream("d_Object.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);) {
			
			int i = 0;
			while(true) {
				mArr[i] = (Member)ois.readObject();
				i++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			for(int i = 0; i < mArr.length; i++) {
				System.out.println(mArr[i]);
			}
		} catch (IOException | ClassNotFoundException e) {
				// 상속 관계가 아닐 때 | 하나로 여러 개를 묶어 하나의 catch절로 사용 가능하다
			e.printStackTrace();
		}
	}
	public void appendFile() {
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_object.txt", true));) {
			
			Member m = new Member("user04", "pass04", "류라라", "ryu123@iei.or.kr", 17, '여', 913.2);
			oos.writeObject(m);
			
			// 객체에 대한 입출력을 할 때는 이어쓰기 X -> 덮어쓰기를 해야 함
			// 이어쓰기 하면 내용이 달라져서 무조건 에러가 생기기 때문이다.
			// 원래 있던 객체를 비어있는 객체 배열에 넣어둔다. (3개 담긴 배열 만들어짐)
			// 배열의 크기를 키워놓거나 원래 크게 해놓고 추가하고자 하는 객체(류라라)를 넣는다
			// 그 객체를 넣은 새 배열 기존의 배열에 덮어쓰기 한 후 불러오거나 해야 함
			
			// 직렬화는 내용이 변경되면 안 됨
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
