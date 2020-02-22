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

public class IntakeSub extends SubsystemBase {
  private final WPI_TalonSRX m_Intake = 
    new WPI_TalonSRX(IntakeConstants.kIntakeMotor);
  
public void SetMotor(){

  SupplyCurrentLimitConfiguration cLc = new SupplyCurrentLimitConfiguration(true, 25, 30, .1);

  m_Intake.configFactoryDefault(10);
  m_Intake.setNeutralMode(NeutralMode.Brake);
  m_Intake.configOpenloopRamp(.2);
  m_Intake.configSupplyCurrentLimit(cLc, 10);


}
 
  public void Intake(){
    m_Intake.set(ControlMode.PercentOutput, .75);
  }

  public void Shoot(){
  m_Intake.set(ControlMode.PercentOutput, -.75);
}
  public void IntakeIdle(){
    m_Intake.set(ControlMode.PercentOutput, 0);
  }
 
}
