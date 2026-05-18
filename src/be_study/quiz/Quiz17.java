package be_study.quiz;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

//		1.
//		2x + 4y = 10 이 만족하는
//		모든 x, y 쌍을 구하시오.
//		(x와 y는 자연수 1~10)
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if(2 * x + 4 * y == 10) {
					System.out.println("x = " + x + " y = " + y );
				}
			}
		}


//		2.
//		정수 2개를 입력 받아서,
//		아래 계산 결과를 출력하시오.
//		큰수 - 작은수

		int a =sc.nextInt();
		int b =sc.nextInt();
		
		if(a>b) {
			System.out.println(a-b);
		} else {
			System.out.println(b-a);
		}
//		3.
//		윷놀이 게임
//		4개의 윷을 입력받고 결과를 출력하시오.
//		(뒷도는 없습니다!)
//		0 : 안 뒤집어진 상태
//		1 : 뒤집어진 상태
//		ex) 입력 0 0 1 0
//		결과 도
//		입력 0 1 0 1
//		결과 개	

		int count = 0;

		for (int i = 0; i < 4; i++) {
		    int yut = sc.nextInt();

		    if (yut == 0) {
		        count++;
		    }

		
		
//		4. 입력받은 수 만큼 별 출력하기
//		ex) 4
//		****
//		5
//		*****
		
		int n = sc.nextInt();
		for(int c = 0; c < n; c++) {
			System.out.print("*");
		}
		
	}

}
