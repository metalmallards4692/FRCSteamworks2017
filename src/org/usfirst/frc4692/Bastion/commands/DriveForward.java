
package org.usfirst.frc4692.Bastion.commands;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4692.Bastion.Robot;

public class driveforward extends Command {
	Timer drive = new Timer();
    public driveforward() {
        requires(Robot.drivetrain);
    }
    protected void initialize() {
    	drive.start();
    }
    protected void execute() {
    	Robot.drivetrain.driveForward();
    }
    protected boolean isFinished() {
        return (drive.get()>5);
    }
    protected void end() {
    	Robot.drivetrain.stop();
    }
    protected void interrupted() {
    }
}
