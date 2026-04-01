package ex3_interface;

public class Main2 {
	
	public static void main(String[] args) {
		Button button = new Button();
		
		button.ClickListener(new LoginListener());
		button.click();

		button.ClickListener(new LogoutListener());
		button.click();
	}

}
