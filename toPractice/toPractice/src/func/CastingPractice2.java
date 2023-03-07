package func;

import java.util.Scanner;

import javax.imageio.event.IIOReadWarningListener;
import javax.print.attribute.standard.MediaSize.Engineering;

public class CastingPractice2 {
	public void method() {
	// 실수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요.
	// 이 때 총점과 평균은 정수형으로 처리하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		double a = sc.nextDouble();
		System.out.print("영어 : ");
		double b = sc.nextDouble();
		System.out.print("수학 : ");
		double c = sc.nextDouble();
		
		int sum = (int)(a + b + c);
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + sum / 3);
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		double kor = sc.nextDouble();
		System.out.println();
		System.out.print("영어 : ");
		double eng = sc.nextDouble();
		System.out.print("수학 : ");
		double math = sc.nextDouble();
		
		int sum = (int)(kor + eng + math);
		int avg = sum / 3;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}
}
