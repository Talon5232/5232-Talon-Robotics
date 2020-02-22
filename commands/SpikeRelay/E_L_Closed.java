/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.SpikeRelay;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ElevatorLatch;


public class E_L_Closed extends CommandBase {
  
  private final ElevatorLatch m_ElevatorLatch;

  public E_L_Closed(ElevatorLatch subsystem) {
      m_ElevatorLatch = subsystem;
      addRequirements(m_ElevatorLatch);
  }

  // Called when the command is initially scheduled.
  @Override
  public void execute() {
    m_ElevatorLatch.E_L_Closed();
  }

  public boolean isFinished() {
    return false;
  }
}
