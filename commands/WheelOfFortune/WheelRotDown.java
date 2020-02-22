/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.WheelOfFortune;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.WheelRot;

public class WheelRotDown extends CommandBase {
 
  private final WheelRot m_WheelRot;

  public WheelRotDown(WheelRot subsystem) {
    m_WheelRot = subsystem;
    addRequirements(m_WheelRot);
    
  }

  // Called when the command is initially scheduled.
  @Override
  public void execute() {
    m_WheelRot.RotDown();
  }
  public void end(boolean interrupted) {
    m_WheelRot.RotIdle();
  }
  @Override
  public boolean isFinished() {
    return false;
  }
}
