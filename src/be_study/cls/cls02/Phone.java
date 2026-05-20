package be_study.cls.cls02;

public class Phone {
	
	//필드
	String model; //모델명
	int price; //가격
	int battery; //배터리용량 3100 3800 4000
	
	//생성자
	//기본생성자 Phone(){}
//	Phone(){}
		
	
	//생성자 오버로딩	매개변수의 타입, 순서, 갯수
	
	Phone(String model1){ //String 1개
		this.model = model;
		this.price =0;
		this.battery = 2500;
		
		//변수 초기화
		//기타 다른 생성시 할일...
		//앝콜소독
		//필름부착
		//불량검사
		//재부팅
	}
	
	Phone(int battery){// int 1개
		
	}
	
	
	//모델명, 가격
	// String int 순서로 2개
	Phone(String model, int price){
		this.model = model;
		this.price = price;
		this.battery =2500;
	}
	
	//모델명, 배터리용량
	// String int 순서로 2개
	//Phone(String model, int battety){}// 불가능 문법적으로 맞지 않음
	
	// int String 순서로 2개
	Phone(int battery, String model){
		this.battery = battery;
		this.model = model;
		this.price = 0;
	}
	
	Phone(String model, int pirce, int battery){
		this.model = model;
		this.price = price;
		this.battery = battery;
	}
	
	//Phone(String model, i int batterynt pirce,) //스트링 인트 인트 순서라 안됨
	Phone( int pirce,String model, int battery ){
		this.model = model;
		this.price = price;
		this.battery = battery;
	}
	
	
	//메소드

}
