package be_study.quiz.quiz44;

public class Eletronics implements Orderable{
	
	private String name;
	private int price;

	public void Electronics(String name, int price) {
	this.name = name;
	this.price = price;
	}

	@Override
	public int discountedPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
}
