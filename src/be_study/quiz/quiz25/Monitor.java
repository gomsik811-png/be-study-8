package be_study.quiz.quiz25;

public class Monitor {


	

	int inch;
	String company;
	String model;
	
	Monitor(){
		
	}
	Monitor(int inch,String comapny,String model){
		this.inch = inch;
		this.company = company;
		this.model = model;
	}
	void showInfo() {
		System.out.println("제조사:"+company+" 모델명:"+model+"인치:"+inch+"인치");
	}
	
	
}
