package packageTwo;
import packageOne.ClassA;

public class ClassAB extends ClassA {
	
	void runSomthing() { //상속을 했다. ---> protected 접근은 가능하다. 하지만 defaault 접근은 불가능 하다.
		
				//pri = 1;	this.pri = 1;  // 인스턴스 변수는 상속을 헀기 떄문에 접근이 가능합니다. 
				//def = 1;	this.def = 1;
				pro = 1;	this.pro = 1;
				pub = 1;	this.pub = 1;
				
				// 정적 멤버는 클래스명.정적멤버 형태의 접근을 권장
				//ClassA.priStatic = 1;	priStatic = 1;	this.priStatic = 1;
				//ClassA.defStatic = 1;	defStatic = 1;	this.defStatic = 1;
				ClassA.proStatic = 1;	proStatic = 1;	this.proStatic = 1;
				ClassA.pubStatic = 1;	pubStatic = 1;	this.pubStatic = 1;
				
				// 정적 멤버도 마찬가지. default도 접근이 불가능 합니다. 왜냐하면 다른 패키지 이기 때문이져
	}

	
	static void runStaticThing() {
		
		// 객체를 생성하지 않고는 객체 멤버 접근 불가
				//pri = 1;	this.pri = 1;
				//def = 1;	this.def = 1;
				//pro = 1;	this.pro = 1;
				//pub = 1;	this.pub = 1;
		
		// 정적 멤버는 클래스명.정적멤버 형태의 접근을 권장
				//ClassA.priStatic = 1;	priStatic = 1;	//this.priStatic = 1;
				//ClassA.defStatic = 1;	defStatic = 1;	//this.defStatic = 1;
				ClassA.proStatic = 1;	proStatic = 1;	//this.proStatic = 1;
				ClassA.pubStatic = 1;	pubStatic = 1;	//this.pubStatic = 1;
		
				
			// 객체 멤버를 객체 생성 후에 객체 참조 변수를 통해 접근 가능
			ClassAB cab = new ClassAB();
			//ca.pri = 1;
			//ca.def = 1;
			cab.pro = 1;
			cab.pub = 1;
		
		// 객체를 생성해도 달라질건 없다. 그냥 static 이든 인스턴스든 접근 재한에는 얄짤없다. 
			
			
			
	}
	
	
	
	
	
}
