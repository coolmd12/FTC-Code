/*
This code goes with TestBenchServo.java
These programs work together to program Servos.
 */

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.TestBenchServo;

@TeleOp
public class ServoExamples extends OpMode {
    TestBenchServo bench = new TestBenchServo();
    double leftTrigger, rightTrigger;

    @Override
    public void init() {
        bench.init(hardwareMap);
        leftTrigger = 0.0;
        rightTrigger = 0.0;
    }

    @Override
    public void loop() {
        leftTrigger = gamepad1.left_trigger;
        rightTrigger = gamepad1.right_trigger;

        bench.setServoRot(rightTrigger);
        bench.setServoPos(leftTrigger);
    }
}


/*
1. set your CR (cross rotational servo) to reverse its direction.
2. set your op mode so when you pull the left gamepad trigger, it sets the position of the positional servo
and when you pull the right gamepad trigger, 0 is off and 1 is fully on
 */

/* THIS WAS A PREVIOUS LOOP PROGRAM!
@Override
    public void loop() {
        if (gamepad1.a) {
            bench.setServoPos(0);
        }
        else {
            bench.setServoPos(1.0);
        }

        if (gamepad1.b) {
            bench.setServoRot(1.0);
        }
        else {
            bench.setServoRot(0);
        }
    }
 */