package transfortation;

public class Turnstile {
	public Integer baserate = 500;	//�⺻���
	public String ment;			//��Ʈ
		
	public void ����(Card ī��) {
		if(ī��.balance>= baserate){
			System.out.println("���Ƚ��ϴ�");
		} else {				
			System.out.println("�ܾ��� �����մϴ�");
		}
	}
	
	public void ��Ʈ() {
		System.out.println("�����մϴ�");
	}
	
}
