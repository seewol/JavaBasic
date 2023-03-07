package com.kh.example.chap01_String.controller;

import java.util.StringTokenizer;

public class StringController {
	public void method1() {

		String str1 = "java";		// String은 클래스, 참조 자료형, 주소 값 有
		String str2 = "java";		// toString이 오버라이딩 되어있다
		String str3 = new String("java");
		
//		△ 원래는 str1을 출력하면 주소 값이 나와야 함
//		하지만 println(str1)을 실행시키면 "java"가 나옴
//		그럼 주소 값이 나오게 하려면? hashCode() 사용! (아래로)
		
										// 문자열 주소 값 같은지 비교는 == 사용
		System.out.println("str1과 str2의 주소는 같은가? " + (str1 == str2));
		System.out.println("str1과 str3의 주소는 같은가? " + (str1 == str3));
										// 문자열 값 비교는 equals() 사용
		System.out.println("str1과 str2의 값은 같은가? " + (str1.equals(str2)));
		System.out.println("str1과 str3의 값은 같은가? " + (str1.equals(str3)));
		
		
		// hashCode() :: 주소 값을 숫자로 표현한 것
		System.out.println("str1의 hashCode : " + str1.hashCode());
		System.out.println("str2의 hashCode : " + str2.hashCode());
		System.out.println("str3의 hashCode : " + str3.hashCode());
		// 규약 : equals() 결과 값이 같으면(true) hashCode도 같은 값이 나온다
		
		
		// 실 주소 값을 알아내려면? :: System.identityHashCode()
		System.out.println("str1의 실주소 값 : " + System.identityHashCode(str1));
		System.out.println("str2의 실주소 값 : " + System.identityHashCode(str2));
		System.out.println("str3의 실주소 값 : " + System.identityHashCode(str3));
		
		
		str2 += "최고";
		System.out.println("str1과 str2의 주소는 같은가? " + (str1 == str2));
		System.out.println("str1의 실주소 값 : " + System.identityHashCode(str1));
		System.out.println("str2의 실주소 값 : " + System.identityHashCode(str2));
		System.out.println("str3의 실주소 값 : " + System.identityHashCode(str3));
		
	}
	public void method2() {
		// StringBuffer or StringBuilder
		// String을 이용해서 어떤 문자열을 작업할 때 계속해서 값을 변경해야 하는 경우
		// String클래스의 특징인 불변을 보았을 때 계속해서 새로운 값이 생기고
		// 참조 위치를 바꿔줘야 해서 가비지 컬렉터가 반복해서 지워줘야 하는 단점이 생김.
		// 따라서 변경이 적고 읽기만 많은 경우에는 불변 클래스인 String이 더 용이함.
		// 하지만 변경해야 하는 값이 많은 경우는 가변 클래스인 StringBuilder, STringBuffer가 더 용이
		// StringBuilder, StringBuffer는 내부에 문자를 저장할 수 있는 버퍼를 지니고 있어
		// 문자가 저장됨에 따라 버퍼의 크기가 자동으로 증가되기도 함
		// 두 클래스의 유일한 차이점은 동기화 유무, 그 외의 모든 것은 다 같음(심지어 메소드 명도)
		
		StringBuffer buffer1 = new StringBuffer();
		System.out.println("초기 buffer1의 수용량 " + buffer1.capacity());
		System.out.println("buffer1에 들어있는 실제 값의 길이 : " + buffer1.length());
		
		System.out.println();
										// 숫자를 넣어봄
		StringBuffer buffer2 = new StringBuffer(100);
		System.out.println("초기 buffer2의 수용량 " + buffer2.capacity());
		System.out.println("buffer2에 들어있는 실제 값의 길이 : " + buffer2.length());
		
		System.out.println();	
										// 문자열을 넣어둠
		StringBuffer buffer3 = new StringBuffer("abc");
		System.out.println("초기 buffer3의 수용량 " + buffer3.capacity());
		System.out.println("buffer3에 들어있는 실제 값의 길이 : " + buffer3.length());
		// 처음 수용량 16에 추가한 문자열 길이 3을 더해서 수용량 19가 나옴
		
		System.out.println();	
		
		System.out.println("buffe3의 실주소 값 : " + System.identityHashCode(buffer3));
		
		
//		★ 뒤에 문자열 붙이는(삽입하는) 메소드
		// append(String str):StringBuffer 
		
//		 buffer3은 String 타입 → append의 반환 타입이 StringBuffer라
//		 buffer3.append("abc"); 는 StringBuffer가 됨
		
//		원래 abc / append한 abc / append한 def
		buffer3.append("abc").append("def");	// 메소드 체이닝
		System.out.println(buffer3);
		System.out.println("buffe3의 실주소 값 : " + System.identityHashCode(buffer3));
		// 문자열 추가된 이전과 이후의 실주소 값이 같은 것을 확인할 수 있다
		
		// 이해할 때 도움 되는 예시
//		sc.nextLine().equals(""); // 메소드 체이닝을 통해 String 타입 안의 equals() 호출
//		sc.nextLine().charAt(1);
		
		System.out.println();
		
//		★ 중간 문자열 삽입
		// insert(int offset, String str):StringBuffer 
		buffer3.insert(2, "zzz"); // 해당 인덱스 값 '2' 에 문자열 'zzz'을 추가한다는 의미
		System.out.println(buffer3);
		// append는 문자열을 뒤에 삽입, insert는 문자열을 중간에 삽입 가능
		
//		★ 문자열 삭제 메소드
		// delete(int offset, int end):StringBuffer 
		buffer3.delete(2, 5);			// start <= index < end
		System.out.println(buffer3);	// 대부분 end까지는 포함하지 않는다
		// 따라서 인덱스 2번째 ~ 4번째까지가 delete 되는 것
		
//		★ 문자열 거꾸로 뒤집는 메소드
		// reverse():StringBuffer 
		buffer3.reverse();
		System.out.println(buffer3);
		
		StringBuffer sb = new StringBuffer("abc");
		sb.append("zzz").insert(2, "yy").reverse().delete(1, 3);
//		abczzz → abyyczzz → zzzcyyba → zcyyba
		System.out.println(sb);
		
		System.out.println();
	}
	
