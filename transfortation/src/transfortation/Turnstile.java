package transfortation;

public class Turnstile {
	public Integer baserate;	//기본요금
	public String ment;			//멘트
	
	public void 열기(Card 카드) {
		if(카드.balance> baserate){
			System.out.println("열렸습니다");
		}
				
		System.out.println("잔액이 부족합니다");
	}
	
	public void 멘트() {
		System.out.println("감사합니다");
	}
	
}
