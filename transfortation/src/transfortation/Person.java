package transfortation;

public class Person {
	public String name;		//�̸�
	public Integer ages;	//����
	private Card ����ī��;

//	public Card get����ī��() {
//		return ����ī��;
//	}
//
//	public void set����ī��(Card ����ī��) {
//		this.����ī�� = ����ī��;
//	}

	
	public void ī������ϱ�() {
		����ī�� = new Card();
		System.out.println("�� �˰ڽ��ϴ�..");
	}

	public void ī�������ϱ�(int �����ݾ�) {
		System.out.println("ī�忡 "+ �����ݾ� +"�� �����մϴ�");
		ChargeStation.�����ϱ�(�����ݾ�, this.����ī��);
	}

	public void ����öŸ������(Turnstile ������) {
		System.out.println("�������� ī�带 ����ϴ�");
		������.����(����ī��);	
	}
	
}
