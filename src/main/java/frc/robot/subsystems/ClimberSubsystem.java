// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

/** Add your docs here. */
public class ClimberSubsystem extends SubsystemBase {
    public ClimberSubsystem() {
        // initialize motors moving parts etc
    }

    public void ExtendArms() {
        // extends arms up to hook onto chain
        
        // Assuming one motor
        // Change code accordingly if more motors used for climber
        // Something like this?
        // https://www.andymark.com/products/climber-in-a-box
    }

    public void RetractArms() {
        // retracts arms down to pull robot onto chain
    }
}