package test;
//2차 상속 막내 BallPen->FountainPen
public class FountainPen extends BallPen{

	public void refill (int n) {
		setAmount(n);
	}
}
