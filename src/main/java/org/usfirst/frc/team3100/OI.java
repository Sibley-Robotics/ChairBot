package org.usfirst.frc.team3100;

import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team3100.XBoxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team3100.commands.*;
import edu.wpi.first.wpilibj.interfaces.Gyro;
import java.awt.*;

import static org.usfirst.frc.team3100.RobotMap.controller;
import static org.usfirst.frc.team3100.RobotMap.controls;

/**
 * Created by nicco on 2/15/17.
 */


    public class OI {

        public double getDriveMoveSpeed() {
            return controls.getLeftStickY();
        }
        public double getRotateSpeed() {return controls.getRightStickX();
        }
        public double getModifier() {
            return controls.getRightTrigger();
        }
        public OI() {

        }





    }
