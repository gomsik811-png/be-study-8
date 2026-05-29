package be_study.inherit.inherit03;

public class Mike {
	
	//마이크
	String type;
	String model;
	int price;
	
	public void volumeUp() {
		System.out.println("Mike volumeUp");
	}
	
	//기존에 있던 메소드 활용 -> check();
	
	//기존 메소드 업그레이드 (재정의)
	public void check() {
		System.out.println("Mike check() 기능채크");
	}
	
	
	public final void noMethod() {
		System.out.println("Mike noMethod()");
	}
	
	//여러 메소드...
	

}
