/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.Climbing;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Winch;

public class WinchDown extends CommandBase {

  private final Winch m_Winch;

  public WinchDown(Winch subsystem) {
    m_Winch = subsystem;
    addRequirements(m_Winch);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_Winch.WinchDown();
  }
  public void end(boolean interrupted) {
    m_Winch.WinchIdle();
  }
  public boolean isFinished() {
    return false;
  }
}
