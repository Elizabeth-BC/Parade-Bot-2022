package frc.robot.commands.flagController;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
public class turnOn extends CommandBase {
    public turnOn(){
        addRequirements(RobotContainer.fc);
    }
    @Override
    public void initialize() {}
  
    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        RobotContainer.fc.turnOn();
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
