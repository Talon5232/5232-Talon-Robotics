/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.Intake;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.IntakeRotSub;

public class RotUp extends CommandBase {
 
  private final IntakeRotSub m_RotSub;

  public RotUp(IntakeRotSub subsystem) {
    m_RotSub = subsystem;
    addRequirements(m_RotSub);
    
  }

  // Called when the command is initially scheduled.
  @Override
  public void execute() {
    m_RotSub.RotUp();
  }
  public void end(boolean interrupted) {
    m_RotSub.RotIdle();
  }
  @Override
  public boolean isFinished() {
    return false;
  }
}
