package 인터페이스_분할_원칙_ISP_예시;

public class Driver {

	public static void main(String[] args) {
		
		// 여자친구가 남자친구 객체가 필요한 상황
		
		BoyFriend boyFriend = new Man();
		boyFriend.기념일_챙기기();
		boyFriend.키스하기();
		
		
		
		
		

	}

}
