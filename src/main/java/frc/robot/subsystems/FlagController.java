
/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.HardwareAdapter;
// import com.ctre.phoenix.motorcontrol.ControlMode;


public class FlagController extends SubsystemBase implements HardwareAdapter {
  public FlagController() {
  }
   
  public void turnOn() {
    flag.set(0.33);
  }

  public void turnOff() {
    flag.set(0);
  }
  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
