
package frc.robot.subsystems;

import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import com.revrobotics.spark.*;


public class ForkLift extends SubsystemBase {

    private final SparkMax forkliftMotor = new SparkMax(5, MotorType.kBrushed);


    public void setForkliftSpeed(double speed) {
        forkliftMotor.set(speed);
    }

    public Command goUp() {
        return this.runEnd(
            () -> setForkliftSpeed(.5),
            () -> setForkliftSpeed(0)
        );
    }

    public Command goDown() {
        return this.runEnd(
            () -> setForkliftSpeed(-.5),
            () -> setForkliftSpeed(0)
        );
    }
}