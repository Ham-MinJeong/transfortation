package transfortation;

public class ChargeStation {
	public static int 총잔액;
	public static void 충전하기(Integer 금액, Card 카드) {
		카드.금액입금(금액);
		금액확인하기(카드);
	}
	
	public static void 금액확인하기(Card 카드){
		총잔액 = 카드.getBalance();
		System.out.println("충전 후 잔액은 "+ 총잔액 +"원 입니다");
		
	}
}
