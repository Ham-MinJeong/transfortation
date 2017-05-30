package transfortation;

public class Person {
	public String name;		//이름
	public Integer ages;	//나이
	private Card 교통카드;

//	public Card get교통카드() {
//		return 교통카드;
//	}
//
//	public void set교통카드(Card 교통카드) {
//		this.교통카드 = 교통카드;
//	}

	
	public void 카드소지하기() {
		교통카드 = new Card();
		System.out.println("네 알겠습니다..");
	}

	public void 카드충전하기(int 충전금액) {
		System.out.println("카드에 "+ 충전금액 +"원 충전합니다");
		ChargeStation.충전하기(충전금액, this.교통카드);
	}

	public void 지하철타러가기(Turnstile 개찰구) {
		System.out.println("개찰구에 카드를 찍습니다");
		개찰구.열기(교통카드);	
	}
	
}
