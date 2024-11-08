// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.subsystems.*;
import frc.robot.commands.*;



/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...

  private final XboxController primaryController = new XboxController(0);
  private final XboxController secondaryController = new XboxController(1);
  private final DriveTrainSubsystem driveTrainSubsystem = new DriveTrainSubsystem();






  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings


//FOR ALL: tune timeouts



    // Configure the button bindings
    configureButtonBindings();
  }

  public void configureButtonBindings() {
    driveTrainSubsystem.setDefaultCommand(new DriveCommand(driveTrainSubsystem, primaryController, 1));

    new JoystickButton(primaryController, XboxController.Button.kA.value).whileTrue(
            new DriveCommand(driveTrainSubsystem, primaryController, 0.5)
    );
  }
  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return new InstantCommand();
  }
}







