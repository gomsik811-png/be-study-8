package be_study.iter;

public class Iter02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 
		 for(초기화; 조건식; 증강식){
		 	 실행문;
		 }
		 
		 while(조건식){
		 	  실행문;
		 }
		 
		 초기화;
		 while(조건식){
		 	 실행문;
		 	 
		 	 증감식;
		 }
		 
		 while(조건식){
		 	초기화;
		 	증감식;
		 	
		 	실행문;
		 }		 
		  
		 */
		
		
		//단순 5번 반복
		for(int i=1; i<=5; i++) {
			System.out.println("for문반복");
		}
		
		int i=1;
		while (i<=5) {
			System.out.println("while문반복");
			i++;
		}
		
		//무한반복  무한루프
//		
//		while(true) {
//			System.out.println();
//		}
		
		
		i = 10;
		while(true) {
			i++;
			
			if(i == 21)
				break;
			
			System.out.println("while(true) :" + i );
			
		}

	}

}
