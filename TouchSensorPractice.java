// This code goes with TestBench.java

/*
In these programs, I learnt how to Program REV touch sensors, and I created a code to read its input
 */

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.TestBench;

@TeleOp
public class TouchSensorPractice extends OpMode {
    TestBench bench = new TestBench();

    @Override
    public void init() {
        bench.init(hardwareMap);
    }

    @Override
    public void loop() {
        String touchSensorState = "not pressed!";
        if (bench.isTouchSensorPressed()) {
            touchSensorState = "pressed!";
        }
        telemetry.addData("Touch Sensor State",bench.isTouchSensorPressed());
    }

    /*
    1. create a new "getter" method in your testBench class called "isTouchSensorReleased" return true
    if the touch sensor is NOT being pressed.
    2. in your telemetry OpMode, have telemetry state "pressed!" and "not pressed!" instead of true/false
     */
}
