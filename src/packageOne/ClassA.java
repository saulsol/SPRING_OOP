package packageOne;

public class ClassA {
	
	// �ν��Ͻ� ����
	
	private int pri;
	int def; // default
	protected int pro;
	public int pub;
	
	// Ŭ���� ����
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

		// ���� ����� Ŭ������.������� ������ ������ ����
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
		
		// ���� ����� Ŭ������.������� ������ ������ ����
				ClassA.priStatic = 1;
				priStatic = 1; // this.priStatic = 1;
				ClassA.defStatic = 1;
				defStatic = 1; // this.defStatic = 1;
				ClassA.proStatic = 1;
				proStatic = 1; // this.proStatic = 1;
				ClassA.pubStatic = 1;
				pubStatic = 1; // this.pubStatic = 1;
		
		// ��ü ����� ��ü ���� �Ŀ� ��ü ���� ������ ���� ���� ����
				ClassA ca = new ClassA();
				ca.pri = 1;
				ca.def = 1;
				ca.pro = 1;
				ca.pub = 1;
		
	}
	
	
	

}
