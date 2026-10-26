package frc.robot.subsystems;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ForkLift extends SubsystemBase {

    private final SparkMax forkliftMotor = new SparkMax(5, MotorType.kBrushless);

    public void setForkliftSpeed(double speed) {
        forkliftMotor.set(speed);
    }

    public Command goUp() {
        return this.runEnd(
            () -> setForkliftSpeed(0.5),
            () -> setForkliftSpeed(0.0)
        );
    }

    public Command goDown() {
        return this.runEnd(
            () -> setForkliftSpeed(-0.5),
            () -> setForkliftSpeed(0.0)
        );
    }
}
