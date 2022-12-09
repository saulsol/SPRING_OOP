package 인터페이스_분할_원칙_ISP_예시;

public class Man implements BoyFriend, Soldier, Son, Worker {
	
	public void 기념일_챙기기() {
		System.out.println("여자친구를 위한 기념일을 챙겨보자.");
	}
	
	public void 키스하기() {
		System.out.println("여자친구와 키스하자.");
	}
	
	public void 효도하기() {
		System.out.println("부모님을 위해 효도를 하자.");
	}
	
	public void 안마하기() {
		System.out.println("부모님께 안마를 해드리자.");
	}
	
	public void 출근하기() {
		System.out.println("출근을 해보자.");
	}
	
	public void 아부하기() {
		System.out.println("부장님에게 아부를 하자.");
	}
	
	public void 사격하기() {
		System.out.println("군대에서 사격 만발이었다구!");
	}
	
	public void 구보하기() {
		System.out.println("군대에 왔으니 구보를 해야지!");
	}


}
