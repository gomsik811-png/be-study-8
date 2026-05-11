package be_study.cond;

public class Cond2 {

	public static void main(String[] args) {
		int money = 0;
		
		boolean isHungry = true;
		if(isHungry) {
		System.out.println("햄버거 주문 ");
		money += 5000;
	}else {
		System.out.println("젤리하나 추가");
		money = money + 300;
	}
	
	boolean option = false;
	if(option == true) {
		System.out.println("패티 추가 옵션으로 비용 발생");
		money +=2000;
	}else {
		System.out.println("옵션 없이 그대로 진행");
		//money += 0;
	}
	int coupon =0;
	
	boolean isDiscount = true;
	if(!isDiscount) { //할인 x
		System.out.println("할인 없음");
	}else {
		 coupon = 500;
		System.out.println("할인 쿠폰적용");
		money = money - coupon;
		//쿠폰 변수를 인식할수 있는 영역 내에서 출력
		//System.out.println("적용된 쿠폰 금액: " + coupon));
	}
	
	System.out.println("적용된 쿠폰 금액: " + coupon);
	System.out.println("최종 금액 :"  + money);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
