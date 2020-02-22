/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;



import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.SpikeRelayConstants;

public class ElevatorLatch extends SubsystemBase {

  private final Relay m_ElevatorLatch =
    new Relay(SpikeRelayConstants.kElevatorLatch);

public void E_L_Closed(){
  m_ElevatorLatch.set(Relay.Value.kReverse);
}

public void E_L_Open(){
  m_ElevatorLatch.set(Relay.Value.kForward);
}

}
