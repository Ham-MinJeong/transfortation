package transfortation;

public class Director {
	
	public static void main(String[] arg) {
		
		System.out.println("사람을 생성합니다");
		Person 사람  = new Person();
		
				
		System.out.println("카드 생성합니다");
		Card 카드 = new Card();
		
		System.out.println("충전소를 생성합니다");
		ChargeStation 충전소 = new ChargeStation();
		
		사람.카드충전하기(카드, 100, 충전소);
		
		System.out.println("개찰구를 생성합니다");
		
		Turnstile 개찰구 = new Turnstile();
		
		사람.지하철타러가기();
		System.out.println("개찰구에 카드를 찍습니다");
		개찰구.열기(카드);	
		개찰구.멘트();
	}

}
