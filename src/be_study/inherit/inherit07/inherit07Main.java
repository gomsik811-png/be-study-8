package be_study.inherit.inherit07;

public class inherit07Main {

	public static void main(String[] args) {
		
		//object 객체
		
		Driver d1 = new Driver();
		Taxi t1 = new Taxi();
		Bus b1 = new Bus();
		
		System.out.println(d1.toString());
		System.out.println(t1.toString());
		System.out.println(b1.toString());
		
		t1.run();
		b1.run();
		
		//System.out.println(b1.필드변수);
		//System.out.println(b1.메소드());
		System.out.println(b1);
		//객체 변수 자체를 출력하겠다.-> toStirng()
		
		d1.driveBus(b1);
		d1.driveTaxi(t1);
		
		
	}

}
