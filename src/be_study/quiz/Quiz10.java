package be_study.quiz;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수:");
		int gug = sc.nextInt();
		
		System.out.print("수학점수:");
		int mat = sc.nextInt();
		
		System.out.print("영어점수:");
		int eng = sc.nextInt();
		
		int total = gug+mat+eng;
		double avg = (gug+mat+eng)/3;
		
		if(gug >= 40 && mat >= 40 && eng >=40 && avg >= 60) {
			System.out.println("국어 :" + gug);
			System.out.println("수학 :" + mat);
			System.out.println("영어 :" + eng);
			System.out.println("합계 " + total);
			System.out.println("평균 :" + avg);
			System.out.println("축하드립니다 합격입니다!");
		}else {
			System.out.println("불합격");
		}
	
		

	}

}
