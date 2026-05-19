package be_study.quiz;

import java.util.Scanner;

import java.util.Random;

public class Quiz23_lv2 {

	public static void main(String[] args) {
		
		/*
		 엘리베이터는 태울 수 있는 총 중량 또는 정원이 있습니다.
		탑승 인원을 순서대로 측정하되, 총 무게를 넘거나 정원이 넘으면 그
	 	뒤에 인원을 엘리베이터에 태우지 않습니다.
		(총 중량이 200kg 일 경우, 탑승 인원 순서대로 80, 120, 40 이면 
		가장 마지막 사람은 태우지 않음)

		+ 엘리베이터의 총 무게 및 정원은 사용자 입력을 받습니다.
		+ 탑승 인원 및 각 탑승 인원의 내릴 층은 랜덤으로 추출합니다. (사용자 입력에서 변경)
		+ 각 탑승 인원의 무게도 랜덤으로 추출합니다. (40 kg ~ 150 kg)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		Random random = new Random();
		
		while (true) {
			
			/*
			System.out.print("탑승인원 입력:");
			int people = sc.nextInt();
			*/
			
			int people = (int)(Math.random()*20)+1;
			System.out.println("탑승대기인원:"+ people);
			
			System.out.print("정차횟수:");
			int max = sc.nextInt();
			
			
			System.out.println("탑승 가능한 무게");
			int kg = sc.nextInt();

			int[] floor = new int[people];
			for (int i = 0; i < people; i++) {
				System.out.print((i + 1) + "번째 사람 내리는 층:");
				
				
				floor[i] = (int)(Math.random()*150)+40;
				floor[i] = sc.nextInt();
				if(floor[i]> kg) {
					break;
			}
			for (int i = 0; i <= 100; i++) {
				System.out.println(i + "층입니다.");
				for (int j = 0; j < people; j++) {
					if (floor[j] == i) {
						System.out.println((j + 1) + "번째 사람");
						
						max--;
						if(max==0) {							
							System.out.println("정전나서 내려야합니다");
							break;
						
						}

					}
				}
				if(max==0) {
					break;
				}
			}
			if(max>0) {
			System.out.println("내려갑니다.");
			for (int i = 99; i > 0; i--) {
				System.out.println(i + "층입니다.");
			}
			break;
			}
		}

	}

}
