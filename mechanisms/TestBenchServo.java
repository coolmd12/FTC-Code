/*
This code goes with ServoExamples.java
These programs work together to program Servos.
 */

package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class TestBenchServo {
    private Servo servoPos;
    private CRServo servoRot; //could be more descriptive names


    public void init(HardwareMap hwMap) {
        servoPos = hwMap.get(Servo.class,"servo_pos"); //should put as exact name as the corresponding configuration file
        servoRot = hwMap.get(CRServo.class,"servo_rot"); //should put as exact name as the corresponding configuration file
        servoPos.scaleRange(0.5,1.0); //set range from midpoint to 180 degrees
        servoPos.setDirection(Servo.Direction.REVERSE);
        servoRot.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    public void setServoPos(double angle) {
        servoPos.setPosition(angle);
    }

    public void setServoRot(double power) {
        servoRot.setPower(power);
    }
}
