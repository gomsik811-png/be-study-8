package be_study.quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz21 {

	public static void main(String[] args) {
		
		
//		1.
//		두 개의 주사위를 던졌을 때, 두 눈의 합이 6이 되는
//		모든 경우의 수를 출력하는 프로그램을 작성하시오.
		
		
		Random random = new Random();
//		
//		int dice1 = random.nextInt();
//		int dice2 = random.nextInt();
//		
//		for(int i = 1; i <=6; i++) {
//			for(int j = 1; j <=6; j++) {
//				if(i+j==6) {
//					System.out.println("("+i+","+j+")");
//				}
//			}
//			}							
//
//		2.
//		로또 번호 6개 랜덤하게 생성하기. ( 1~45 중 )
//		최종 6개의 번호는 6칸의 배열에 저장되어야 한다.
//		로또 번호는 동일한 번호가 중복되어 들어갈 수 없다.
//		1) Math.random() 활용
//		2) int[] lotto = new int[6]; 활용
		
//		int[] lotto = new int[6];
//		
//		
//		lotto[0] = (int)(Math.random()*45)+1;
//		lotto[1] = (int)(Math.random()*45)+1;
//		lotto[2] = (int)(Math.random()*45)+1;
//		lotto[3] = (int)(Math.random()*45)+1;
//		lotto[4] = (int)(Math.random()*45)+1;
//		lotto[5] = (int)(Math.random()*45)+1;
//		
//		System.out.println(lotto[0]);
//		System.out.println(lotto[1]);
//		System.out.println(lotto[2]);
//		System.out.println(lotto[3]);
//		System.out.println(lotto[4]);
//		System.out.println(lotto[5]);
		

//		
		int[] lotto = new int[6];//6개의 서로 다른 수 index: 0 1 2 3 4 5
		int index = 0;
//		blooream isDuplicated 
//		//while문 활용
//		//흐름 그대로 코드화
//		while(true) {
//			//랜점값 뽑기 1~45
//			int value = (int)(math.ramdom()*45) +1;
//			
//			//기존에 뽑힌거 중복있는지 체크
//			isDuplicated = false;
//			for(int i=0; i<index; i++) {
//				if(lotto[i] == value) { //기존에 뽑은 칸에 지금 뽑은 value 와 같은 값이 있나?
//					isDuplicated=true;
//					break;
//				}
//			}
//			if(Duplicatrd) { //중복있음
//				continue;
//			}else {//중복없음
//				lotto[index] = value;
//				index++;
//			}
//			//중복여부
//			//중복이 있으면?
//			if(index == 6) {
//				break
//			}
//			//중복이있으면?
//		}
//			
//		for(int i=0; i<lotto.length; i++) {
//			System.out.print(lotto[i] + " ");
//		}
//		System.out.println();
		
		//for문 활용
		lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {	// 0 1 2 3 4 5 ~6번
			
			lotto[i] = (int)(Math.random()*45) + 1;
			
			for(int j=0; j<i; j++) {	//앞에서부터 j가 현재 뽑는 인덱스
				
				
				
				
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
			
		}
		
		
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
		
//		3.
	
//		우리 학원은 3개의 반이 있으며, 한 반에 5명씩 공부하고 있다.
//		반 순서별로 5명의 점수를 입력받아서 저장해서 관리하도록 하며,
//		각 반별 점수의 평균과 전체의 평균을 출력할 수 있도록 코드를 작성하시오.
//		(*가능한 효율적인 구조를 생각해보세요)
//
//		ex)
//		1반 : 10 10 10 10 10
//		2반 : 20 20 20 20 20
//		3반 : 30 30 30 30 30
//
//		1반 평균 : 10
//		2반 평균 : 20
//		3반 평균 : 30
//		전체 평균 : 20
//		
//		Scanner sc = new Scanner(System.in);
		
//		int [][] clas = new int [3][5];
//		int total = 0;
//		
//		
//		for(int i = 0; i < 3; i ++) {
//			for(int j = 0; j < 5; j++) {
//				clas[i][j] = sc.nextInt();
//				
//				
//				
//			}
//		}
//		for(int i = 0; i < 3; i ++) {
//			int sum = 0;
//			for(int j = 0; j < 5; j++) {	
//				sum+=clas[i][j];
//				total+=clas[i][j];
//			}
//			System.out.println((i+1)+"반평균 :" + (sum /5));
//			System.out.println("전체 평균"+ (total/15));
//		}
		
		/*
		4. 주어진 2차원 배열보다 행과 열이 1씩 큰 배열을 선언하여,
		각 행의 합과 각 열의 합, 마지막에는 전체의 합이 출력되도록 프로그램을 작성하시오.

		ex)
		int[][] arr =
		{
		{10, 20, 30},
		{20, 30, 40},
		{30, 40, 50}
		};
		이 주어지는 경우 최종 결과는
		10 20 30 60
		20 30 40 90
		30 40 50 120
		60 90 120 270
		*/
//		int[][] arr = {{10, 20, 30},{20, 30, 40},{30, 40, 50}};
////		int[][] arr = new int [4][4];
//		
//		for(int i = 0; i< arr.length; i++ ) {
//			for(int j = 0; j < arr.length; j++) {
//				
//			}		
//		}
//		for(int i = 0; i< arr.length; i++ ) {
//			int mimm = 0;
//			for(int j = 0; j < arr.length; j++) {
//				mimm+= arr[i][j];
//				
//			}
//		}
		int[][] arr = {{10, 20, 30},{20, 30, 40},{30, 40, 50}};
		
		int[][] newArr = new int[4][4]; // [arr.length+1][arr[0].length +1]
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				newArr[i][j] = arr[i][j]; //원래 위치 복사
				
				newArr[i][3] += arr[i][j];//본인 행의 마지막 열 덧셈
				newArr[3][j] += arr[i][j];//본인 열의 마지막 행 덧셈
				newArr[3][3] += arr[i][j];//전체 제일 마지막 행/열 덧셈
			}
		}
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.printf("%4d", newArr[i][j]);
			}
			System.out.println();
		}
	}
			
	
	

}
