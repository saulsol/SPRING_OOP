package 템플릿_메서드_패턴;

public class Dog extends Animal {

	// 추상 메서드 오버라이딩 
	@Override
	void play() {
		System.out.println("멍멍!");
	}
	
	// Hook(갈고리) 메서드 오버라이딩
	@Override
	void runSomething() {
		System.out.println("멍!멍! 꼬리 살랑 살랑~");
		
	}
	
}
