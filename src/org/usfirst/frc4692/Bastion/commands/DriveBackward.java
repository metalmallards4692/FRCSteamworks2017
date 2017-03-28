
package org.usfirst.frc4692.Bastion.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4692.Bastion.Robot;

public class DriveBackward extends Command {
    public DriveBackward() {
        requires(Robot.drivetrain);
    	//double incrimentRunTime = Robot.drivetrain.runTimeBackward;
    	//setTimeout(incrimentRunTime);
    }
    protected void initialize() {
    	//Robot.drivetrain.driveBackward();
    }
    protected void execute() {
    }
    protected boolean isFinished() {
        return isTimedOut();
    }
    protected void end() {
    	Robot.drivetrain.stop();
    }
    protected void interrupted() {
    	end();
    }
}
