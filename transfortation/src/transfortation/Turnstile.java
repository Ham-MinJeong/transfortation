package transfortation;

public class Turnstile {
	public Integer baserate = 500;	//�⺻���
	public static final int Gate_Open = 1;
	public static final int Gate_Not_Open = 2;
			
	public void ����(Card ī��) {
		if(ī��.�ܾ���ȸ(baserate)==true){
			ī��.�ݾ����(baserate);
			��Ʈ(Gate_Open);			
		} else {				
			��Ʈ(Gate_Not_Open);
		}
	}
		
	public void ��Ʈ(Integer Gate_Case) {
		
		switch (Gate_Case) {
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
