// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4692.Bastion.subsystems;

import org.usfirst.frc4692.Bastion.RobotMap;
import org.usfirst.frc4692.Bastion.commands.*;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class drivetrain extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController right = RobotMap.drivetrainright;
    private final SpeedController left = RobotMap.drivetrainleft;
    private final RobotDrive drive = RobotMap.drivetrainDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private double autoSpeed = 0.5;//autoSpeed is set at .5, meaning the motors will run at 50%
    public double runTimeForward = 1.0;
    public double runTimeBackward = 1.0; //This code is for autonomous, and the values are in seconds. values can be changed to whatever we need.
    //any code that says public (as in public class or public double) can be accessed outside of their location (as in the drivewithjoysticks can access runtimebackward because it is public)
    //Private means the opposite
    
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new DriveWithJoysticks());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    public void driveWithJoysticks(double leftJoystick, double rightJoystick)
    {
    	drive.tankDrive(leftJoystick, rightJoystick);
    }
    public void driveForward()
    {
    	drive.tankDrive(autoSpeed, autoSpeed);//autoSpeed is a command for autonomous that runs the motors
    }
    public void driveBackward()
    {
    	drive.tankDrive(-autoSpeed, -autoSpeed);//negative values make the motors run in reverse
    }
    public void stop()
    {
    	drive.tankDrive(0, 0);
    }

}
    