	public void method3() {
		// equals() charAt() hashCode() + String 메소드
		
		String str = "Hello world";
		
//		문자열에서 문자 추출하는 메소드
		// charAt(int index):char
		char ch = str.charAt(4);
		System.out.println(ch);
		
//		원래 있던 str과 매개변수 값을 이어 붙이는 메소드
		// concat(string str):String
		String concatStr = str.concat("!!!");
		System.out.println(concatStr);
		str += "!!!";	// 우리가 쓰던 연산자 + "!!!"와 똑같은 역할을 함
		System.out.println(str);
		
//		문자열 비교 메소드
		// equals(Object anObject):boolean
		System.out.println(concatStr.equals(str));
		
//		문자열 중 일부만 반환하는 메소드
		// subString(int beginIndex):String
		// substring(int beginIndex, int endIndex):String
		// 내가 가진 문자열에서 일부만 반환
		System.out.println(str.substring(6));
		System.out.println(str.substring(0, 4)); // 0~3만 해당 0 <= index < end
		
//		문자열을 대체하고 싶을 때 쓰는 메소드
		// replace(char oldChar, char newChar):String
		System.out.println(str.replace("l", "e"));
		
//		문자열 전체를 대문자, 소문자로 바꾸는 메소드
		// toUpperCase()/toLowerCase():String
		System.out.println(str.toUpperCase()); // 大
		System.out.println(str.toLowerCase()); // 小
		
//		toUpperCase나 toLowerCase 쓰지 않고도 바꾸는 메소드
		// equalsIgnoreCase(String anotherString):boolean
		String str2 = "ApplE";
		String str3 = "apple";
		System.out.println(str2.equals(str3)); // 대소문자 비교로 false
		System.out.println(str2.equalsIgnoreCase(str3)); // 대소문자 상관 없이 비교 가능
		
//		문자열 앞 뒤 빈 공간을 제거한 후 반환하는 메소드 (문자열 사이 X)
		// trim():String
		String str4 = "     Java";
		String str5 = "Java     ";
		String str6 = "     Ja     va     ";
		System.out.println(str4 + ":" + str4.trim());
		System.out.println(str5 + ":" + str5.trim());
		System.out.println(str6 + ":" + str6.trim());
		// 로그인 할 때 공백 제거 용으로 굉장히 많이 사용 (사용자 편의 고려)
		
//		매개변수로 받은 문자열을 분리시켜주는 메소드
		// split(String str):String[] → String 배열 타입으로 반환
		String splitStr = "Apple, Banana, Orange, Grape, Kiwi, Peach";
		String[] splitArr = splitStr.split(", ");
		for(int i = 0; i < splitArr.length; i++) {
			System.out.println(splitArr[i]);
		}
		
	}
	
	public void method4() {
		String str = "Red, Green, Blue, Black, pink, Yellow, White";
		StringTokenizer stObj = new StringTokenizer(str, ", ");
		System.out.println("분리된 문자열 개수 : " + stObj.countTokens());
		
		while(stObj.hasMoreTokens()) { // 안에 토큰 있니?
			System.out.println(stObj.nextToken()); // 그럼 가져와!
		}
		
		// 위에서 값을 하나씩 꺼냈는데 뭐가 남을까
		System.out.println("값을 꺼낸 후 문자열 개수 : " + stObj.countTokens());
		
		System.out.println();
		
		// 왜 STringTokenizer를 쓸까?
		String str2 = "Java,Oracle JDBD-HTML CSS,JavaScript-Framework";
		StringTokenizer st = new StringTokenizer(str2, ", -"); // , 띄어쓰기 -
		System.out.println("분리된 문자열 개수 : " + st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
	
}
