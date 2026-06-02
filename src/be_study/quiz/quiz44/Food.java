package be_study.quiz.quiz44;

public class Food  implements Orderable{

	private String name;
	private int price;


	public Food(String name, int price) {
	this.name = name;
	this.price = price;
	}

	@Override
	public int discountedPrice() {
		name = "족발";
		price = 19800;
		return 0;
	}

}
