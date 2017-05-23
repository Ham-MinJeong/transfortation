package transfortation;

public class Turnstile {
	public Integer baserate;	//기본요금
	public String ment;			//멘트
	
	public void 열기(Card 카드) {
		System.out.println("카드 소지하기");
	}
	
	public void 멘트() {
		System.out.println("감사합니다");
	}
	
}
