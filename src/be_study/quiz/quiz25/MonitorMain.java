package be_study.quiz.quiz25;

public class MonitorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Monitor bab1 = new Monitor();
			bab1.inch = 27;
			bab1.company = "아노스";
			bab1.model = "QA100M QHD IPS USB-C";
			bab1.showInfo();
			
		Monitor bab2 = new Monitor();
		bab2.inch = 32;
		bab2.company = "LG";
		bab2.model = "LG G6 울트라기어 32GS75Q IPS QHD";
		bab2.showInfo();
	}

}	
