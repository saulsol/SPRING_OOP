package 데코레이터_패턴;

public class ClientWithDecorator {

	public static void main(String[] args) {
		
		IService decorator = new Decorator();
		System.out.println(decorator.runSumthing());
		
		// "메서드 호출의 반환값에 변화를 주기 위해 중간에 장식자를 두는 패턴"

		
		
		

	}

}
