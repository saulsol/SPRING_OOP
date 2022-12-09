package 전략_패턴;

public class Client {

	public static void main(String[] args) {
		// 보급 장교
		
		Strategy strategy = null;
		
		Soldier soldier = new Soldier();
		
		// 총을 군인에게 전달하여 전투를 수행하게 한다. 
		
		strategy = new StrategyGun();
		soldier.runContext(strategy);

		System.out.println();
		
		// 활을 군인에게 전달해서 전투를 수헹하게 한다. 
		
		strategy = new StrategyBow();
		soldier.runContext(strategy);
		
		
		// 즉 클라이언트가 전략을 생성해 전략을 실행할 컨텍스트에 주입하는 패턴
		
	}

}
