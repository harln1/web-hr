package ex1_overriding;

public class PrartTimeEmployee extends Employee {
	int hour;
	int worktime;
	
	
	public PrartTimeEmployee (String name ,int hourly , int worktime) {
		super(name);
		this.hour = hour;
		this.worktime = worktime;
	}
	
	@Override
	public int getPay() {
		return hour*worktime;
		
	}

}
