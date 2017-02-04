// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc692.ProgrammingLaptop1Steamworks2017;

import org.usfirst.frc692.ProgrammingLaptop1Steamworks2017.commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public static boolean pMode = false;
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public Joystick leftJoystick;
    public Joystick rightJoystick;
    public JoystickButton switchCameraButtonOne;
    public Joystick oneStickDrive;
    public JoystickButton gearCloseButtonA;
    public JoystickButton gearOpenButtonB;
    public JoystickButton dumpButtonX;
    public JoystickButton dumpResetButtonY;
    public JoystickButton climbUpButtonLB;
    public JoystickButton dumpMotorButtonRB;
    public Joystick gamepad;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        gamepad = new Joystick(0);
        
        dumpMotorButtonRB = new JoystickButton(gamepad, 6);
        dumpMotorButtonRB.whileHeld(new DumpTruckMotor());
        climbUpButtonLB = new JoystickButton(gamepad, 5);
        climbUpButtonLB.whileHeld(new ClimbUp());
        dumpResetButtonY = new JoystickButton(gamepad, 4);
        dumpResetButtonY.whenPressed(new DumpTruckReset());
        dumpButtonX = new JoystickButton(gamepad, 3);
        dumpButtonX.whenPressed(new DumpTruckUnload());
        gearOpenButtonB = new JoystickButton(gamepad, 2);
        gearOpenButtonB.whenPressed(new GearOpen());
        gearCloseButtonA = new JoystickButton(gamepad, 1);
        gearCloseButtonA.whenPressed(new GearClose());
        oneStickDrive = new Joystick(2);
        
        switchCameraButtonOne = new JoystickButton(oneStickDrive, 1);
        switchCameraButtonOne.whenPressed(new SwitchCamera());
        rightJoystick = new Joystick(1);
        
        leftJoystick = new Joystick(3);
        


        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("DriveTrainWithTwoJoysticks", new DriveTrainWithTwoJoysticks());
        SmartDashboard.putData("DriveWithOneJoystick", new DriveWithOneJoystick());
        SmartDashboard.putData("GearOpen", new GearOpen());
        SmartDashboard.putData("GearClose", new GearClose());
        SmartDashboard.putData("DumpTruckUnload", new DumpTruckUnload());
        SmartDashboard.putData("DumpTruckReset", new DumpTruckReset());
        SmartDashboard.putData("SwitchCamera", new SwitchCamera());
        SmartDashboard.putData("ClimbUp", new ClimbUp());
        SmartDashboard.putData("TestCommand", new TestCommand());
        SmartDashboard.putData("DumpTruckMotor", new DumpTruckMotor());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getLeftJoystick() {
        return leftJoystick;
    }

    public Joystick getRightJoystick() {
        return rightJoystick;
    }

    public Joystick getOneStickDrive() {
        return oneStickDrive;
    }

    public Joystick getGamepad() {
        return gamepad;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

