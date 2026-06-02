package be_study.quiz.quiz41;

public class UnitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tank t1 = new Tank();
		Marine m1 = new Marine();
		DropShip d1 = new DropShip();
		
		Unit[] arr = {t1,m1,d1};
		
		for(Unit u : arr) {
			u.move(10,20);
			u.stop();
		}
		
		t1.changeMode();
		m1.stimPack();
		d1.load();
		d1.unload();
		
		
		

	}

}
