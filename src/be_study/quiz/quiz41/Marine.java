package be_study.quiz.quiz41;

public class Marine extends Unit {

	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println(x + " , " + y + " 위치로 이동합니다");
	}

	public void stop() {
	}

	void stimPack() {/* . */
		System.out.println("스팀팩을 사용한다");
	} // 스팀팩을 사용한다

}
