package transfortation;

public class Card {
	
	
	private Integer balance = 400;	//잔액
		
	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public void 금액입금(int 금액) {
		this.balance += 금액;
		System.out.println("입금 후 잔액은 " + balance );
	}	
		
	public void 금액출금(int 금액) {
		this.balance -= 금액;
		System.out.println("출금 후 잔액은 " + balance);
	}
	
	public boolean 잔액조회(int 지불금액){
		if(balance>=지불금액){
			return true;
		} else {				
			return false;
		}
	}
	
}
