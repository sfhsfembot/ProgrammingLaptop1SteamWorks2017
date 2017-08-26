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

import org.usfirst.frc692.ProgrammingLaptop1Steamworks2017.Robot;
import org.usfirst.frc692.ProgrammingLaptop1Steamworks2017.RobotMap;
import org.usfirst.frc692.ProgrammingLaptop1Steamworks2017.commands.*;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 *
 */
public class DumpTruck extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final DigitalInput downStop = RobotMap.dumpTruckDownStop;
    private final DigitalInput upStop = RobotMap.dumpTruckUpStop;
    private final SpeedController dumpTruckCorkscrewMotor = RobotMap.dumpTruckDumpTruckCorkscrewMotor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    }
    
    private static final int movingUp = 1;
    private static final int movingDown = -1;
    //these are constants to state that the elevator is moving in Up/Down direction 
    //AC 1/19/15
    
    private int dumpTruckState;
    //variable that is set to a constant to tell state
    //AC 1/19/15
    
    public void setDumpTruckMovingUp()
    {
    	dumpTruckState = movingUp;
    }
    //elevator is moving up
    //AC 1/19/15
    
    public void setDumpTruckMovingDown()
    {
    	dumpTruckState = movingDown;
    }
    //elevator is moving down
    //AC 1/19/15
    
    
    public boolean isMovingUp()
    {
    	if(dumpTruckState == 1)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
    //boolean to check if elevator is moving up 
    //true = up 
    //AC 1/19/15
    
    public boolean isMovingDown()
    {
    	if(dumpTruckState == -1)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
    //boolean to check if elevator is moving down
    //true = down
    //AC 1/19/15


    
    public void screwUp()
    {
    	if (Robot.oi.corkscrewButtonUpY.get() == true)
    	{
    		dumpTruckCorkscrewMotor.set(1.0);
    		SmartDashboard.putString("screwUp:", "false");
    	}
    	else
    	{
    		SmartDashboard.putString("screwUp:", "true");
    	}
    }
    // The speed controller DumpTruckCorkscrewMotor tells the DumpTruck mechanism to go up at 100% power.
    // TTT 2-6-17
    
    public void stop()
    {
    	dumpTruckCorkscrewMotor.set(0.0);
    }
    
    public void screwReset()
    {
    	if (!Robot.oi.corkscrewButtonDownX.get() == true)
    	{
    		dumpTruckCorkscrewMotor.set(-1.0);
    		SmartDashboard.putString("screwDown:", "false");
    	}
    	else
    	{
    		SmartDashboard.putString("screwDown:", "true");
    	}
    }
    // Motor values
    //APO 3/13/17
    
    
    public boolean upperLimitSwitch()
    {
    	if(upStop.get() == true)
    	{
    		SmartDashboard.putString("Upper Limit Switch:", "true");
    	}
    	else
    	{
    		SmartDashboard.putString("Upper Limit Switch:", "false");
    	}
    	return upStop.get();
    	
    }
    
    //returns true when pressed
    //indicates whether platform is on ground level
    //when pressed elevator stops
    //AC 1/15/15
    
    public boolean lowerLimitSwitch()
    {
    	if(downStop.get() == true)
    	{
    		SmartDashboard.putString("Lower Limit Switch:", "true");
    	}
    	else
    	{
    		SmartDashboard.putString("Lower Limit Switch:", "false");
    	}
    	return downStop.get();
    }
    //returns true when pressed
    //indicates whether platform is on step level
    //when pressed elevator stops
    //AC 1/16/15

// The speed controller DumpTruckCorkscrewMotor tells the DumpTruck mechanism to set it backwards at 100% power.
//HSH 2-6-17
    
//    public void takeJoystickGamepadValue(double leftVal)
//    {
//    	
//    }
    
}

