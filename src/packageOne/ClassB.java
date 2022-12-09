package packageOne;

public class ClassB {
	
	void runSomthing() {
		
		// 상속을 받지 않았기에 ClassA 의 객체 멤버는 객체 생성 후에 접근 가능
				//pri = 1;	this.pri = 1;
				//def = 1;	this.def = 1;
				//pro = 1;	this.pro = 1;
				//pub = 1;	this.pub = 1;
		
		// 정적 멤버는 클래스명.정적멤버 형태의 접근을 권장
				//ClassA.priStatic = 1;	//priStatic = 1;	this.priStatic = 1; // 어쨌든 private 는 다른 클래스에서 접근이 불가능하다.
				ClassA.defStatic = 1;	//defStatic = 1;	this.defStatic = 1;
				ClassA.proStatic = 1;	//proStatic = 1;	this.proStatic = 1;
				ClassA.pubStatic = 1;	//pubStatic = 1;	this.pubStatic = 1;
		
				
			ClassA a = new ClassA(); // 상속을 받지 않았기 때문에 직접 바로 인스턴스 변수들에게 접근이 불가능 하다.
			// 그래서 객체를 만든 후에 접근이 가능하다. 
			a.def = 1;
			a.pro = 1;
			a.pub = 1;
		
	}
	
	static void runStaticThing() {
		
		// static 메서드 내부에서는 인스턴스 변수들은 객체를 만들고 접근이 가능하기 떄문에
		// 객체를 생성하지 않고는 객체 멤버 접근 불가
				//pri = 1;	this.pri = 1;
				//def = 1;	this.def = 1;
				//pro = 1;	this.pro = 1;
				//pub = 1;	this.pub = 1;

		// 정적 멤버는 클래스명.정적멤버 형태의 접근을 권장
		//ClassA.priStatic = 1;	//priStatic = 1;	//this.priStatic = 1;
		ClassA.defStatic = 1;	//defStatic = 1;	//this.defStatic = 1;
		ClassA.proStatic = 1;	//proStatic = 1;	//this.proStatic = 1;
		ClassA.pubStatic = 1;	//pubStatic = 1;	//this.pubStatic = 1;
		
		// 마찬 가지로 객체 생성후 접근 가능
		
		ClassA a = new ClassA();
		a.def = 1;
		a.pro = 1;
		a.pub = 1;
		// private 는 그 클래스 내부에서만 접근이 가능하다. 그래서 겟터와 셋터로만 접근이 가능합니다. 
		
		
		
	}
	

}
