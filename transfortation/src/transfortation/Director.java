package transfortation;

public class Director {
	
	public static void main(String[] arg) {
		
		System.out.println("����� �����մϴ�");
		 
		Person ���  = new Person();
		���.����öŸ������();
		
		System.out.println("�����Ҹ� �����մϴ�");
		
		ChargeStation ������ = new ChargeStation();
		������.�����ϱ�(1000);
		
		System.out.println("�������� �����մϴ�");
		
		Turnstile ������ = new Turnstile();
		������.��Ʈ();
		
	}

}
