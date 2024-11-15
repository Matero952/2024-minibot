package frc.robot.subsystems;

import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkLowLevel;
import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrainSubsystem extends SubsystemBase {
    private final CANSparkMax leftSideMotor = new CANSparkMax(1, CANSparkLowLevel.MotorType.kBrushless);
    private final CANSparkMax rightSideMotor = new CANSparkMax(2, CANSparkLowLevel.MotorType.kBrushless);
    private final RelativeEncoder leftEncoder = leftSideMotor.getEncoder();
    private final RelativeEncoder rightEncoder = rightSideMotor.getEncoder();
    private double conversionFactor = 8845.939;




    public DriveTrainSubsystem() {

    }
    public void setLeftSideMotorVoltage(double voltage){
        this.leftSideMotor.setVoltage(voltage);
    }
    public void setRightSideMotorVoltage(double voltage) {
        rightSideMotor.setVoltage(voltage);
    }
    public RelativeEncoder getLeftEncoder() {
        return leftEncoder;
    }
    public RelativeEncoder getRightEncoder() {
        return rightEncoder;
    }
}
