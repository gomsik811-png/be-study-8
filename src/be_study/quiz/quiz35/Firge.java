package be_study.quiz.quiz35;

public class Firge {
	
	String brand;
	int L;
	boolean PowerOn;
	boolean temperUp;
	boolean temperDown;
	int door;
	
	
	
	
	public Firge(String brand, int l, boolean powerOn, boolean temperUp, boolean temperDown, int door) {	
		this.brand = brand;
		this.L = L;
		PowerOn = powerOn;
		this.temperUp = temperUp;
		this.temperDown = temperDown;
		this.door = door;

		
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getL() {
		return L;
	}
	public void setL(int l) {
		L = l;
	}
	public boolean isPowerOn() {
		return PowerOn;
	}
	public void setPowerOn(boolean powerOn) {
		PowerOn = powerOn;
	}
	public boolean getTemperUp() {
		return temperUp;
	}
	public void setTemperUp(boolean temperUp) {
		this.temperUp = temperUp;
	}
	public boolean getTemperDown() {
		return temperDown;
	}
	public void setTemperDown(boolean temperDown) {
		this.temperDown = temperDown;
	}
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}

	}
	
	public void frizeTemp(boolean temperUp, boolean temperDown) {
		if(temperUp == (true)) {
			System.out.println("온도 올라감");
		}else{
			if(temperUp == (false)) {
				System.out.println("온도 내려감");
			}
		}
	}
	
	

}
