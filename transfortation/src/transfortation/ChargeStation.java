package transfortation;

public class ChargeStation {
	public Integer chargefee;	//충전금액
	public Integer chargeblance;
	
	public void 충전하기(Integer 금액, Card 카드) {
		this.chargefee = 금액;
		chargeblance =카드.balance + this.chargefee;
		System.out.println(금액+"원 충전합니다");
	}

}
