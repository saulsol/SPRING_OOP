package packageOne;

public class ClassAA extends ClassA {
		// private ���� ���ǵ� ������ ��ӿ��� ���� �� ��� �Ұ� ����
		// �ʵ�� ������ �����ϴ� ������ ���� �ʱ�ȭ ��Ű�� ���� �ƴϴ�. 
	
	void runSomething() {
		//pri = 1;	this.pri = 1;
		def = 1;	this.def = 1;
		pro = 1;	this.pro = 1;
		pub = 1;	this.pub = 1;
		
		// ���� ����� Ŭ������.������� ������ ������ ����
		//ClassA.priStatic = 1;	priStatic = 1;	this.priStatic = 1;
		ClassA.defStatic = 1;	defStatic = 1;	this.defStatic = 1;
		ClassA.proStatic = 1;	proStatic = 1;	this.proStatic = 1;
		ClassA.pubStatic = 1;	pubStatic = 1;	this.pubStatic = 1;
	}
	
	
	static void runStaticThing(ClassA a) {
		
		// ��ü�� �������� �ʰ�� ��ü ��� ���� �Ұ�
				//pri = 1;	this.pri = 1;
				//def = 1;	this.def = 1;
				//pro = 1;	this.pro = 1;
				//pub = 1;	this.pub = 1;
		
		a = new ClassA();
		a.def = 1; 
		
		// ���� ����� Ŭ������.������� ������ ������ ����
				//ClassA.priStatic = 1;	priStatic = 1;	//this.priStatic = 1;
				ClassA.defStatic = 1;	defStatic = 1;	//this.defStatic = 1;
				ClassA.proStatic = 1;	proStatic = 1;	//this.proStatic = 1;
				ClassA.pubStatic = 1;	pubStatic = 1;	//this.pubStatic = 1;
		
		ClassAA aa = new ClassAA(); // ����� �޾����ϱ� �θ��� ������ ����� �� �ִ�. ��� static �޼���� ��ü ���� ����� �� �ִµ� �ν��Ͻ� �������� ��ü ������ �޸� ������ ����ϱ� �翬�� ��� �Ұ�. �޼��� ���ο��� ��ü�� ����� ��� �Ѵ�.  
		aa.def = 1;
		aa.pro = 1;
		aa.pub = 1;
		
		
	}
	
	
	

}
