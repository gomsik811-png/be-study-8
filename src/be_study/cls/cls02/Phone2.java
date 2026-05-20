package be_study.cls.cls02;

public class Phone2 {
	
	//필드
	String model; //모델명
	int price; //가격
	int battery; //배터리용량 3100 3800 4000
	
	//생성자
	//기본생성자 Phone(){}
//	Phone(){}
		
	
	//생성자 오버로딩	매개변수의 타입, 순서, 갯수
	
	Phone2(String model1){ //String 1개
		this.model = model;
		this.price =0;
		this.battery = 2500;
		
		//같은 클래스 파일 내부에서 내 다른 생성자 호출 this();
		//this(); // 외부입장 : new Phone2();
		this(model, 0, 2500);	  // 외부입장 : Phone p6 = new Phone("갤럭시 폴드4", 2100000, 4200);
		
		
		//필드 초기화
		//기타 다른 생서시 할일...
		//알콜소독
		//불량검사
		//재부팅
		//기능검사 <- 추가

	}
	
	Phone2(int battery){// int 1개
		
	}
	

	Phone2(String model, int price){
		this.model = model;
		this.price = price;
		this.battery =2500;
	}
		//필드 초기화
		//기타 다른 생서시 할일...
		//알콜소독
		//불량검사
		//재부팅
		//기능검사 <- 추가

	// int String 순서로 2개
	Phone2(int battery, String model){
		this.battery = battery;
		this.model = model;
		this.price = 0;
	}
	
	Phone2(String model, int pirce, int battery){
		this.model = model;
		this.price = price;
		this.battery = battery;
		this(model, price ,2500);
	}
	
	
	Phone2( int pirce,String model, int battery ){
		//this.model = model;
		//this.price = price;
		//this.battery = battery;
		this(model, 0, 2500);
	}	
	
	
	//메소드

}
