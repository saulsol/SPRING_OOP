package 전략_패턴;

public class StrategyGun implements Strategy {

	@Override
	public void runStrategy() {
		System.out.println("총 쏘는 소리 : 탕, 타당, 타다당");
	}
	
	
}
