package be_study.quiz;

public class Quiz16 {

	public static void main(String[] args) {
		
//		int [][] arr = new int [5][5];
//		
//		int num = 1;
//		
//		for(int i=1; i<4; i++) {
//			for(int j=1; j<arr[i].length; j++) {
//				arr[i][j] = num;
//				num++;
//				
//				
//			}
//		}
		
//		int[][] arr = {{1,2,2,2,2},{3,1,2,2,2,},.______-.}
		int [][] arr = new int [5][5];
		
		for(int i=0; i<arr.length; i++) {		
			for(int j=0; j<arr[i].length; j++) {
				
				if(i>j) {
					arr[i][j] = 1;
				}if(i>j) {
					arr[i][j] = 3;
				}if(j>i) {
					arr[i][j] = 2;
				}
			}
		}
		
		//출력부분
		for(int i=0; i<arr.length; i++) {		
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
			
		}
	

}
