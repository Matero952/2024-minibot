package frc.robot.subsystems;

import com.revrobotics.CANSparkLowLevel;
import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrainSubsystem extends SubsystemBase {
    private final CANSparkMax leftSideMotor = new CANSparkMax(1, CANSparkLowLevel.MotorType.kBrushless);
    private final CANSparkMax rightSideMotor = new CANSparkMax(2, CANSparkLowLevel.MotorType.kBrushless);


    public DriveTrainSubsystem() {

    }
    public void setLeftSideMotorVoltage(double voltage){
        this.leftSideMotor.setVoltage(voltage);
    }
    public void setRightSideMotorVoltage(double voltage) {
        rightSideMotor.setVoltage(voltage);
    }
}
