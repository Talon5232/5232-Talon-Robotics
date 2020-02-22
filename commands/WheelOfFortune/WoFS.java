/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.WheelOfFortune;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.subsystems.WoFSSub;

public class WoFS extends CommandBase {
 
  private final WoFSSub m_WoFS;

  public WoFS(WoFSSub subsystem) {
    m_WoFS = subsystem;
    addRequirements(m_WoFS);
    
  }

  // Called when the command is initially scheduled.
  @Override
  public void execute() {
    m_WoFS.WoFS1();
  }
  public void end(boolean interrupted) {
    m_WoFS.WoFSIdle();
  }
  @Override
  public boolean isFinished() {
    return false;
  }
}
