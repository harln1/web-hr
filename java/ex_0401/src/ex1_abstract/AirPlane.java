package ex1_abstract;

public class AirPlane extends Transport{
	
	int airportFee;
	int fuelCharge;
	
	//필드는 생성자를 통해 초기화
	public AirPlane(String name, int baseFare, int airportFee, int fuelCharge) {
		super(name, baseFare); 
		this.airportFee = airportFee;
		this.fuelCharge = fuelCharge;
	}
  
	//기본요금+공항이용료+ 유류할증비
	@Override
	int calculateFare() {
		
		return baseFare + airportFee + fuelCharge;
	}
}
