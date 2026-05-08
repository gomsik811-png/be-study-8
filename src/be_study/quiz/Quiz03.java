package be_study.quiz;

public class Quiz03 {

	public static void main(String[] args) {
		
//		1. 아래 1), 2) 에 맞게 풀이.
//	int x = 10;
//	int y = 4;
//	___result = ___x/y;
//	System.out.println(result);
		int x = 10;
		int y = 4;
//
//	1) 결과가 2가 나오도록 작성하세요
		int result1 = x/y;
		System.out.println(result1);
//	2) 결과가 2.5가 나오도록 작성하세요
		double result2 = x/y;
		result2 = (double)x/y;
		System.out.println(result2);
		
//	2. 결과가 7.5가 나오도록 작성하세요
//	double a = 3.5;
//	double b = 4.7;
//	double result = _______________;
//	System.out.println(result);
		double a = 3.5;
		double b = 4.7;
		double result3 = a + (int)b;
		System.out.println(result3);
		
//
//	3. 계산결과가 12가 나오도록 작성하세요
//	String a = "3.4";
//	String b = "4";
//	______ result = ________;
//	System.out.println(result);
		String c = "3.4";
		String d = "4";
	    int result4 = (int)Double.parseDouble(c) * Integer.parseInt(d);
		System.out.println(result4);
		
//	----------------------------------------------------
//
//	4. 계산결과가 "1013" 이 나오도록 코드를 작성하세요.
//	String a = "10";
//	int b = 3;
//	double c = 4.5;
//	_____ result = _______;
//	System.out.println(result);
		String aa = "10";
		int bb = 3;
		double cc = 4.5;
		String result5 = aa + (int)(bb * cc);
		System.out.println(result5);
				
//
//
//	5. 계산결과가 "243" 이 나오도록 코드를 작성하세요.
//	int a = 4;
//	double b = 3.4;
//	String c = "6.8";
//	_____ result = _______;
//	System.out.println(result);
		int aaa = 4;
		double bbb = 3.4;
		String ccc = "6.8";
		String result6 =aaa * (int)Double.parseDouble(ccc) + "" + (int)bbb;
		System.out.println(result6);
//
//	6. 계산 결과가 아래와 같이 나오도록 코드를 작성하세요.
//	int x = 111;
//	int y = 13;
//	int result = _____;
//	System.out.println(result);
		
		int xx = 111;
		int yy = 13;
		
		int result7 = xx % yy;
		System.out.println(result7);
		
		int result8 = xx / yy;
		System.out.println(result8);
//
//	1) 출력결과 : 7
//	2) 출력결과 : 8

	}

}
