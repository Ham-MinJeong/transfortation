package transfortation;

public class Director {
	
	public static void main(String[] arg) {
		
		System.out.println("����� �����մϴ�");
		Person ���  = new Person();
		
				
		System.out.println("ī�� �����մϴ�");
		Card ī�� = new Card();
		
		System.out.println("�����Ҹ� �����մϴ�");
		ChargeStation ������ = new ChargeStation();
		
		���.ī�������ϱ�(ī��, 100, ������);
		
		System.out.println("�������� �����մϴ�");
		
		Turnstile ������ = new Turnstile();
		
		���.����öŸ������();
		System.out.println("�������� ī�带 ����ϴ�");
		������.����(ī��);	
		������.��Ʈ();
	}

}
