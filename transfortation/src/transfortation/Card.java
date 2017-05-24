package transfortation;

public class Card {
	public Integer deposit = 0;		//입금액
	public Integer withdraw = 0;	//출금액	
	public Integer balance = 400;		//잔액
	
	public void 금액충전받기(ChargeStation 충전소) {
		this.balance = 충전소.chargeblance;
		System.out.println("충전 후 잔액은" + balance );
	}	

	public void 금액출금() {
		
		System.out.println("출금 되었습니다");
		
	}
	
}
