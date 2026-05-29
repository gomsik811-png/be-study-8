package be_study.inherit.inherit05.v2;

import java.util.ArrayList;
import java.util.List;

public class MainV {

	public static void main(String[] args) {
		
		

		List<Cleaner> list = new ArrayList<>();
		
		list.add(new DustCleaner());
		list.add(new DustCleaner());
		list.add(new DustCleaner());
		list.add(new FloorCleaner());
		list.add(new FloorCleaner());
		list.add(new FloorCleaner());
		list.add(new WindowCleaner());
		list.add(new WindowCleaner());
		list.add(new WindowCleaner());
		list.add(new WindowCleaner());
		
		//사용법이 같음.
		for(Cleaner c : list) {
			c.removeDust();
			c.cleanFloor();
			c.washWindow();
			
			//실행이
		}

		
	}

}
