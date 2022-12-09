package packageOne;

public class ClassA {
	
	// 인스턴스 변수
	
	private int pri;
	int def; // default
	protected int pro;
	public int pub;
	
	// 클래스 변수
	static private int priStatic;
	static int defStatic;
	static protected int proStatic;
	static public int pubStatic;
	
	
	void runSomething() {
		
		pri = 1;
		this.pri = 1;
		def = 1;
		this.def = 1;
		pro = 1;
		this.pro = 1;
		pub = 1;
		this.pub = 1;

		// 정적 멤버는 클래스명.정적멤버 형태의 접근을 권장
		ClassA.priStatic = 1;
		priStatic = 1;
		this.priStatic = 1;
		
		ClassA.defStatic = 1;
		defStatic = 1;
		this.defStatic = 1;
		
		ClassA.proStatic = 1;
		proStatic = 1;
		this.proStatic = 1;
		
		ClassA.pubStatic = 1;
		pubStatic = 1;
		this.pubStatic = 1;
		
	}
	
	static void runStaticthing() {
		
		// 정적 멤버는 클래스명.정적멤버 형태의 접근을 권장
				ClassA.priStatic = 1;
				priStatic = 1; // this.priStatic = 1;
				ClassA.defStatic = 1;
				defStatic = 1; // this.defStatic = 1;
				ClassA.proStatic = 1;
				proStatic = 1; // this.proStatic = 1;
				ClassA.pubStatic = 1;
				pubStatic = 1; // this.pubStatic = 1;
		
		// 객체 멤버를 객체 생성 후에 객체 참조 변수를 통해 접근 가능
				ClassA ca = new ClassA();
				ca.pri = 1;
				ca.def = 1;
				ca.pro = 1;
				ca.pub = 1;
		
	}
	
	
	

}
