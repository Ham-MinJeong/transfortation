package transfortation;

public class Director {
	
	public static void main(String[] arg) {
		
		System.out.println("사람을 생성합니다");
		 
		Person 사람  = new Person();
		사람.지하철타러가기();
		
		System.out.println("충전소를 생성합니다");
		
		ChargeStation 충전소 = new ChargeStation();
		충전소.충전하기(1000);
		
		System.out.println("개찰구를 생성합니다");
		
		Turnstile 개찰구 = new Turnstile();
		개찰구.멘트();
		
	}

}
