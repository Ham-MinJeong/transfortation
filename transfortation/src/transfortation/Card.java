package transfortation;

public class Card {
	
	
	public Integer balance = 400;	//잔액
	//	
//	public Integer getBalance() {
//		return balance;
//	}
//
//	public void setBalance(Integer balance) {
//		this.balance = balance;
//	}
//

	public void 금액충전받기(int 금액) {
		this.balance += 금액;
		System.out.println("충전 후 잔액은 " + balance );
	}	
	
	
	public void 금액출금(int 금액) {
		this.balance -= 금액;
		System.out.println("출금 후 잔액은 " + balance);
		
	}
	
	
}
