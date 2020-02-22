/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.SupplyCurrentLimitConfiguration;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ClimbingConstants;

public class ElevatorSub extends SubsystemBase {
  
  private final WPI_TalonSRX m_Elevator =
    new WPI_TalonSRX(ClimbingConstants.kElevatorMotor);

public void SetMotor(){

  SupplyCurrentLimitConfiguration cLc = new SupplyCurrentLimitConfiguration(true, 10, 15, .1);

  m_Elevator.configFactoryDefault(10);
  m_Elevator.setNeutralMode(NeutralMode.Brake);
  m_Elevator.configOpenloopRamp(.2);
  m_Elevator.configSupplyCurrentLimit(cLc, 10);


}


public void ElevatorUp(){
  m_Elevator.set(ControlMode.PercentOutput, 1.0);
}
public void ElevatorDown(){
  m_Elevator.set(ControlMode.PercentOutput, -1.0);
}
public void ElevatorIdle(){
  m_Elevator.set(ControlMode.PercentOutput, 0);
}
}
