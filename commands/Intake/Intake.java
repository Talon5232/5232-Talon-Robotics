/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.Intake;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.IntakeSub;

public class Intake extends CommandBase {
 
  private final IntakeSub m_IntakeSub;

  public Intake(IntakeSub subsystem) {
    m_IntakeSub = subsystem;
    addRequirements(m_IntakeSub);
    
  }

  // Called when the command is initially scheduled.
  @Override
  public void execute() {
    m_IntakeSub.Intake();
  }
  public void end(boolean interrupted) {
    m_IntakeSub.IntakeIdle();
  }
  @Override
  public boolean isFinished() {
    return false;
  }
}
