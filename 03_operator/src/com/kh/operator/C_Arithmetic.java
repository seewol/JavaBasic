package com.kh.operator;

public class C_Arithmetic {
	public void method1() {
		
		int num1 = 35;
		int num2 = 10;
		// int 끼리의 계산은 int
		System.out.println(num1 / num2); // 3
		System.out.println(num1 % num2); // 5
		
		double num3 = 45;
		double num4 = 10;
		
		System.out.println(num3 / num4); // 4.5
		System.out.println(num3 % num4); // 5.0
		
	}
	public void method2() {
		
		int a = 5;
		int b = 10;
		
		int c = (++a) + b;
		//	16	6	  +	10
		// a=6, b=10, c=16
		int d = c / a;
		//	2	16/	6
		// d=2
		int e = c % a;
		// 		16	6
		// e=4
		int f = e++;
		//	f=4
		// e=5
		int g = (--b) + (d--);
		//		 9		 2
		// b=9, d=1, g=11
		int h = 2;
		int i = a++ + b / (--c / f) * (g-- - d) % (++e + h);
		//		6 + 9 / (15 / 4) * (11 - 1) % (6 + 2 )
		// 6 + 9 / 3 * 10 % 8
		// 6 + 30 % 8
		// 6 + 6
		// a=7, b=9, c=15, d=1, e=6, f=4, g=10, h=2, i=12
		
		System.out.println("a : " +a);
		System.out.println("b : " +b);
		System.out.println("c : " +c);
		System.out.println("d : " +d);
		System.out.println("e : " +e);
		System.out.println("f : " +f);
		System.out.println("g : " +g);
		System.out.println("h : " +h);
		System.out.println("i : " +i);
	}

}
