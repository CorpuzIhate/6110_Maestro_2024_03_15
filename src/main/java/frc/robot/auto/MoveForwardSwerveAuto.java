package frc.robot.auto;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.RobotContainer;
import frc.robot.Constants.IntakeConstants;
import frc.robot.auto.auto_commands.InitalizeShooterCMD;
import frc.robot.auto.auto_commands.ShootFor3SecondsCMD;
import frc.robot.auto.auto_commands.SwerveDriveAutoCMD;
import frc.robot.commands.MoveIntakeArmCMD;
import frc.robot.subsystems.ShooterSub;
import frc.robot.subsystems.SwerveSub;

public class MoveForwardSwerveAuto extends SequentialCommandGroup {
    
public MoveForwardSwerveAuto(RobotContainer robot){ 
    addCommands( new InitalizeShooterCMD(robot.getShooterSub(), true, 3));
    addCommands(new ShootFor3SecondsCMD(robot.getShooterSub(), true, 3, robot.getIndexerSub()));
    // addCommands(new MoveIntakeArmCMD(robot.getIntakeOutakeSub(), IntakeConstants.kIntakeArmUpPosSetpoint));

    addCommands(new SwerveDriveAutoCMD(robot.getSwerveSub(), 0.3,0.6, 0, 0));

}

}
