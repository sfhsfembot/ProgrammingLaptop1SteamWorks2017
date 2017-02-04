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

import org.usfirst.frc692.ProgrammingLaptop1Steamworks2017.RobotMap;
import org.usfirst.frc692.ProgrammingLaptop1Steamworks2017.commands.*;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class GearPiston extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final DoubleSolenoid gearSolenoid = RobotMap.gearPistonGearSolenoid;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    
    public void closeGear()
    {
    	gearSolenoid.set(Value.kReverse);
    }
    // Causes piston to close therefore the gear mechanism opens to release the gear in it.
    // APO 1/21/2017
    
    public void resetPiston()
    {
    	gearSolenoid.set(Value.kOff);
    }
    //air is turned off on gear mechanism
    //gearSolenoid can now reset itself
    //APO 2/21/2017
    
    public void openGear()
    {
    	gearSolenoid.set(Value.kForward);
    }
    // Causes piston to open therefore the gear mechanism closes and the gear is held in place.
    // APO 1/21/2017
}

