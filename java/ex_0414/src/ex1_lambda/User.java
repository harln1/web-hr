package ex1_lambda;

public class User {
	String name;
	int age;
	String city;
	public User(String name , int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}
	 @Override
	    public String toString() {
	        return String.format("%s(%d세, %s)", name, age, city);
	    }

}
