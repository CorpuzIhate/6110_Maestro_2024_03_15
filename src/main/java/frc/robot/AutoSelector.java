package frc.robot;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.auto.MoveForwardSwerveAuto;

public class AutoSelector {
    private SendableChooser<Command> autoSelector = new SendableChooser<>();

    public AutoSelector(RobotContainer container) {

        /*
         * Add all the options
         */
        autoSelector.addOption("Move Foward Swerve", MoveForwardSwerve(container));

    }

    public SendableChooser<Command> getAutoChooser() {
        return autoSelector;
    }

    /*
     * Allow calling the autos as a method
     */
    private SequentialCommandGroup MoveForwardSwerve(RobotContainer container) {
        return new MoveForwardSwerveAuto(container);
}
}