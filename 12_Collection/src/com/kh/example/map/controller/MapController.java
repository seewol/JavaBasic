package com.kh.example.map.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

import com.kh.example.map.model.compare.SnackCompare;
import com.kh.example.map.model.vo.Snack;

public class MapController {
	public void doMap() {
		HashMap<String, Snack> map = new HashMap<String, Snack>();
		// put(K key, V value):V 
		System.out.println(map.put("새우깡", new Snack("짠맛", 1500)));
		map.put("다이제", new Snack("단맛", 2500));
		map.put("포테이토칩", new Snack("짠맛", 1500));
		map.put("고소미", new Snack("고소한맛", 1000));
		
		System.out.println("map : " + map);
		
		System.out.println(map.put("새우깡", new Snack("매운맛", 1500)));
		System.out.println("map : " + map);
		
		System.out.println();
		
		// containsKey(Object key):boolean
		// containsValue(Object Value):boolean
		System.out.println(map.containsKey("새우깡"));
		System.out.println(map.containsKey("홈런볼"));
		System.out.println(map.containsValue(new Snack("짠맛", 1500)));
		
		System.out.println();
		
		// get(Object key):V
		System.out.println(map.get("새우깡"));
		System.out.println(map.get("홈런볼"));
		
		System.out.println();
		
		// iterator은 List와 Set에서만 사용 가능
		// 따라서 Map에서는 검색하는 방법이 따로 있다
		
		// 객체 검색 1. keySet():Set<K>
		// 맵에 담긴 Key를 Set으로 묶어서 반환하는 메소드
		
		Set<String> set1 = map.keySet();		// Key는 String 타입 <K>가 Key
		Iterator<String> it1 = set1.iterator(); // 이제 Set에서는 iterator 쓸 수 있음
		while(it1.hasNext()) {
			String key = it1.next();		// key 뽑아냄
			Snack value = map.get(key);		// value 뽑아냄
			System.out.println(key + "=" + value);
		}
		
		// 향상된 for문을 이용해서 반환하는 방법
		for(String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		
		System.out.println();
		
									// Entry : 키와 값의 쌍
		// 객체 검색 2. entrySet():Set<Map.Entry<K, V>>
		// entry를 Set으로 묶어서 반환하는 것
		// 타입 Set이 반환되나 Entry가 담겨있는 상태
		
		Set<Entry<String, Snack>> set2 = map.entrySet();
		Iterator<Entry<String, Snack>> it2 = set2.iterator();
		while(it2.hasNext()) {
			Entry<String, Snack> entry = it2.next();
			String key = entry.getKey();
			Snack value = entry.getValue();
			System.out.println(key + "-" + value);
		}
		
		// 향상된 for문을 이용해서 반환하는 방법
		for(Entry<String, Snack> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		System.out.println();
		
		TreeMap<String, Snack> map2 = new TreeMap<String, Snack>(map);
		System.out.println("map2 : " + map2);
		
		System.out.println();
		
		// 이름 내림차순
		TreeMap<String, Snack> map3 = new TreeMap<String, Snack>(new SnackCompare());
		map3.putAll(map2);
		System.out.println("map3 : " + map3);
		
		System.out.println();
		
		//size():int
		System.out.println(map3.size());
		
		System.out.println();
		
		// remove(Object key):V
		System.out.println(map3.remove("다이제")); // value를 반환하고 삭제
		System.out.println("map3 : " + map3);
		
		System.out.println();
		
		// remove(Object key, Object value):boolean
		System.out.println(map3.remove("고소미", new Snack("고소한맛", 1000)));
		System.out.println("map3 : " + map3); 	// boolean 값을 반환하고 삭제
		// 키와 값이 맞아야 삭제할 수 있다
		
		System.out.println();

		// clear():void
		// isEmpty():boolean
		System.out.println(map3.isEmpty());
		map3.clear();
		System.out.println("map3 : " + map3);
		System.out.println(map3.isEmpty());
		
		System.out.println();
	}
		
	public void doProperties() {
		Properties prop = new Properties();
//		prop.put(1, 10);
		
		// setProperty(String key, String value):Object
		prop.setProperty("채소", "오이");
		prop.setProperty("과일", "사과");
		prop.setProperty("간식", "젤리");		
		prop.setProperty("채소", "피망");		
		System.out.println(prop);
		
		System.out.println();
		
		// getProperty(String key):String
		System.out.println(prop.getProperty("채소"));
		System.out.println(prop.getProperty("견과"));
		
		System.out.println();
		
		// getProperty(String key, String defaultValue):String
		System.out.println(prop.getProperty("채소", "호두"));
		System.out.println(prop.getProperty("견과", "마카다미아"));
		
		Enumeration<?> e = prop.propertyNames();
		while(e.hasMoreElements()) {
			String key = (String)e.nextElement();
			System.out.println(key + " / " + prop.getProperty(key));
			
		}
		
		System.out.println();
	}
	
	public void fileSave() {	// 파일 저장 메소드
		try (FileOutputStream fos = new FileOutputStream("test.properties");) {
			Properties prop = new Properties();
			prop.setProperty("title", "Properties Practice");
			prop.setProperty("author", "me");
			prop.setProperty("date", "2023-03-02");	// 4개 데이터를 집어넣음
			prop.setProperty("nation", "kor");
			
			// store(OutputStream out, String comments):void
			// store(writer writer, String comments):void
			prop.store(fos, "Properties Tes File");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void fileOpen() {
		
		try (FileInputStream fis = new FileInputStream("test.properties")) {
			Properties prop = new Properties();	// 비워져있는 상태
			System.out.println(prop);
		
			// load(InputStream inStream):void
			// load(Reader reader):void
			prop.load(fis);			// fis에 의해 파일에 있는 걸 불러와서 prop에 저장하겠다는 뜻
			System.out.println(prop);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
	public void fileSave2() {	// 파일 저장 메소드
		try (FileOutputStream fos = new FileOutputStream("test.xml");) {
			Properties prop = new Properties();
			prop.setProperty("title", "Properties Practice");
			prop.setProperty("author", "me");
			prop.setProperty("date", "2023-03-02");	// 4개 데이터를 집어넣음
			prop.setProperty("nation", "kor");
			
			// storeToXML(OutputStream out, String comments):void
			prop.storeToXML(fos, "Properties Tes File");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void fileOpen2() {
		
		try (FileInputStream fis = new FileInputStream("test.xml")) {
			Properties prop = new Properties();	// 비워져있는 상태
			System.out.println(prop);
		
			// loadFromXML(InputStream inStream):void
			prop.loadFromXML(fis);			// fis에 의해 파일에 있는 걸 불러와서 prop에 저장하겠다는 뜻
			System.out.println(prop);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
