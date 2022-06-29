// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.XboxController.Button;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.drivetrain.Drive;
import frc.robot.commands.pneumatics.ShiftDown;
import frc.robot.commands.pneumatics.ShiftUp;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Pneumatics;
import frc.robot.commands.flagController.turnOff;
import frc.robot.commands.flagController.turnOn;
import frc.robot.subsystems.FlagController;

/** Add your docs here. */
public class RobotContainer implements HardwareAdapter {

    public static Drivetrain dt = new Drivetrain();
    public static Pneumatics pn = new Pneumatics();
    public static FlagController fc = new FlagController();

    public RobotContainer() {
        configDefaultCommands();
        configButtons();
    }

    public void configDefaultCommands() {
        dt.setDefaultCommand(new Drive());

        new ShiftDown().schedule();
    }

    public void configButtons() {
        xbox.leftBumper.whenPressed(new ShiftUp());
        xbox.leftBumper.whenReleased(new ShiftDown());
        new JoystickButton(xbox, Button.kA.value)
        .whenPressed(new turnOn());
        new JoystickButton(xbox, Button.kB.value)
        .whenPressed(new turnOff());
    }

}
