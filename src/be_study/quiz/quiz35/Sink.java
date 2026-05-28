package be_study.quiz.quiz35;

public class Sink {
	int sizeX;
	int sizeY;
	int deep;
	String color;
	String texture;
	
	public Sink(int sizeX, int sizeY, int deep, String color, String texture) {
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.deep = deep;
		this.color = color;
		this.texture = texture;
	}

	public int getSizeX() {
		return sizeX;
	}

	public void setSizeX(int sizeX) {
		this.sizeX = sizeX;
	}

	public int getSizeY() {
		return sizeY;
	}

	public void setSizeY(int sizeY) {
		this.sizeY = sizeY;
	}

	public int getDeep() {
		return deep;
	}

	public void setDeep(int deep) {
		this.deep = deep;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTexture() {
		return texture;
	}

	public void setTexture(String texture) {
		this.texture = texture;
	}

}
