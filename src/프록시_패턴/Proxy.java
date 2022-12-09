package 프록시_패턴;

public class Proxy implements IService {

	IService service1;
	
	@Override
	public String runSomething() {
		System.out.println("호출에 대한 흐름 제어가 주목적, 변환 결과를 그대로 전달");
		
		service1 = new Service(); // 프록시 객체에서 Service 객체 생성
		
		return service1.runSomething();
		
	}
	
	

}
