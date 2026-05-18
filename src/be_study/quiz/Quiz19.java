package be_study.quiz;

public class Quiz19 {

	public static void main(String[] args) {
		
		int [][] arr = new int [4][4];
		
		int num = 1;
		
		for(int i = 0; i <arr.length; i++) {
			for(int j = 0; j < arr.length; j++ ) {
				
				arr[i][j]=num;
				num++;
			}
		}
		for(int i=0; i <arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
		

	}

}
