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

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainFrontLeftSpeedController;
    public static SpeedController driveTrainBackLeftSpeedController;
    public static SpeedController driveTrainFrontRightSpeedController;
    public static SpeedController driveTrainBackRightSpeedController;
    public static RobotDrive driveTrainRobotDrive41;
    public static DoubleSolenoid dumpTruckDumpTruckPistonOne;
    public static DoubleSolenoid dumpTruckDumpTruckPistonTwo;
    public static SpeedController dumpTruckDumpTruckSpeedController;
    public static SpeedController dumpTruckDumpTruckCorkscrewMotor;
    public static DoubleSolenoid gearPistonGearSolenoid;
    public static Compressor pneumaticsCompressor;
    public static SpeedController climberClimber;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainFrontLeftSpeedController = new VictorSP(0);
        LiveWindow.addActuator("DriveTrain", "FrontLeftSpeedController", (VictorSP) driveTrainFrontLeftSpeedController);
        
        driveTrainBackLeftSpeedController = new VictorSP(1);
        LiveWindow.addActuator("DriveTrain", "BackLeftSpeedController", (VictorSP) driveTrainBackLeftSpeedController);
        
        driveTrainFrontRightSpeedController = new VictorSP(2);
        LiveWindow.addActuator("DriveTrain", "FrontRightSpeedController", (VictorSP) driveTrainFrontRightSpeedController);
        
        driveTrainBackRightSpeedController = new VictorSP(3);
        LiveWindow.addActuator("DriveTrain", "BackRightSpeedController", (VictorSP) driveTrainBackRightSpeedController);
        
        driveTrainRobotDrive41 = new RobotDrive(driveTrainFrontLeftSpeedController, driveTrainBackLeftSpeedController,
              driveTrainFrontRightSpeedController, driveTrainBackRightSpeedController);
        
        driveTrainRobotDrive41.setSafetyEnabled(true);
        driveTrainRobotDrive41.setExpiration(0.1);
        driveTrainRobotDrive41.setSensitivity(0.5);
        driveTrainRobotDrive41.setMaxOutput(1.0);

        dumpTruckDumpTruckPistonOne = new DoubleSolenoid(0, 2, 3);
        LiveWindow.addActuator("DumpTruck", "DumpTruckPistonOne", dumpTruckDumpTruckPistonOne);
        
        dumpTruckDumpTruckPistonTwo = new DoubleSolenoid(0, 4, 5);
        LiveWindow.addActuator("DumpTruck", "DumpTruckPistonTwo", dumpTruckDumpTruckPistonTwo);
        
        dumpTruckDumpTruckSpeedController = new VictorSP(6);
        LiveWindow.addActuator("DumpTruck", "DumpTruckSpeedController", (VictorSP) dumpTruckDumpTruckSpeedController);
        
        dumpTruckDumpTruckCorkscrewMotor = new VictorSP(5);
        LiveWindow.addActuator("DumpTruck", "DumpTruckCorkscrewMotor", (VictorSP) dumpTruckDumpTruckCorkscrewMotor);
        
        gearPistonGearSolenoid = new DoubleSolenoid(0, 0, 1);
        LiveWindow.addActuator("GearPiston", "GearSolenoid", gearPistonGearSolenoid);
        
        pneumaticsCompressor = new Compressor(0);
        
        
        climberClimber = new VictorSP(4);
        LiveWindow.addActuator("Climber", "Climber", (VictorSP) climberClimber);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
