/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.SpikeRelay;

import edu.wpi.first.wpilibj2.command.CommandBase;



import frc.robot.subsystems.IntakeSwitch;


public class SwitchOn  extends CommandBase {
  
  private final IntakeSwitch m_IntakeSwitch;

  public SwitchOn(IntakeSwitch subsystem) {
      m_IntakeSwitch = subsystem;
      addRequirements(m_IntakeSwitch);
  }

  // Called when the command is initially scheduled.
  @Override
  public void execute() {
    m_IntakeSwitch.SwitchOn();
  }

  public boolean isFinished() {
    return false;
  }
}
