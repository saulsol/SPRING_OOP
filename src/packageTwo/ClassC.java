package packageTwo;
import packageOne.ClassA;

public class ClassC {

	void runSomthing() {

		// ����� ���� �ʾұ⿡ ClassA �� ��ü ����� ��ü ���� �Ŀ� ���� ����
		//pri = 1;	this.pri = 1;
		//def = 1;	this.def = 1;
		//pro = 1;	this.pro = 1;
		//pub = 1;	this.pub = 1;

		// ���� ����� Ŭ������.������� ������ ������ ����
		//ClassA.priStatic = 1;	//priStatic = 1;	this.priStatic = 1;
		//ClassA.defStatic = 1;	//defStatic = 1;	this.defStatic = 1;
		//ClassA.proStatic = 1;	//proStatic = 1;	this.proStatic = 1;
		ClassA.pubStatic = 1;	//pubStatic = 1;	this.pubStatic = 1;

		// �翬�� private�� ������ �Ұ����մϴ�. 
		// default ���� �Ұ� �ֳ��ϸ� �ٸ� ��Ű���ϱ� 
		// preotected ���, ���� ��Ű�� �϶��� ������ �����ϱ� ������

		// ��ü ����� ��ü ���� �Ŀ� ��ü ���� ������ ���� ���� ����
		ClassA ca = new ClassA();
		//ca.pri = 1;
		//ca.def = 1;
		//ca.pro = 1;
		ca.pub = 1;

	}
	
	static void runStaticRhing() {
		
		// ��ü�� �������� �ʰ�� ��ü ��� ���� �Ұ�
				//pri = 1;	this.pri = 1;
				//def = 1;	this.def = 1;
				//pro = 1;	this.pro = 1;
				//pub = 1;	this.pub = 1;
				
				// ���� ����� Ŭ������.������� ������ ������ ����
				//ClassA.priStatic = 1;	//priStatic = 1;	//this.priStatic = 1;
				//ClassA.defStatic = 1;	//defStatic = 1;	//this.defStatic = 1;
				//ClassA.proStatic = 1;	//proStatic = 1;	//this.proStatic = 1;
				ClassA.pubStatic = 1;	//pubStatic = 1;	//this.pubStatic = 1;
				
				// ��ü ����� ��ü ���� �Ŀ� ��ü ���� ������ ���� ���� ����
				ClassA ca = new ClassA();
				//ca.pri = 1;
				//ca.def = 1;
				//ca.pro = 1;
				ca.pub = 1;
		
		
		
	}
	

	
	
	
}
