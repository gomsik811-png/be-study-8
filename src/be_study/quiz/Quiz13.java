package be_study.quiz;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("정수를 입력하세요:");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		
		if(num % 7 == 0) {
			System.out.println("7의 배수입니다");
		}  else {
			System.out.println("아닙니다");
		}
		
		
		int sum = 0;
		for (int i=1; i <=1000; i++) {
			if(i % 5 == 0) {
				sum = sum+i;
			}
		}
			System.out.println(sum);
			
		System.out.print("1-50까지의 숫자를 입력하세요:");
			
		int shap = sc.nextInt();
		
		for (int b=1; b <=shap; b++) {
			System.out.print("*");
		}
		System.out.println();
		
		
		int jjak = 0;
			
		for(int i= 1; i <=10; i++) {
			if(i % 2 == 0) {
				jjak = jjak+i;
			}else {
				jjak = jjak-i;
			}					
		}
		System.out.println(jjak);	
		
		System.out.println("-------------");
		int total = 0;
		int nnum = 1;
		
		while(total <= 1000) {
								
			total = total+nnum;				
			
			System.out.println(total);
			
			nnum++;
			
		}
		
		System.out.print("숫자를입력하세요:");
		int gugudan = sc.nextInt();
		
		for(int i =1; i <= 9; i++) {
			System.out.println(gugudan * i );
		}
			


		
			
		
			
		

	}

}
