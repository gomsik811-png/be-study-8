package be_study.quiz;

import java.util.Scanner;

public class Quiz23 {

	public static void main(String[] args) {
		
		/*
		엘리베이터

		스마트 엘리베이터 시스템을 제작하려고 합니다.
		해당 시스템이 적용되는 빌딩은 100층 짜리 빌딩이며, 사람들을 원하는 층으로 스마트하게 이동시켜 줍니다.
		해당 시스템은 사람들을 원하는 층으로 스마트하게 데려다 줍니다.
		(반복문, 조건문, 배열 최대한 사용하시면 됩니다. )

		- 기본 문제
		1층에서 사람들이 탑승하며, 각자 내릴 층에 버튼을 누릅니다.
		(2 ~ 100 이외의 수는 입력이 없을 거라고 가정)
		엘리베이터는 100층까지 올라가는 와중에 탑승 인원을 모두 내려주고 1층으로 내려오며,
		엘리베이터의 층수가 변경될 때마다 현재 층수를 출력합니다.
		참고로, 엘리베이터는 10층에서 5층으로 갔다가 11층으로 가지 않습니다.
		(오로지 한번에 100층까지 쭉)
		(100층을 찍고 다시 1층까지 내려와야함)

		+ 탑승 인원을 입력받습니다.
		+ 탑승 인원 만큼, 사람들이 내릴 층(2층부터 100층까지)를 각각 입력 받습니다.
		(
		* 입력된 층은 중복되지 않게 입력이 된다고 가정
		예시)
		[10, 20, 35, 50, 11, 24] O 정상입력 케이스로 가정하고 진행
		[10, 20, 35, 10, 20, 24] X 중복층 입력 없음으로 가정
		)
		*/
		
		Scanner sc = new Scanner(System.in);
		
		
			
		while(true) {
			System.out.print("탑승인원 입력:");
			int people = sc.nextInt();
			
			
			int [] floor = new int[people];
			for(int i = 0; i <people; i++) {
				System.out.print((i+1)+"번째 사람 내리는 층:");
				floor[i]=sc.nextInt();
			}
			for(int i = 0; i <=100; i++) {
				System.out.println(i+"층입니다.");
				for(int j = 0; j<people; j++) {
					if(floor[j]== i) {
						System.out.println((j+1)+"번째 사람");
					}
				}
									
			}
			System.out.println("내려갑니다.");
			for(int i = 99; i >0; i--) {
				System.out.println(i+"층입니다."); 
			}
		}						
	}

}
