package transfortation;

public class ChargeStation {
	public Integer chargefee;	//�����ݾ�
	public Integer chargeblance;
	
	public void �����ϱ�(Integer �ݾ�, Card ī��) {
		this.chargefee = �ݾ�;
		chargeblance =ī��.balance + this.chargefee;
		System.out.println(�ݾ�+"�� �����մϴ�");
	}

}
