package ex1_final;

public class Parking {

	//기본요금:10,000원(상수)
	//추가요금 : 시간당 2,000(상수)
	static final int BASIC = 10000;
	static final int ADDITIONAL = 2000;
	
	//요금계산 메서드
	
	public static int caculateFee (int time  ) {
		return BASIC + (time * ADDITIONAL );
		
	}

}
