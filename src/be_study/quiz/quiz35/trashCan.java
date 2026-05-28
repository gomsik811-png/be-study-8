package be_study.quiz.quiz35;

public class trashCan {
	
	trashCan[] trashcan;
	int L;
	String color;
	int persent;
	String inPut;
	String open;
	String close;
	String clear;
	
	 public trashCan(int l, String color, int persent, String inPut, String open, String close, String clear) {
		
		this.L = L;
		this.color = color;
		this.persent = persent;
		this.inPut = inPut;
		this.open = open;
		this.close = close;
		this.clear = clear;
	}

	public int getL() {
		return L;
	}

	public void setL(int l) {
		L = l;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPersent() {
		return persent;
	}

	public void setPersent(int persent) {
		this.persent = persent;
	}

	public String getInPut() {
		return inPut;
	}

	public void setInPut(String inPut) {
		this.inPut = inPut;
	}

	public String getOpen() {
		return open;
	}

	public void setOpen(String open) {
		this.open = open;
	}

	public String getClose() {
		return close;
	}

	public void setClose(String close) {
		this.close = close;
	}

	public String getClear() {
		return clear;
	}

	public void setClear(String clear) {
		this.clear = clear;
	}

}
