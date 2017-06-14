package transfortation;

public class Director {
	
	public static void main(String[] arg) {
		
		System.out.println("<Director> : 사람을 생성합니다");
		Person 사람  = new Person();
		
		System.out.println("<Director> : 사람님..카드를 소지하세요!");
		사람.카드소지하기();
		
		System.out.println("<Director> : 카드를 충전시킵니다");			
		사람.카드충전하기(100);
		
		System.out.println("<Director> : 개찰구를 생성합니다");
		Turnstile 개찰구 = new Turnstile();
		
		System.out.println("<Director> : 지하철을 타러갑니다");
		사람.지하철타러가기(개찰구);
	
	}
	
}
