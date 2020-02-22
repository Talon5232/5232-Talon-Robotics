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

public class Winch extends SubsystemBase {
  
  private final WPI_TalonSRX m_Winch = 
    new WPI_TalonSRX(ClimbingConstants.kWinchMotor);

public void SetMotor() {

  SupplyCurrentLimitConfiguration cLc = new SupplyCurrentLimitConfiguration(true, 20, 25, .1);

  m_Winch.configFactoryDefault(10);
  m_Winch.setNeutralMode(NeutralMode.Brake);
  m_Winch.configOpenloopRamp(.2);
  m_Winch.configSupplyCurrentLimit(cLc, 10);


}

public void WinchUp(){
  m_Winch.set(ControlMode.PercentOutput, 1.0);
}

public void WinchDown(){
  m_Winch.set(ControlMode.PercentOutput, -1.0);
}
public void WinchIdle(){
  m_Winch.set(ControlMode.PercentOutput, 0);
}

}
