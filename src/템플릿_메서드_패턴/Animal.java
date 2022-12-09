package 템플릿_메서드_패턴;

public abstract class Animal {

	public void playWithOwner() {
		System.out.println("귀염둥이 이리온...");
		play();
		runSomething();
	}

	abstract void play();  
	
	void runSomething() {
		 System.out.println("꼬리 살랑 살랑");
	 }
}
