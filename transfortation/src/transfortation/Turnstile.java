package transfortation;

public class Turnstile {
	public Integer baserate;	//�⺻���
	public String ment;			//��Ʈ
	
	public void ����(Card ī��) {
		if(ī��.balance> baserate){
			System.out.println("���Ƚ��ϴ�");
		}
				
		System.out.println("�ܾ��� �����մϴ�");
	}
	
	public void ��Ʈ() {
		System.out.println("�����մϴ�");
	}
	
}
