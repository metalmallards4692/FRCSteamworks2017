
package org.usfirst.frc4692.Bastion.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4692.Bastion.Robot;

public class Flipdown extends Command {
    public Flipdown() {
        requires(Robot.toggle);
    }
    protected void initialize() {
    	Robot.toggle.Retract();
    }
    protected void execute() {
    	Robot.toggle.Retract();	
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
