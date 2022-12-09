package 어댑터_패턴;

public class ClientWithAdapter {

	public static void main(String[] args) {

		AdapterServiceA asa1 = new AdapterServiceA();
		AdapterSerivceB asb1 = new AdapterSerivceB();
		
		asa1.runService();
		asb1.runService();
		
		// 기존의 ServiceA와 ServiceB의 메서드를 runService() 라고 하는 같은 이름의 메서드로 호출해서 
		// 사용할 수 있게 해주는 변환기다.
		
		
		
		
		
	}

}
