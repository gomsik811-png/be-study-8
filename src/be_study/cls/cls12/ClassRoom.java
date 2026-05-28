package be_study.cls.cls12;

import java.util.ArrayList;

public class ClassRoom {	//강의실 교실
	
	//필드
	int floor;	//몇층
	int roomNumber;	//몇호실이냐
	double area;	//몇평이야
	boolean hasWhiteBoard;	//화이트보드 존재여부
	
	//String whiteBoard; //"2m 짜리 자석붙는 화이트보드"
	WhiteBoard whiteBoard;

	AirCon airCon;
	
//	Desk desk;	//책상 객체 1개
//	Desk desk2;
//	Desk desk3;
//	Desk desk4;
	
	//Desk[] deskArr;
	ArrayList<Desk> deskList;
	
	public ClassRoom() {
		floor = 0;
		roomNumber = 0;
		area = 0;
		hasWhiteBoard = false;
		whiteBoard = null;
		airCon = null;
		deskList = null;
		
	}
	
	public ClassRoom(int floor, int roomNumber) {
		this.floor = floor;
		this.roomNumber = roomNumber;		
	}
	
	
	public ArrayList<Desk> getDeskList() {
		return deskList;
	}
	
	public void addDesk(Desk desk) {
		
	}
	
	
}



