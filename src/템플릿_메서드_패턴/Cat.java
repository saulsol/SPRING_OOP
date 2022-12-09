package 템플릿_메서드_패턴;

public class Cat extends Animal {
	
	
	// 추상 메서드 오버라이딩 
	@Override
	protected void play() {
		System.out.println("야옹~ 야옹~");
	}
		
	// Hook(갈고리) 메서드 오버라이딩
	@Override
	void runSomething() {
		System.out.println("야옹~ 야옹~ 꼬리 살랑 살랑~");
			
	}


}
