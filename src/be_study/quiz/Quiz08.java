package be_study.quiz;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("출생년도를 입력하세요 :");
		int year = sc.nextInt();
				
		System.out.print("주민번호 뒷자리 첫번째 숫자를 입력하세요 :");
		int num = sc.nextInt();
		
		int age = 2026 - year+1;
		
//		if(num == 1 || num == 3) {
//			System.out.println(age + "살 남자입니다.");
//		} else if (num == 2 || num == 4) {
//			System.out.println(age + "살 여자입니다.");
//		} else {
//			System.out.println("삐비빅");
//		}
			
		
		switch (num) {
			
			case 1:
			case 3:
				System.out.println(age + "살 남자입니다.");
				break;
				
			case 2:
			case 4:
				System.out.println(age + "살 여자입니다.");
				break;
			
			default:
				System.out.println("삐비빅");
				
		}
		
		
		

	}

}
