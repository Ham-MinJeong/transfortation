package transfortation;

public class Person {
	public String name;		//�̸�
	public Integer ages;	//����
	Card ī�� = new Card();
	
	public void ī������ϱ�() {
		
		System.out.println("ī�� �����ϱ�");
	}

	public void ī�������ϱ�(Card ī��, int �����ݾ�, ChargeStation ������) {
		System.out.println("ī�带 �����մϴ�");
		������.�����ϱ�(�����ݾ�, ī��);
		ī��.�ݾ������ޱ�(������);
		
	}

	public void ����öŸ������() {
		System.out.println("����ö�� Ÿ�� ���ϴ�");
		
	}
	
}
