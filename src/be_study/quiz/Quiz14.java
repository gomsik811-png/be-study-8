package be_study.quiz;

import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
        int[] arr11 = new int[6];

        
        for(int i = 1; i <= 5; i++) {
            arr11[i] = sc.nextInt();
        }

        System.out.print("몇번째 수인가요? ");
        int num = sc.nextInt();

        System.out.println("결과 : " + arr11[num]);
        
        int [] arr22 = new int[6];
        
        for(int i = 1; i <=5; i++) {
        	arr22[i] = sc.nextInt();       	 
        }
       for(int i= 5; i>=1; i--) {
    	   System.out.print(arr22[i]+" ");
       }
       System.out.println();
       
       int[][] arr = new int[4][4];

       int num2 = 1;

       for (int i = 0; i < 4; i++) {
           for (int j = 0; j < 4; j++) {
               arr[i][j] = num2;
               num2++;
           }
       }

       for (int i = 0; i < 4; i++) {
           for (int j = 0; j < 4; j++) {
               System.out.print(arr[i][j] + " ");
           }
           System.out.println();
       }

       
	}

}
