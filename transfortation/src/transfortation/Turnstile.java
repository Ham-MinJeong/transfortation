package transfortation;

public class Turnstile {
	public Integer baserate = 500;	//기본요금
	public static final int Gate_Open = 1;
	public static final int Gate_Not_Open = 2;
			
	public void 열기(Card 카드) {
		if(카드.잔액조회(baserate)==true){
			카드.금액출금(baserate);
			멘트(Gate_Open);			
		} else {				
			멘트(Gate_Not_Open);
		}
	}
		
	public void 멘트(Integer Gate_Case) {
		
		switch (Gate_Case) {
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
