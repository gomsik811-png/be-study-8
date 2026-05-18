package be_study.quiz;

import java.util.Scanner;

public class Quiz18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 5; i >= 1; i--) {
		    for(int j = 1; j <= i; j++) {
		        System.out.print("*");
		    }

		    System.out.println();
		}
		
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.print("숫자입력: ");
		int num= sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		int stong = sc.nextInt();
		
		for(int i= 1; i<=stong; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = stong - 1; i >= 1; i--) {
		    for(int j = 1; j <= i; j++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
//		int duss = 1+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5)+(1+2+3+4+5+6)+(1+2+3+4+5+6+7)+(1+2+3+4+5+6+7+8)+(1+2+3+4+5+6+7+8+9)+(1+2+3+4+5+6+7+8+9+10);
		
//		System.out.println(duss);
		
		int total = 0;
		
		for(int i = 1; i<=10; i++) {
			int sum = 0;
			
			for(int j = 1; j<=i; j++) {
				sum = sum+j;
			}
			total = sum+total;
		}
		System.out.println(total);

	}
	
}
