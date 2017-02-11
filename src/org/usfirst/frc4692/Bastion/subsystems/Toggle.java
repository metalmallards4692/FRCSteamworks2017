
package org.usfirst.frc4692.Bastion.subsystems;
import org.usfirst.frc4692.Bastion.RobotMap;
import org.usfirst.frc4692.Bastion.commands.*;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Toggle extends Subsystem {
    private final DoubleSolenoid Hood = RobotMap.toggleHood;  
    public void initDefaultCommand() {
	setDefaultCommand(new Flipdown());
}
	public void Extend(){
		Hood.set(DoubleSolenoid.Value.kForward);
	}
    public void Retract(){
		Hood.set(DoubleSolenoid.Value.kReverse);
    }
	public void Stop(){
		Hood.set(DoubleSolenoid.Value.kOff);
	}
}
