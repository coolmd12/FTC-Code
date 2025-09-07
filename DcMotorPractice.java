// This code goes with TestBench1.java and TestBench.java

/*
In these programs, I learnt how to run motors with and without encoders, how to read encoder
values for precise movement, and how to control the speed and direction of motors. I also learnt how to
program the motors to respond to both a gamepad and sensor.
 */

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.mechanisms.TestBench;
import org.firstinspires.ftc.teamcode.mechanisms.TestBench1;

@TeleOp
public class DcMotorPractice extends OpMode {
    TestBench bench = new TestBench();

    @Override
    public void init() {
        bench.init(hardwareMap);
    }

    @Override
    public void loop() {
        double motorSpeed = gamepad1.left_stick_y;

        bench.setMotorSpeed(motorSpeed);

        if (gamepad1.a) {
            bench.setMotorZeroBehaviour(DcMotor.ZeroPowerBehavior.BRAKE);
        }
        else if (gamepad1.b) {
            bench.setMotorZeroBehaviour(DcMotor.ZeroPowerBehavior.FLOAT);
        }

        telemetry.addData("Motor Revs",bench.getMotorRevs());
    }
}

/*
1. add a method on your testbench that allows you to change the brake behavior FROM
your opmode. on A pressed, set brake, on B pressed set float.

 */



/*
@Override
    public void loop() {
        double motorSpeed = gamepad1.left_stick_y;
        if (bench.isTouchSensorPressed()) {
            bench.setMotorSpeed(0.5);
        }
        else {
            bench.setMotorSpeed(0.0); //stops the motor
        }
        telemetry.addData("Motor Revs",bench.getMotorRevs());
    }
*/