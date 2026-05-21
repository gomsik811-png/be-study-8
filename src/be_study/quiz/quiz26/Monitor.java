package be_study.quiz.quiz26;

public class Monitor {
	String company;
	int inch;
	int price;
	String color;
	//boolean res1;
	//boolean res2;
	int maxResX;
	int maxResY;
	
	
	Monitor(){}
	
	Monitor(String company,
	int inch,
	int price,
	String color,
	//boolean res1,
	//boolean res2
	int maxResX,int maxResY){
		this.company = company;
		this.inch = inch;
		this.price =price;
		this.color = color;
		//this.res1 = res1;
		//this.res2 = res2;
		this.maxResX =maxResX;
		this.maxResY =maxResY;
	}
	
	Monitor(String company,int inch, int price, String color){
		
	}
	
	Monitor(String company,int inch, int price){
		this.inch = inch;
		this.company = company;
		this.price = price;
	}
	
	void set(int x, int y){
		this.maxResX = x;
		this.maxResY = y;
	}
	void setColor(String color) {
		this.color = color;
	}
	
	void powerOn() {
		System.out.println("전원이 켜졌습니다.");
	}
	
	int addPrice(int p) {
		this.price += p;
		
		return this.price;	
	}
	
	
	void printInfo() {
		System.out.printf("제조사:%s 인치:%d 가격:%d  색상%s 해상도 %d %d \n",
				company,inch,price, color, maxResX, maxResY);
	}
		//return;	
	//}
		
	
	
}



