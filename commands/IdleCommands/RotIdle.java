/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.IdleCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.IntakeRotSub;

public class RotIdle extends CommandBase {
 
  private final IntakeRotSub m_RotSub;

  public RotIdle(IntakeRotSub subsystem) {
    m_RotSub = subsystem;
    addRequirements(m_RotSub);
    
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_RotSub.RotIdle();
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
