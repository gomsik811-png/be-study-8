package be_study.random;

public class Rand01 {

	public static void main(String[] args) {

		//난수 (랜덤값) 뽑기
		
		// Math.random()	0 <= 랜던값 < 1
		
		// (int)(Math.random() *갯수(범위)) + 시작숫자
		
		//1~10 랜덤
		// (int)(Math.random()*갯수10)  +1
		
		/*
		 
		 	랜덤값 0~1	*10		(int)		+1
		 	0.012		0.12	  0			1
		 	0.1234		1.234	  1			2
		 	...			...		 ...		...
		 	0.893
		 		 		 
		 */
		
		//35~45 랜덤
		// (int)(Math.random()*11) + 35
		
		for(int i=1; i<=10; i++) {//1~10
			System.out.println((int)(Math.random()*10)+1);
		}
		
		for(int i=1; i<=10; i++) {//1~50
			System.out.println((int)(Math.random()*50)+1);
		}
		
		for(int i=1; i<=10; i++) {//101~200
			System.out.println((int)(Math.random()*100)+101);
		}
		
		for(int i=1; i<=10; i++) {//30~40
			System.out.println((int)(Math.random()*21)+30);
		}

	}

}
