package transfortation;

public class Card {
	
	
	private Integer balance = 400;	//잔액
		
	public Integer getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}	

	public void 금액입금(int 금액) {
		this.balance += 금액;
		System.out.println("<Card> : 입금 후 잔액은 " + balance + "원 입니다.");
	}	

	public boolean 금액출금(int 금액) {
		if(잔액조회() >= 금액) {
			this.balance -= 금액;
			System.out.println("<Card> : 출금 후 잔액은 " + balance + "원 입니다.");
			return true;
		} else {
			return false;
		}
	}
	
	public int 잔액조회(){
		return this.balance;
	}
	
}
