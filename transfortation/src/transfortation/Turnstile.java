package transfortation;

public class Turnstile {
	public Integer baserate = 500;	//�⺻���
	public static final int GATE_OPEN = 1;
	public static final int GATE_NOT_OPEN = 2;
			
	public void ����(Card ī��) {
		if (ī��.�ݾ����(baserate)){
			��Ʈ(GATE_OPEN);			
		} else {				
			��Ʈ(GATE_NOT_OPEN);
		}
	}
		
	public void ��Ʈ(Integer Gate_Case) {
		
		switch (Gate_Case) {
		case GATE_OPEN:
			System.out.println("���Ƚ��ϴ�");
			
			break;
		case GATE_NOT_OPEN:
			System.out.println("�ܾ��� �����մϴ�");
			
			break;
		default:
			break;
		}
		System.out.println("�����մϴ�");
	}
	
}
