package packageOne;

public class ClassB {
	
	void runSomthing() {
		
		// ����� ���� �ʾұ⿡ ClassA �� ��ü ����� ��ü ���� �Ŀ� ���� ����
				//pri = 1;	this.pri = 1;
				//def = 1;	this.def = 1;
				//pro = 1;	this.pro = 1;
				//pub = 1;	this.pub = 1;
		
		// ���� ����� Ŭ������.������� ������ ������ ����
				//ClassA.priStatic = 1;	//priStatic = 1;	this.priStatic = 1; // ��·�� private �� �ٸ� Ŭ�������� ������ �Ұ����ϴ�.
				ClassA.defStatic = 1;	//defStatic = 1;	this.defStatic = 1;
				ClassA.proStatic = 1;	//proStatic = 1;	this.proStatic = 1;
				ClassA.pubStatic = 1;	//pubStatic = 1;	this.pubStatic = 1;
		
				
			ClassA a = new ClassA(); // ����� ���� �ʾұ� ������ ���� �ٷ� �ν��Ͻ� �����鿡�� ������ �Ұ��� �ϴ�.
			// �׷��� ��ü�� ���� �Ŀ� ������ �����ϴ�. 
			a.def = 1;
			a.pro = 1;
			a.pub = 1;
		
	}
	
	static void runStaticThing() {
		
		// static �޼��� ���ο����� �ν��Ͻ� �������� ��ü�� ����� ������ �����ϱ� ������
		// ��ü�� �������� �ʰ�� ��ü ��� ���� �Ұ�
				//pri = 1;	this.pri = 1;
				//def = 1;	this.def = 1;
				//pro = 1;	this.pro = 1;
				//pub = 1;	this.pub = 1;

		// ���� ����� Ŭ������.������� ������ ������ ����
		//ClassA.priStatic = 1;	//priStatic = 1;	//this.priStatic = 1;
		ClassA.defStatic = 1;	//defStatic = 1;	//this.defStatic = 1;
		ClassA.proStatic = 1;	//proStatic = 1;	//this.proStatic = 1;
		ClassA.pubStatic = 1;	//pubStatic = 1;	//this.pubStatic = 1;
		
		// ���� ������ ��ü ������ ���� ����
		
		ClassA a = new ClassA();
		a.def = 1;
		a.pro = 1;
		a.pub = 1;
		// private �� �� Ŭ���� ���ο����� ������ �����ϴ�. �׷��� ���Ϳ� ���ͷθ� ������ �����մϴ�. 
		
		
		
	}
	

}
