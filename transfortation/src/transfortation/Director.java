package transfortation;

public class Director {
	
	public static void main(String[] arg) {
		
		System.out.println("사람을 생성합니다");
		Person 사람  = new Person();
		
		System.out.println("카드를 충전시킵니다");			
		사람.카드충전하기(100);
		
		System.out.println("개찰구를 생성합니다");
		Turnstile 개찰구 = new Turnstile();
		
		System.out.println("지하철을 타러갑니다");
		사람.지하철타러가기(개찰구);
	
	}
	
}
