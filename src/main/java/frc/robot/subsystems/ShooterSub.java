package frc.robot.subsystems;
import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.CANSparkBase;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.DutyCycleEncoder;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.LimelightHelpers;
import frc.robot.Constants.DriveConstants;
import frc.robot.Constants.IntakeConstants;
import frc.robot.Constants.LimeLightConsants;
import frc.robot.Constants.ShooterConstants;
import frc.robot.Constants.shooterArmConstants;

public class ShooterSub extends SubsystemBase {
   private CANSparkMax upperShooterMotor = new CANSparkMax(ShooterConstants.kUpperShooterMotorID, MotorType.kBrushless);

    private CANSparkMax lowerShooterMotor = new CANSparkMax(ShooterConstants.kLowerShooterPort,MotorType.kBrushless);

    
    

    //shooter arm

   // private CANSparkMax shooterArmMotor = new CANSparkMax(shooterArmConstants.kShooterArmID ,MotorType.kBrushless);
   //private DutyCycleEncoder ShooterArmMotor = new DutyCycleEncoder();

    
    
    public void shooterSub(){
        

    }
    public void setShooterSpeed( double shooterSpeed){

            upperShooterMotor.set(-shooterSpeed);
            lowerShooterMotor.set(-shooterSpeed); // hard negative
        
        
    }

    // public void setShooterSetpoint(double shooterSetpoint){
    //     shooterSetpoint.setSetpoint(shooterSetpoint);
    // }
}
