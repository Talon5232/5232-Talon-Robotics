
package frc.robot;

import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.POVButton;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import frc.robot.Constants.AutoConstants;
import frc.robot.Constants.OIConstants;

import frc.robot.commands.DriveTrain.DefaultDrive;
import frc.robot.commands.Intake.BeltOneWay;
import frc.robot.commands.Intake.BeltOtherWay;
import frc.robot.commands.Intake.Intake;
import frc.robot.commands.Intake.RotDown;
import frc.robot.commands.Intake.RotUp;
import frc.robot.commands.Intake.Shoot;
import frc.robot.commands.SpikeRelay.E_L_Closed;
import frc.robot.commands.SpikeRelay.E_L_Open;
import frc.robot.commands.SpikeRelay.SwitchClosed;
import frc.robot.commands.SpikeRelay.SwitchOn;
import frc.robot.commands.WheelOfFortune.WheelRotDown;
import frc.robot.commands.WheelOfFortune.WheelRotUp;
import frc.robot.commands.WheelOfFortune.WoFS;
import frc.robot.commands.WheelOfFortune.WoFS2;
import frc.robot.commands.Auto.DriveDistance;
import frc.robot.commands.Climbing.ElevatorDown;
import frc.robot.commands.Climbing.ElevatorUp;
import frc.robot.commands.Climbing.WinchDown;
import frc.robot.commands.Climbing.WinchUp;
import frc.robot.subsystems.Belt;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.ElevatorLatch;
import frc.robot.subsystems.ElevatorSub;

import frc.robot.subsystems.IntakeRotSub;
import frc.robot.subsystems.IntakeSub;
import frc.robot.subsystems.IntakeSwitch;
import frc.robot.subsystems.WheelRot;
import frc.robot.subsystems.Winch;
import frc.robot.subsystems.WoFSSub;
import edu.wpi.first.wpilibj2.command.Command;



