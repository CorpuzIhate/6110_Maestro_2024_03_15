package frc.robot.commands;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants.IntakeConstants;
import frc.robot.subsystems.IntakeOutakeSub;
import frc.robot.subsystems.ShooterSub;

public class MoveShooterArm extends Command  {
    // private final ShooterSub shooterSub;
    // private final PIDController shooterArmPidController;
    private double setpoint;




    
    @Override
    public void initialize(){
        System.out.println("ShooterArmCMD started!");
        // shooterArmPidController.reset();
    }


    @Override
    public void execute() {
    //    intakeOutakeSub.setIntakeArmMotorSetpoint(intakeArmSetpoint); 
        //input a RAW setpoint into IntakeArmSetpoint

    }

    @Override
    public void end(boolean interrupted) {
        System.out.println("MoveIntakeArmCMD ended!");
        //intakeOutakeSub.setIntakeArmMotorSetpoint(intakeArmSetpoint); 
       // intakeOutakeSub.setIntakeArmMotorSpeed0();
       // // intakeOutakeSub.setIntakeArmMotor(0); //defaults end to set motors to 0
    }
    @Override
    public boolean isFinished(){
        return false;
    }
}
