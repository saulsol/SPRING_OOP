package 전략_패턴;

public class Soldier {

	// 무기(Strategy)를 사용할 군인(컨텍스트, 사용자)을 구현
	
	void runContext(Strategy strategy) {
		
		System.out.println("전투 시작");
		
		strategy.runStrategy();
		
		System.out.println("전투 종료");
		
	}
	
}
