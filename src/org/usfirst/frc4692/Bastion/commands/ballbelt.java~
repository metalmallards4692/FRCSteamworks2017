
package org.usfirst.frc4692.Bastion.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4692.Bastion.Robot;

public class ballbelt extends Command {
    public ballbelt() {
    	requires(Robot.ballstuff);
    }
    protected void initialize() {
    	Robot.ballstuff.beltup();
    }
    protected void execute() {
    	Robot.ballstuff.beltup();
    }
    protected boolean isFinished() {
        return false;
    }
    protected void end() {
    	Robot.ballstuff.beltstop();
    }
    protected void interrupted() {
    }
}
