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
import frc.robot.Constants.IntakeConstants;

public class Belt extends SubsystemBase {
  
  private final WPI_TalonSRX m_Belt =
    new WPI_TalonSRX(IntakeConstants.kBeltMotor);
  
public void SetMotor(){

  SupplyCurrentLimitConfiguration cLc = new SupplyCurrentLimitConfiguration(true, 20, 30, .1);

  m_Belt.configFactoryDefault(10);
  m_Belt.setNeutralMode(NeutralMode.Brake);
  m_Belt.configOpenloopRamp(.2);
  m_Belt.configSupplyCurrentLimit(cLc, 10);


}
  public Belt(){
    
  }
  public void OneWay(){
    m_Belt.set(ControlMode.PercentOutput, 1.0);

  }
  public void BeltOtherWay(){
    m_Belt.set(ControlMode.PercentOutput, -1.0);
  }
  public void BeltIdle(){
    m_Belt.set(ControlMode.PercentOutput, 0);
  }
}
