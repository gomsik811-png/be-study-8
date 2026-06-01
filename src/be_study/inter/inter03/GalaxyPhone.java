package be_study.inter.inter03;

public class GalaxyPhone implements Callable, Connectable{

	int callStatus;
	
	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("GalaxyPhone call()");
		//callStatus = 1;
		callStatus = Callable.CALL_ON;
		
	}

	@Override
	public void connect() {
		System.out.println("GalaxyPhone connect()");
		
	}

}
