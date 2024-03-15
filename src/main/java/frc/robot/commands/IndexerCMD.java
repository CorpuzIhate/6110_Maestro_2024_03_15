package frc.robot.commands;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants.IndexerConstants;
import frc.robot.subsystems.IndexerSub;
import frc.robot.subsystems.IntakeOutakeSub;


public class IndexerCMD extends Command {
    private final IndexerSub indexerSub;
    private final double upperIndexerSpeed;
    private final double lowerIndexSpeed;




    public IndexerCMD(IndexerSub indexerSub, double upperIndexerSpeed, double lowerIndexSpeed ){
        this.indexerSub = indexerSub;
        this.upperIndexerSpeed = upperIndexerSpeed;
        this.lowerIndexSpeed = lowerIndexSpeed;

        addRequirements(indexerSub);
    }

    @Override
    public void initialize(){
        System.out.println("IntakeCMD started!");
    }

    @Override
    public void execute() {
        indexerSub.setIndexSpeed(lowerIndexSpeed , upperIndexerSpeed );
    }


    @Override
    public boolean isFinished(){
    return false;
    }
    @Override
    public void end(boolean interrupted) {
        indexerSub.setIndexSpeed(0 , 0); //defaults end to set motors to 0
        
    }
}

