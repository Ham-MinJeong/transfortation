package transfortation;

public class Director {
	
	public static void main(String[] arg) {
		
		System.out.println("����� �����մϴ�");
		 
		Person ���  = new Person();
		���.����öŸ������();
		Card ī�� = new Card();
		
		System.out.println("�����Ҹ� �����մϴ�");
		ChargeStation ������ = new ChargeStation();
		������.�����ϱ�(100, ī��);
		ī��.�ݾ������ޱ�(������);
		
		System.out.println("�������� �����մϴ�");
		
		Turnstile ������ = new Turnstile();
		
		System.out.println("�������� ī�带 ����ϴ�");
		������.����(ī��);	
		������.��Ʈ();
	}

}
