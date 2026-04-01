package ex1_abstract;

public class Taxi extends Transport{
	int distance;
	int farePerkm;
	
	public Taxi(String name, int baseFare,int distance , int farePerkm) {

		super(name, baseFare);
		this.distance = distance;
		this.farePerkm = farePerkm;
	}
	@Override
	int calculateFare() {

		return baseFare + (distance * farePerkm);
	}
}