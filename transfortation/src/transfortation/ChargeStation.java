package transfortation;

public class ChargeStation {
	public static int ���ܾ�;
	public static void �����ϱ�(Integer �ݾ�, Card ī��) {
		ī��.�ݾ��Ա�(�ݾ�);
		�ݾ�Ȯ���ϱ�(ī��);
	}
	
	public static void �ݾ�Ȯ���ϱ�(Card ī��){
		���ܾ� = ī��.getBalance();
		System.out.println("���� �� �ܾ��� "+ ���ܾ� +"�� �Դϴ�");
		
	}
}
