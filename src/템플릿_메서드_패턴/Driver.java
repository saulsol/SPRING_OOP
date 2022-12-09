package 템플릿_메서드_패턴;

public class Driver {

	public static void main(String[] args) {
		
		Animal bolt = new Dog();
		
		Animal kitty = new Cat();
		
		
		bolt.play();
		kitty.play();
		
		bolt.playWithOwner();
		kitty.playWithOwner();
		
		// 상위 클래스인 Animal에는 템플릿(견본)을 제공하는 playWithOwner() 메서드와 하위 클래스에게 구현을 강제하는
		// play() 추상 메서드, 하위 클래스가 선택적으로 오버라이딩할 수 있는 runSomething() 메서드가 있다. 
		// 하위 클래스인 Dog과 Cat은 상위 클래스인 Animal에서 구현을 강제하고 있는 play() 추상 메서드를 반드시 구현해야 한다 
		// runSomething() 메서드는 선택적으로 오버라이딩할 수 있다. (선택적으로 오버라이딩하는 하는 메서드 : Hook 메서드)
		// 이처럼 상위 클래스에 있는 공통 로직을 수행하는 템플릿 메서드와 하위 클래스에 오버라이딩을 강제하는 추상 메서드 또는 
		// 선택적으로 오버라이딩할 수 있는 훅(Hook) 메서드를 두는 패턴을 템플릿 메서드 패턴이라고 한다. 
		
		
		// "상위 클래스의 견본 메서드에서 하위 클래스가 오버라이딩한 메서드를 호출하는 패턴"
		
		

	}

}
