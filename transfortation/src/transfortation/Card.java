package transfortation;

public class Card {
	public Integer deposit;		//입금액
	public Integer withdraw;	//출금액	
	public Integer balance;		//잔액
	
	public void 카드소지하기() {
		System.out.println("카드 소지하기");
	}

	public void 카드충전하기() {
		System.out.println("카드 충전하기");
	}

	public void 지하철타러가기() {
		System.out.println("지하철 타러가기");
	}
}
