package transfortation;

public class Card {
	
	
	private Integer balance = 400;	//�ܾ�
		
	public Integer getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}	

	public void �ݾ��Ա�(int �ݾ�) {
		this.balance += �ݾ�;
		System.out.println("<Card> : �Ա� �� �ܾ��� " + balance + "�� �Դϴ�.");
	}	

	public boolean �ݾ����(int �ݾ�) {
		if(�ܾ���ȸ() >= �ݾ�) {
			this.balance -= �ݾ�;
			System.out.println("<Card> : ��� �� �ܾ��� " + balance + "�� �Դϴ�.");
			return true;
		} else {
			return false;
		}
	}
	
	public int �ܾ���ȸ(){
		return this.balance;
	}
	
}
