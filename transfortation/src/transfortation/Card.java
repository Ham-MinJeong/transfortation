package transfortation;

public class Card {
	public Integer deposit = 0;		//�Աݾ�
	public Integer withdraw = 0;	//��ݾ�	
	public Integer balance = 400;		//�ܾ�
	
	public void �ݾ������ޱ�(ChargeStation ������) {
		this.balance = ������.chargeblance;
		System.out.println("���� �� �ܾ���" + balance );
	}	

	public void �ݾ����() {
		
		System.out.println("��� �Ǿ����ϴ�");
		
	}
	
}
