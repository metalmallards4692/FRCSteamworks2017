
package org.usfirst.frc4692.Bastion.subsystems;
import org.usfirst.frc4692.Bastion.RobotMap;
import org.usfirst.frc4692.Bastion.commands.*;
import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem {
    private final CANTalon leftfront = RobotMap.drivetrainleftfront;
    private final CANTalon leftback = RobotMap.drivetrainleftback;
    private final CANTalon rightfront = RobotMap.drivetrainrightfront;
    private final CANTalon rightback = RobotMap.drivetrainrightback;
<<<<<<< HEAD
    private RobotDrive drive = RobotMap.drivetrainDrive;
    //RobotDrive drive = new RobotDrive(2,3,4,5);
    public void initDefaultCommand() {
    	setDefaultCommand(new DriveWithJoysticks());
    	drive = new RobotDrive(leftback,rightfront,leftfront,rightback);
    	//drive = new RobotDrive(leftfront,rightback,leftback,rightfront);
	}
	public void takeJoystickInputs(Joystick joystick1, Joystick joystick2) {
		drive.tankDrive(joystick1.getY(), joystick2.getY());
	}
	public void stop() {
		drive.tankDrive(0,0);
	}
	public void driveStraight(double d) {
		drive.tankDrive(-0.75,-0.75);	
=======
    //private final RobotDrive drive = RobotMap.drivetrainDrive;
    RobotDrive drive = new RobotDrive(2,3,4,5);
    public void initDefaultCommand() {
    	setDefaultCommand(new DriveWithJoysticks());
    	drive = new RobotDrive(leftfront,rightback,rightfront,leftback);
	}
	public void takeJoystickInputs(Joystick joystick1, Joystick joystick2) {
		drive.tankDrive(joystick1.getY(), joystick2.getY());	
	}
	public void driveStraight(double d) {
		drive.tankDrive(1.0,-1.0);
	}
	public void stop() {
		drive.tankDrive(0,0);
>>>>>>> origin/master
	}
}
