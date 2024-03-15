package frc.robot.subsystems;
import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.CANSparkBase;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.motorcontrol.Victor;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.LimelightHelpers;
import frc.robot.Constants.DriveConstants;
import frc.robot.Constants.IndexerConstants;
import frc.robot.Constants.IntakeConstants;
import frc.robot.Constants.LimeLightConsants;
import frc.robot.Constants.ShooterConstants;

public class IndexerSub extends SubsystemBase {
   private Victor lowerIndexMotor = new Victor(IndexerConstants.kLowerIndexerPWMPort);
   private CANSparkMax upperIndexMotor = new CANSparkMax(IndexerConstants.kUpperIndexerID,MotorType.kBrushless );


    public void setIndexSpeed(double lowerIndexerSpeed, double upperIndexerSpeed){
        lowerIndexMotor.set(-lowerIndexerSpeed);
        upperIndexMotor.set(-upperIndexerSpeed);
    }
}
