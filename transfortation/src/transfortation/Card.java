package transfortation;

public class Card {
	
	
	public Integer balance = 400;	//�ܾ�
	//	
//	public Integer getBalance() {
//		return balance;
//	}
//
//	public void setBalance(Integer balance) {
//		this.balance = balance;
//	}
//

	public void �ݾ������ޱ�(int �ݾ�) {
		this.balance += �ݾ�;
		System.out.println("���� �� �ܾ��� " + balance );
	}	
	
	
	public void �ݾ����(int �ݾ�) {
		this.balance -= �ݾ�;
		System.out.println("��� �� �ܾ��� " + balance);
		
	}
	
	
}
