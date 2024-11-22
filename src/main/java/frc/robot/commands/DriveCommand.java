package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveTrainSubsystem;
import frc.robot.utils.NetworkTableUtils;

public class DriveCommand extends Command {
    private DriveTrainSubsystem driveTrainSubsystem;
    private XboxController controller;
    private double leftVoltage;
    private double rightVoltage;
    public double speedScalar;
    private final NetworkTableUtils table = new NetworkTableUtils("Debug");
    public DriveCommand(DriveTrainSubsystem driveTrainSubsystem, XboxController controller, double speedScalar){
        this.driveTrainSubsystem = driveTrainSubsystem;
        this.controller = controller;
        this.speedScalar = speedScalar;
        addRequirements(driveTrainSubsystem);
    }
    //4.481 Start position. End position 3.433. 1.048 position change per meter.

    @Override
    public void execute() {
        leftVoltage = (controller.getLeftY() * 2) - (controller.getLeftX());
        rightVoltage = (controller.getLeftY() * 2) - (controller.getLeftX());
        this.driveTrainSubsystem.setLeftSideMotorVoltage(leftVoltage * speedScalar);
        this.driveTrainSubsystem.setRightSideMotorVoltage(rightVoltage * speedScalar);
        table.setDouble("Position", driveTrainSubsystem.getLeftEncoder().getPosition());

    }
}

