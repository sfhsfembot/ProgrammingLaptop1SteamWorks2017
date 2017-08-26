// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc692.ProgrammingLaptop1Steamworks2017.subsystems;

import org.usfirst.frc692.ProgrammingLaptop1Steamworks2017.OI;
import org.usfirst.frc692.ProgrammingLaptop1Steamworks2017.RobotMap;
import org.usfirst.frc692.ProgrammingLaptop1Steamworks2017.commands.*;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class DriveTrain extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController frontLeftSpeedController = RobotMap.driveTrainFrontLeftSpeedController;
    private final SpeedController backLeftSpeedController = RobotMap.driveTrainBackLeftSpeedController;
    private final SpeedController frontRightSpeedController = RobotMap.driveTrainFrontRightSpeedController;
    private final SpeedController backRightSpeedController = RobotMap.driveTrainBackRightSpeedController;
    private final RobotDrive robotDrive41 = RobotMap.driveTrainRobotDrive41;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new DriveWithOneJoystick());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    } 
    
    public void moveForwardAuton()
    {
    	robotDrive41.drive(1.0, 0.0);
    }
    // DriveTrain moves forward at 100% power.
    // HSH 1-14-17
    // Update: changed this for Auton code use (check the Autonomous Command)
    // APO 2/4/17
    
    public void robotStopAuton()
    {
    	robotDrive41.drive(0.0, 0.0);
    }
    // DriveTrain doesn't move when joysticks aren't touched
    // HSH 1-14-17
    // Update: changed this for Auton code use (check the Autonomous Command)
    // APO 2/4/17
    
    public void takeJoystickAxisValues(double leftDrive, double rightDrive)
    {
    	robotDrive41.tankDrive(leftDrive,rightDrive);
    }
//     Grabbed values of leftDrive and rightDrive train
//     TTT 1-14-2017
    
    public void autonMoveForward(double speed)
    {
    	robotDrive41.drive(speed, 0);
    }
    
    
    // UNCOMMENT AFTERTESTING PPNEUMATICS
    
    private double joystickAdjust(double value, double deadzone)
	{
		double temp;
		
		// Squaring and deadzones for cartesian (X, Y, and Twist(Z)) values
		if(value > deadzone)
		{
			temp = value * value;
		}
		else if(value < -deadzone)
		{
			temp = -value * value;
		}
		else
		{
			temp = 0;
		}

		return temp;
	}
	
	public void driveWithJoystick(Joystick oneStickDrive)
	{
		
		final double deadzone = .0125; // amount of deadspace around center
		double x/* = joystickP0.getX()*/;
		double y/* = joystickP0.getY()*/;
		double twist = oneStickDrive.getTwist(); //z-axis of Joystick
		
		x = joystickAdjust(oneStickDrive.getX(), deadzone);
		y = joystickAdjust(oneStickDrive.getY(), deadzone);
		//twist = joystickAdjust(joystickP0.getTwist(), deadzone);
		
		twist = twist/-1.0;
		y = -y;
		
		if(OI.pMode == true)
		{
			robotDrive41.arcadeDrive(y/1.0, twist/1.0);
		}
		else
		{
			robotDrive41.arcadeDrive(y, twist);
		}
    }
	
}
