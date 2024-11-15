package frc.robot.commands;
import com.revrobotics.RelativeEncoder;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveTrainSubsystem;
import frc.robot.utils.NetworkTableUtils;


public class DriveXMeter extends Command {
   private final PIDController drivingPID = new PIDController(0.5, 0, 0);
   private final NetworkTableUtils table = new NetworkTableUtils("Debug");
   private final DriveTrainSubsystem driveTrainSubsystem;

   public DriveXMeter(DriveTrainSubsystem driveTrainSubsystem) {
      this.driveTrainSubsystem = driveTrainSubsystem;

      addRequirements(driveTrainSubsystem);




   }
   @Override
   public void execute() {

   }







}
