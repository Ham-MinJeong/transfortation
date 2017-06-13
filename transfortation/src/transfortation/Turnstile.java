package transfortation;

public class Turnstile {
	public Integer baserate = 500;	//기본요금
	public static final int GATE_OPEN = 1;
	public static final int GATE_NOT_OPEN = 2;
			
	public void 열기(Card 카드) {
		if (카드.금액출금(baserate)){
			멘트(GATE_OPEN);			
		} else {				
			멘트(GATE_NOT_OPEN);
		}
	}
		
	public void 멘트(Integer Gate_Case) {
		
		switch (Gate_Case) {
		case GATE_OPEN:
			System.out.println("열렸습니다");
			
			break;
		case GATE_NOT_OPEN:
			System.out.println("잔액이 부족합니다");
			
			break;
		default:
			break;
		}
		System.out.println("감사합니다");
	}
	
}
