package transfortation;

public class Card {
	
	
	private Integer balance = 400;	//�ܾ�
		
	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public void �ݾ��Ա�(int �ݾ�) {
		this.balance += �ݾ�;
		System.out.println("�Ա� �� �ܾ��� " + balance );
	}	

	public boolean �ݾ����(int �ݾ�) {
		if(�ܾ���ȸ() >= �ݾ�) {
			this.balance -= �ݾ�;
			System.out.println("��� �� �ܾ��� " + balance);
			return true;
		} else {
			return false;
		}
	}
	
	public int �ܾ���ȸ(){
		return this.balance;
	}
	
}
