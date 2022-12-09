package 싱글턴_패턴;

public class Singleton {
	
	static Singleton singletonObject;
	
	private Singleton () {}
	
	public static Singleton getInstance() {
		
		if(singletonObject == null) {
			singletonObject = new Singleton();
		}
		
		
		return singletonObject;
	}
	
	// 싱글턴 패턴이란 인스턴스를 하나만 만들어 사용하기 위한 패턴이다. 
	// 커넥션 폴, 스레드 폴, 디바이스 설정 객체등과 같은 경우 인스턴스를 여러 개 만들게 되면 불필요한 자원을 사용하게 되고
	// 또 프로그램이 예상치 못한 결과를 낳을 수 있다. 
	// 싱글턴 패턴은 오작 안스턴스를 하나만 만들고 그것을 계속해서 재사용한다.
	
	// 싱글턴 패턴을 적용한 경우 의미상 두 개의 객체가 존재할 수 없음. 
	// 이를 구현하려면 new에 제약읋 걸어야 하고, 만들어진 단일 객체를 반환할 수 있는 메소드가 필요하다. 따라서 필요한 요소를 생각해보면 
	// 다음 세 가지가 반드시 필요하다. 
	
	// 1. new 를 실행할 수 없도록 생성자에 private 접근 제어자를 지정한다. 
	// 2. 유일한 단일 객체를 반환할 수 이쑈는 정적 메서드가 필요하다. 
	// 3. 유일한 단일 객체를 참조할 정적 참조 변수가 필요하다. 
	
	
	
	//하지만 이 방법은 멀티스레드에는 안전하지 않다 어디까지 기본 개념 학습인걸 잊지말자

}
