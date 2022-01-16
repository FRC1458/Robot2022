//Need:
//Field draw with scaler
//Main loop with movement input drawn

public class drawTest {

	public static void main(String[] args) {

		Draw turtle = new Draw();

		turtle.drawField();

		while (True) {
			//Code for joystick here, use SwerveDrive and WheelDrive to calculate each wheel's angle and speed

			turtle.calculatePosition();

			turtle.drawPositionRotation();

			
		}
	}
}