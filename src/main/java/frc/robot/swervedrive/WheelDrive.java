import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import com.revrobotics.CANSparkMax;

public class WheelDrive {
    private CANSparkMax angleMotor;
    private CANSparkMax speedMotor;
    private PIDController pidController;


private CANSparkMax angleMotor;
private CANSparkMax speeedMotor;
private PIDcontroller pidController;
    public WheelDrive (int angleMotor, int speedMotor, int encoder) {
        this.angleMotor = new CANSparkMax (angleMotor);



    }
}