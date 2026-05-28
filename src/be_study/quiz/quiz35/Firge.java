package be_study.quiz.quiz35;

public class Firge {
	
	String brand;
	int L;
	boolean PowerOn;
	boolean temperUp;
	boolean temperDown;
	int door;
	
	String Freezer;
	int FreezerHall;
	int pirce;
	
	
	public Firge(String brand, int l, boolean powerOn, boolean temperUp, boolean temperDown, int door, String freezer,
			int freezerHall, int pirce) {	
		this.brand = brand;
		this.L = L;
		PowerOn = powerOn;
		this.temperUp = temperUp;
		this.temperDown = temperDown;
		this.door = door;
		this.Freezer = freezer;
		this.FreezerHall = freezerHall;
		this.pirce = pirce;
		
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
	public String getFreezer() {
		return Freezer;
	}
	public void setFreezer(String freezer) {
		Freezer = freezer;
	}
	public int getFreezerHall() {
		return FreezerHall;
	}
	public void setFreezerHall(int freezerHall) {
		FreezerHall = freezerHall;
	}
	public int getPirce() {
		return pirce;
	}
	public void setPirce(int pirce) {
		this.pirce = pirce;
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
