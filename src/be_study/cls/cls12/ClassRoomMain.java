package be_study.cls.cls12;

public class ClassRoomMain {

	public static void main(String[] args) {
		
		ClassRoom room1 = new ClassRoom();
		room1.floor = 7;
		room1.roomNumber = 3;
		room1.area = 66.7;
		room1.hasWhiteBoard  = true;
		
		WhiteBoard wb = new WhiteBoard();
		wb.sizeX = 1600;
		wb.sizeY = 900;
		wb.price = 200000;
		wb.isMagnetic = true;
		
		room1.whiteBoard = wb;
		//room1.setWhiteBoard(wb);
		
		AirCon ac = new AirCon();
		room1.airCon = ac;
	}

}
