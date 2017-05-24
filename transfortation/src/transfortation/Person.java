package transfortation;

public class Person {
	public String name;		//이름
	public Integer ages;	//나이
	Card 카드 = new Card();
	
	public void 카드소지하기() {
		
		System.out.println("카드 소지하기");
	}

	public void 카드충전하기(Card 카드, int 충전금액, ChargeStation 충전소) {
		System.out.println("카드를 충전합니다");
		충전소.충전하기(충전금액, 카드);
		카드.금액충전받기(충전소);
		
	}

	public void 지하철타러가기() {
		System.out.println("지하철을 타러 갑니다");
		
	}
	
}
