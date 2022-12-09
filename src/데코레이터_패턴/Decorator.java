package 데코레이터_패턴;

public class Decorator implements IService{

	IService service;
	
	@Override
	public String runSumthing() {
		System.out.println("호출에 애한 장식 주목적, 클라이언트에게 반환 결과에 장식을 더하여 전달");
		service = new Service();
		return "정말" + service.runSumthing();
	}
	
	

}
