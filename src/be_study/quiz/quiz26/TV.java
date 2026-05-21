package be_study.quiz.quiz26;

public class TV {
	
	String company;
	int year;
	int inch;
	
	TV(){
		
	}
	
	TV(String company, int year, int inch){
		this.company = company;
		this.year = year;
		this.inch = inch;
	}
	
	void show() {
		System.out.printf("제조사:%s 제작년도%d 인치%d \n", company, year, inch);
	}
	

}
