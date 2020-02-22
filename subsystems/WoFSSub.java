/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.WheelOfFortune;

public class WoFSSub extends SubsystemBase {
  
  private final WPI_VictorSPX m_WoFS =
    new WPI_VictorSPX(WheelOfFortune.kWheelofFortuneSpinner);

    public void SetMotor(){
    
      m_WoFS.configFactoryDefault(10);
      m_WoFS.setNeutralMode(NeutralMode.Brake);
      m_WoFS.configOpenloopRamp(.2);
     
    
    
    }
      public void WoFS1(){
        m_WoFS.set(ControlMode.PercentOutput, 1.0);
      }
    
      public void WoFS2(){
      m_WoFS.set(ControlMode.PercentOutput, -1.0);
    }
      public void WoFSIdle(){
        m_WoFS.set(ControlMode.PercentOutput, 0);
      }
     
    }
    
