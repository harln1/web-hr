package ex1_refilection.member;

public class Car {
	//필드 문자열
	//모두 private
	//모델model
	//오너owner
	private String model;
	private  String owner;
	
	
	//기본생성자
	public Car() {
		
	}
	//모델만 초기화하는 생성자
	public Car (String model) {
		this.model = model;
		
	}
	//setter&getter
	  public String getModel() {
	        return model;
	    }

	    public void setModel(String model) {
	        this.model = model;
	    }

	    
	    public String getOwner() {
	        return owner;
	    }

	    public void setOwner(String owner) {
	        this.owner = owner;
	    }

}
