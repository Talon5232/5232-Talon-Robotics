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


public class IntakeRotSub extends SubsystemBase {

  private final WPI_TalonSRX m_Rotate = new WPI_TalonSRX(IntakeConstants.kRotateMotor);

  public void SetMotor() {
   
    SupplyCurrentLimitConfiguration cLc = new SupplyCurrentLimitConfiguration(true, 10, 15, .1);

    m_Rotate.configFactoryDefault(10);
    m_Rotate.setNeutralMode(NeutralMode.Brake);
    m_Rotate.configOpenloopRamp(.2);
    m_Rotate.configSupplyCurrentLimit(cLc, 10);

  }
 
  public void RotUp() {
    m_Rotate.set(ControlMode.PercentOutput, .25);
  }

  public void RotDown() {
    m_Rotate.set(ControlMode.PercentOutput, -1.0);
  }

  public void RotIdle() {
    m_Rotate.set(ControlMode.PercentOutput, 0);
}
}
