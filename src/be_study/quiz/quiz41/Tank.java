package be_study.quiz.quiz41;

public class Tank extends Unit{
	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println(x + " , "+ y + " 위치로 이동합니다");
	}
	
	
	
	void changeMode() { System.out.println("공격 모드를 변환한다");} //공격모드를 변환한다

}
