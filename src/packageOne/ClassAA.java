package packageOne;

public class ClassAA extends ClassA {
		// private 으로 정의된 변수는 상속에서 제외 즉 상속 불가 변수
		// 필드는 변수를 선언하는 곳이지 값을 초기화 시키는 곳이 아니다. 
	
	void runSomething() {
		//pri = 1;	this.pri = 1;
		def = 1;	this.def = 1;
		pro = 1;	this.pro = 1;
		pub = 1;	this.pub = 1;
		
		// 정적 멤버는 클래스명.정적멤버 형태의 접근을 권장
		//ClassA.priStatic = 1;	priStatic = 1;	this.priStatic = 1;
		ClassA.defStatic = 1;	defStatic = 1;	this.defStatic = 1;
		ClassA.proStatic = 1;	proStatic = 1;	this.proStatic = 1;
		ClassA.pubStatic = 1;	pubStatic = 1;	this.pubStatic = 1;
	}
	
	
	static void runStaticThing(ClassA a) {
		
		// 객체를 생성하지 않고는 객체 멤버 접근 불가
				//pri = 1;	this.pri = 1;
				//def = 1;	this.def = 1;
				//pro = 1;	this.pro = 1;
				//pub = 1;	this.pub = 1;
		
		a = new ClassA();
		a.def = 1; 
		
		// 정적 멤버는 클래스명.정적멤버 형태의 접근을 권장
				//ClassA.priStatic = 1;	priStatic = 1;	//this.priStatic = 1;
				ClassA.defStatic = 1;	defStatic = 1;	//this.defStatic = 1;
				ClassA.proStatic = 1;	proStatic = 1;	//this.proStatic = 1;
				ClassA.pubStatic = 1;	pubStatic = 1;	//this.pubStatic = 1;
		
		ClassAA aa = new ClassAA(); // 상속을 받았으니깐 부모의 변수도 사용할 수 있다. 어쩄든 static 메서드는 객체 없이 사용할 수 있는데 인스턴스 변수들은 객체 생성후 메모리 공간이 생기니깐 당연히 사용 불가. 메서드 내부에서 객체를 만들어 줘야 한다.  
		aa.def = 1;
		aa.pro = 1;
		aa.pub = 1;
		
		
	}
	
	
	

}
