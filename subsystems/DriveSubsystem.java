/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.SupplyCurrentLimitConfiguration;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants.DriveConstants;

public class DriveSubsystem extends SubsystemBase {
  
  private final WPI_TalonSRX m_RightMotor1 = new WPI_TalonSRX(DriveConstants.kRightMotor1Port);
  private final WPI_VictorSPX m_RightMotor2 = new WPI_VictorSPX(DriveConstants.kRightMotor2Port);
  private final WPI_VictorSPX m_RightMotor3 = new WPI_VictorSPX(DriveConstants.kRightMotor2Port);

  private final WPI_TalonSRX m_LeftMotor1 = new WPI_TalonSRX(DriveConstants.kLeftMotor1Port);
  private final WPI_VictorSPX m_LeftMotor2 = new WPI_VictorSPX(DriveConstants.kLeftMotor2Port);
  private final WPI_VictorSPX m_LeftMotor3 = new WPI_VictorSPX(DriveConstants.kLeftMotor3Port);

  // The motors on the left side of the drive.
  private final SpeedControllerGroup m_leftMotors =

      new SpeedControllerGroup(m_LeftMotor1, m_LeftMotor2, m_LeftMotor3);

  // The motors on the right side of the drive.
  private final SpeedControllerGroup m_rightMotors = new SpeedControllerGroup(m_RightMotor1, m_RightMotor2,
      m_RightMotor3);

  // The robot's drive
  private final DifferentialDrive m_drive = new DifferentialDrive(m_leftMotors, m_rightMotors);

  // The left-side drive encoder
  private final Encoder m_leftEncoder = new Encoder(DriveConstants.kLeftEncoderPorts[0],
      DriveConstants.kLeftEncoderPorts[1], DriveConstants.kLeftEncoderReversed);

  // The right-side drive encoder
  private final Encoder m_rightEncoder = new Encoder(DriveConstants.kRightEncoderPorts[0],
      DriveConstants.kRightEncoderPorts[1], DriveConstants.kRightEncoderReversed);

  /**
   * Creates a new DriveSubsystem.
   */
  public DriveSubsystem() {
    // Sets the distance per pulse for the encoders
    m_leftEncoder.setDistancePerPulse(DriveConstants.kEncoderDistancePerPulse);
    m_rightEncoder.setDistancePerPulse(DriveConstants.kEncoderDistancePerPulse);

   //Setting default values on Motor Controllers - Limiting Amperage too (Only Talons, Victors not capable). 
    SupplyCurrentLimitConfiguration cLc = new SupplyCurrentLimitConfiguration(true, 40, 45, .1);
    
    m_RightMotor1.configFactoryDefault(10);
    m_RightMotor1.setNeutralMode(NeutralMode.Brake);
    m_RightMotor1.configSupplyCurrentLimit(cLc, 10);
    
    m_RightMotor2.configFactoryDefault(10);
    m_RightMotor2.setNeutralMode(NeutralMode.Brake);
    

    m_RightMotor3.configFactoryDefault(10);
    m_RightMotor3.setNeutralMode(NeutralMode.Brake);
    
    
  
    m_LeftMotor1.configFactoryDefault(10);
    m_LeftMotor1.setNeutralMode(NeutralMode.Brake);
    m_LeftMotor1.configSupplyCurrentLimit(cLc, 10);

    m_LeftMotor2.configFactoryDefault(10);
    m_LeftMotor2.setNeutralMode(NeutralMode.Brake);
  

    m_LeftMotor3.configFactoryDefault(10);
    m_LeftMotor3.setNeutralMode(NeutralMode.Brake);
    
  }


  /**
   * Drives the robot using arcade controls.
   *
   * @param fwd the commanded forward movement
   * @param rot the commanded rotation
   */
  public void arcadeDrive(double fwd, double rot) {
    
    
    m_drive.arcadeDrive(fwd, -rot);
  }

  /**
   * Resets the drive encoders to currently read a position of 0.
   */
  public void resetEncoders() {
    m_leftEncoder.reset();
    m_rightEncoder.reset();
  }

  /**
   * Gets the average distance of the TWO encoders.
   *
   * @return the average of the TWO encoder readings
   */
  public double getAverageEncoderDistance() {
    return (m_leftEncoder.getDistance() + m_rightEncoder.getDistance()) / 2.0;
  }

  /**
   * Gets the left drive encoder.
   *
   * @return the left drive encoder
   */
  public Encoder getLeftEncoder() {
    return m_leftEncoder;
  }

  /**
   * Gets the right drive encoder.
   *
   * @return the right drive encoder
   */
  public Encoder getRightEncoder() {
    return m_rightEncoder;
  }

  /**
   * Sets the max output of the drive.  Useful for scaling the drive to drive more slowly.
   *
   * @param maxOutput the maximum output to which the drive will be constrained
   */
  public void setMaxOutput(double maxOutput) {
    m_drive.setMaxOutput(maxOutput);
  }
}