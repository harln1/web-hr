package ex3_interface;

public class Button {
	public ClickListener clistener;

	public void ClickListener(ClickListener clistener) {
		this.clistener = clistener;
	}

	public void click() {
		
			clistener.onClick();
		
	}
}
