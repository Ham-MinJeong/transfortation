package transfortation;

public class Turnstile {
	public Integer baserate = 500;	//�⺻���
			
	public void ����(Card ī��) {
		if(�ܾ���ȸ(ī��)==true){
			ī��.�ݾ����(baserate);
			��Ʈ(1);			
		} else {				
			��Ʈ(2);
		}
	}

	public boolean �ܾ���ȸ(Card ī��){
		if(ī��.balance>= baserate){
			return true;
		} else {				
			return false;
		}
	}
	
	public void ��Ʈ(Integer Ment) {
		switch (Ment) {
		case 1:
			System.out.println("���Ƚ��ϴ�");
			
			break;
		case 2:
			System.out.println("�ܾ��� �����մϴ�");
			
			break;
		default:
			break;
		}
		System.out.println("�����մϴ�");
	}
	
}
