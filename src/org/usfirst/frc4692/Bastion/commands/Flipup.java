
package org.usfirst.frc4692.Bastion.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4692.Bastion.Robot;

public class Flipup extends Command {

    public Flipup() {
        requires(Robot.toggle);
    }
    protected void initialize() {
    	Robot.toggle.Extend();
    }
    protected void execute() {
    	Robot.toggle.Extend();	
    }
    protected boolean isFinished() {
        return false;
    }
    protected void end() {
    	Robot.toggle.Stop();
    }
    protected void interrupted() {
    }
}
