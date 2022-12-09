package 어댑터_패턴;

public class AdapterServiceA {
	
	ServiceA sa1 = new ServiceA();
	
	void runService() {
		sa1.runServiceA();
	}

}
