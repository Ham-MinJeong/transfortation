package transfortation;

public class Turnstile {
	public Integer baserate = 500;	//기본요금
			
	public void 열기(Card 카드) {
		if(잔액조회(카드)==true){
			카드.금액출금(baserate);
			멘트(1);			
		} else {				
			멘트(2);
		}
	}

	public boolean 잔액조회(Card 카드){
		if(카드.balance>= baserate){
			return true;
		} else {				
			return false;
		}
	}
	
	public void 멘트(Integer Ment) {
		switch (Ment) {
		case 1:
			System.out.println("열렸습니다");
			
			break;
		case 2:
			System.out.println("잔액이 부족합니다");
			
			break;
		default:
			break;
		}
		System.out.println("감사합니다");
	}
	
}
