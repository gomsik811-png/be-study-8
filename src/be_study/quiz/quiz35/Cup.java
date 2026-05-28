package be_study.quiz.quiz35;

public class Cup {
	
	Cup[]cups;
	
	int size;
	String texture;
	String color;
	
	public Cup(int size, String texture, String color) {
		this.size = size;
		this.texture = texture;
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getTexture() {
		return texture;
	}

	public void setTexture(String texture) {
		this.texture = texture;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
