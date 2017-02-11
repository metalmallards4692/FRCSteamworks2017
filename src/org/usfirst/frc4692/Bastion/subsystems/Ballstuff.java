
package org.usfirst.frc4692.Bastion.subsystems;
import org.usfirst.frc4692.Bastion.RobotMap;
import org.usfirst.frc4692.Bastion.commands.*;
import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Ballstuff extends Subsystem {
    private final CANTalon spitpick = RobotMap.ballstuffSpitpick;
    private final CANTalon agitator = RobotMap.ballstuffAgitator;
    public void initDefaultCommand() {
    	setDefaultCommand(new beltstop());
    }
    	public void beltup() {
    		spitpick.set(1.0);
    		agitator.set(1.0);
    }
    	public void beltstop() {
    		spitpick.set(0);
    		agitator.set(0);
    }
}
