package frc.robot.commands.flagController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
public class turnOff extends CommandBase {
    public turnOff(){
        addRequirements(RobotContainer.fc);
    }
    @Override
    public void initialize() {}
  
    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        RobotContainer.fc.turnOff();
    }
  
    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {}
  
    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
      return true;
    }
}
