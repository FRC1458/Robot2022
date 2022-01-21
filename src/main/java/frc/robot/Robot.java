// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
//import edu.wpi.first.wpilibj.Ultrasonic;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  //define variables
  enum States {
    AUTONOMOUS,
    MANUAL,
    DETECT_BALL,
    MOVE_TO_BALL,
    PICK_UP_BALL,
    AIM,
    SHOOT,
  }

  States state;

  public Robot() {
    super(0.03);
    //create variables
  }

  @Override
  public void robotInit() {
    //set to defaults
    autonomousInit();

  }

  @Override
  public void teleopInit() {
    //set defaults for teleop
  }

  @Override
  public void teleopPeriodic() {
    switch(state) {
      case MANUAL:
        manualControl();
        break;

      case AUTONOMOUS:
        
        //autonomousPeriodic();
        state = State.DETECT_BALL;
        break;
      case DETECT_BALL:
        detectBall();
        break;
      case MOVE_TO_BALL:
        moveToBall();
        break;
      case PICK_UP_BALL:
        pickUpBall();
        break;
      case GO_TO_HUB:
        goToHub();
        break;
      case DROP_BALL:
        dropBall();
        break;
    }
  }

  public void manualControl() {
    
  }

  public void detectBall() {

    if (findBall()) {
      state = State.MOVE_TO_BALL;
    }
  }

  public void moveToBall() {
    if (reachedBall()) {
      state = State.PICK_UP_BALL;
    }
    else {
      state = State.DETECT_BALL;
    }
  }

  public void pickUpBall() {
    if (ballPickedUp()) {
      state = State.GO_TO_HUB;
    }
    else {
      state = State.DETECT_BALL;
    }
  }

  public void goToHub() {
    if (reachedHub()) {
      state = State.DROP_BALL;
    }
  }

  public void dropBall() {
    if (ballDropped()) {
      state = State.DETECT_BALL;
    }
  }
  public void findBall(){

  }
  public void reachedBall(){

  }
  public void ballPickedUp(){

  }
  public void reachedHub(){

  }
  public void ballDropped(){

  }
  
  @Override
  public void autonomousInit() {

  }

  @Override
  public void autonomousPeriodic() {
    
  }
}