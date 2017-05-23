package transfortation;

public class Card {
	public Integer deposit;		//입금액
	public Integer withdraw;	//출금액	
	public Integer balance;		//잔액
	
	public void 금액충전받기() {
		System.out.println("충전 받음");
	}
	
	public void 금액출금() {
		System.out.println("출금 되었습니다");
	}
	
}
