package be_study.quiz.quiz26;

public class MonitorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Monitor m1 = new Monitor("엘지", 27, 320000);
		m1.color = "검은색";
		m1.setColor("검음색");
		
		Monitor m2 = new Monitor("삼성", 32, 320000);
		
		
		m1.set(1080, 780);
		
		m2.set(4096, 2048);
		m2.setColor("흰색");
		
		
		m1.printInfo();
		m2.printInfo();
		
		int upPrice = m2.addPrice(70000);
		System.out.println("인상된가격:"+upPrice);
		
		System.out.println(m2.addPrice(70000));
		
		
		m1.printInfo();
		m2.printInfo();
	}

}
