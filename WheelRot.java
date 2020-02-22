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
import frc.robot.Constants.WheelOfFortune;

public class WheelRot extends SubsystemBase {
  
  private final WPI_TalonSRX m_WheelRot =
    new WPI_TalonSRX(WheelOfFortune.kWheelofFortune);

    public void SetMotor(){

      SupplyCurrentLimitConfiguration cLc = new SupplyCurrentLimitConfiguration(true, 25, 30, .1);
    
      m_WheelRot.configFactoryDefault(10);
      m_WheelRot.setNeutralMode(NeutralMode.Brake);
      m_WheelRot.configOpenloopRamp(.2);
      m_WheelRot.configSupplyCurrentLimit(cLc, 10);
    
    
    }
      public void RotUp(){
        m_WheelRot.set(ControlMode.PercentOutput, 1.0);
      }
    
      public void RotDown(){
      m_WheelRot.set(ControlMode.PercentOutput, -1.0);
    }
      public void RotIdle(){
        m_WheelRot.set(ControlMode.PercentOutput, 0);
      }
     
    }
    
