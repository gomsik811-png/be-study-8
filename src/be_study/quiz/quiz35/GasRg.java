package be_study.quiz.quiz35;

public class GasRg {
	
	int fireHall;
	String brand;
	int price;
	String turnOn;
	String turnOff;
	String power;
	
	
	public GasRg(int fireHall, String brand, int price, String turnOn, String turnOff, String power) {
		this.fireHall = fireHall;
		this.brand = brand;
		this.price = price;
		this.turnOn = turnOn;
		this.turnOff = turnOff;
		this.power = power;
		
	}

	public int getFireHall() {
		return fireHall;
	}

	public void setFireHall(int fireHall) {
		this.fireHall = fireHall;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTurnOn() {
		return turnOn;
	}

	public void setTurnOn(String turnOn) {
		this.turnOn = turnOn;
	}

	public String getTurnOff() {
		return turnOff;
	}

	public void setTurnOff(String turnOff) {
		this.turnOff = turnOff;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public void fireMung(String turnOn, String turnOff) {
		if(turnOn.equals(true) == (true) ) {
			System.out.println("가스불 켜짐");
		}else {
			System.out.println("가스불 안켜짐");
		}
	}
}
