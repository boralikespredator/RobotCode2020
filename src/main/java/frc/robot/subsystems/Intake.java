/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import static frc.robot.Constants.*;

public class Intake extends SubsystemBase {
  
  private VictorSP wheelMotor;
  private VictorSP deployMotor;

  public Intake() {
    wheelMotor = new VictorSP(WHEEL_INTAKE_MOTOR);
    deployMotor = new VictorSP(DEPLOY_INTAKE_MOTOR);
  }

  public void deploySpeed(double speed){
    deployMotor.set(speed);
  }

  public void wheelSpeed(double speed){
    wheelMotor.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
