package be_study.quiz.quiz41;

public class DropShip extends Unit{

	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println(x + " , " + y + " 위치로 이동합니다");
	}
	
	void load() {
		System.out.println("탑승");
	} //선택된 대상을 태운다
	void unload() { 
		System.out.println("하차");
	} //선택된 대상을 내린다
	
	
	
}
