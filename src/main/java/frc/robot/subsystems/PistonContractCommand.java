/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class PistonContractCommand extends CommandBase {
  Pneumatics pneumatics;
  /**
   * Creates a new PistonContractCommand.
   */
  public PistonContractCommand(Pneumatics P) {
    addRequirements(P);
    pneumatics = P;
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    pneumatics.contractPiston();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    pneumatics.offPiston();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }

public Command withTimetout(int i) {
	return null;
}
}
