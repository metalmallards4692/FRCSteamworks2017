
package org.usfirst.frc4692.Bastion;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import org.usfirst.frc4692.Bastion.subsystems.*;


public class Robot extends IterativeRobot {

    Command autonomousCommand;

    public static OI oi;
    public static drivetrain drivetrain;
    public static Winch winch;
    public static Ballstuff ballstuff;
    public static Toggle toggle;
    public static Gear gear;
    public static shift shift;
    

    public void robotInit() {
    RobotMap.init();
    	shift = new shift();
        drivetrain = new drivetrain();
        winch = new Winch();
        ballstuff = new Ballstuff();
        toggle = new Toggle();
        gear = new Gear();
        oi = new OI();
        
    }

    public void disabledInit(){

    }

    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    public void autonomousInit() {
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
    }

    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {

        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }

    public void testPeriodic() {
        LiveWindow.run();
    }
}