/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems
  private final DriveSubsystem m_robotDrive = new DriveSubsystem();

  private final IntakeSub m_IntakeSub = new IntakeSub();
  private final Belt m_Belt = new Belt();
  private final ElevatorLatch m_ElevatorLatch = new ElevatorLatch();
  private final ElevatorSub m_Elevator = new ElevatorSub();
  private final IntakeRotSub m_Rotate = new IntakeRotSub();
  private final IntakeSwitch m_IntakeSwitch = new IntakeSwitch();
  private final Winch m_Winch = new Winch();
  private final WheelRot m_WheelRot = new WheelRot();
  private final WoFSSub m_WoFS = new WoFSSub();
  
  // The autonomous routines

  // A simple auto routine that drives forward a specified distance, and then stops.
  private final Command m_simpleAuto =
      new DriveDistance(AutoConstants.kAutoDriveDistanceInches, AutoConstants.kAutoDriveSpeed,
                        m_robotDrive);

  // A complex auto routine that drives forward, drops a hatch, and then drives backward.
  // private final Command m_complexAuto = new ComplexAuto(m_robotDrive, m_IntakeSub, m_Belt);

  // A chooser for autonomous commands
  SendableChooser<Command> m_chooser = new SendableChooser<>();

  // The driver's controller
  Joystick m_driverController = new Joystick(OIConstants.kDriverControllerPort);
  Joystick m_buttons = new Joystick(OIConstants.kButtons);
  Joystick m_blueButtons = new Joystick(OIConstants.kBlueButtons);
  
  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    
      
    
    // Configure the button bindings
    configureButtonBindings(
   
    );
    
    // Configure default commands
    // Set the default drive command to split-stick arcade drive
    m_robotDrive.setDefaultCommand(
        // A split-stick arcade command, with forward/backward controlled by the left
        // hand, and turning controlled by the right.
        new DefaultDrive(
            m_robotDrive,
            () -> m_driverController.getY(),
            () -> m_driverController.getZ()));

    // Add commands to the autonomous command chooser
    m_chooser.setDefaultOption("Simple Auto", m_simpleAuto);
   // m_chooser.addOption("Complex Auto", m_complexAuto);

    // Put the chooser on the dashboard
    Shuffleboard.getTab("Autonomous").add(m_chooser);
  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {

  //  final JoystickButton k1 = new JoystickButton(m_buttons, 1);
  //  final JoystickButton k2 = new JoystickButton(m_buttons, 2);
    final JoystickButton k3 = new JoystickButton(m_buttons, 3);
    final JoystickButton k4 = new JoystickButton(m_buttons, 4);
    final JoystickButton k5 = new JoystickButton(m_buttons, 5);
    final JoystickButton k6 = new JoystickButton(m_buttons, 6);
  //  final JoystickButton k7 = new JoystickButton(m_buttons, 7);
  //  final JoystickButton k8 = new JoystickButton(m_buttons, 8);
    final JoystickButton k9 = new JoystickButton(m_buttons, 9);
    final JoystickButton k10 = new JoystickButton(m_buttons, 10);
    final JoystickButton k11 = new JoystickButton(m_buttons, 11);
    final JoystickButton k12 = new JoystickButton(m_buttons, 12);
    final JoystickButton k13 = new JoystickButton(m_buttons, 13);
    final JoystickButton k14 = new JoystickButton(m_buttons, 14);
    final JoystickButton k15 = new JoystickButton(m_buttons, 15);
    final JoystickButton k16 = new JoystickButton(m_buttons, 16);
    final POVButton k180 = new POVButton(m_buttons, 180);
    final POVButton k0 = new POVButton(m_buttons, 0);

    final JoystickButton b1 = new JoystickButton(m_blueButtons, 1);
    final JoystickButton b2 = new JoystickButton(m_blueButtons, 2);
    final JoystickButton b3 = new JoystickButton(m_blueButtons, 3);
    final JoystickButton b4 = new JoystickButton(m_blueButtons, 4);
    final JoystickButton b5 = new JoystickButton(m_blueButtons, 5);
    final JoystickButton b6 = new JoystickButton(m_blueButtons, 6);
    final JoystickButton b7 = new JoystickButton(m_blueButtons, 7);
    final JoystickButton b8 = new JoystickButton(m_blueButtons, 8);

   // final JoystickButton k14 = new JoystickButton(m_buttons, 14);
  //  final JoystickButton k15 = new JoystickButton(m_buttons, 15);
  //  final JoystickButton k16 = new JoystickButton(m_buttons, 16); 

    
    //Wheel Of Fortune
    b1.whileHeld(new WheelRotUp(m_WheelRot));
    b2.whileHeld(new WheelRotDown(m_WheelRot));
    b5.whileHeld(new WoFS(m_WoFS));
    b6.whileHeld(new WoFS2(m_WoFS));
    //Intake Commands
      
    //Intake In/Out 
    k3.whileHeld(new Shoot(m_IntakeSub));
    k4.whileHeld(new Intake(m_IntakeSub));
   
      //Intake Belts
    b3.whileHeld(new BeltOneWay(m_Belt));
    b4.whileHeld(new BeltOtherWay(m_Belt));
   
      //Intake Rotation
    k13.whileHeld(new RotUp(m_Rotate));
    k14.whileHeld(new RotDown(m_Rotate));
   
      //Fan On Off
    b7.whenPressed(new SwitchOn(m_IntakeSwitch));
    b8.whenPressed(new SwitchClosed(m_IntakeSwitch));

    //Climbing Commands
    
      //Elevator Buttons
    k5.whileHeld(new ElevatorUp(m_Elevator));
    k10.whileHeld(new ElevatorDown(m_Elevator));
    
      //Elevator Latch
    k6.whenPressed(new E_L_Open(m_ElevatorLatch));
    k9.whenPressed(new E_L_Closed(m_ElevatorLatch));
    
      //Winch Buttons
    k11.whileHeld(new WinchUp(m_Winch));
    k16.whileHeld(new WinchDown(m_Winch));

    //Drivetrain Commands


    //Relay Commands


    //Auto Programs

  }


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    return m_chooser.getSelected();
  }
}
