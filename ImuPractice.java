/*
This code goes with TestBenchImu.java
These programs work to create a code that has a clean sensor class for the IMU, and also
helps us to get the robot's current heading.
 */

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.teamcode.mechanisms.TestBenchIMU;

@TeleOp
public class ImuPractice extends OpMode {
    TestBenchIMU bench = new TestBenchIMU();
    double heading;

    @Override
    public void init() {
        bench.init(hardwareMap);
    }

    @Override
    public void loop() {
        heading = bench.getHeading(AngleUnit.DEGREES);
        telemetry.addData("Heading",bench.getHeading(AngleUnit.RADIANS));

        if (heading < 0.5 && heading > -0.5) {
            bench.setMotor(0.0);
        }
        else if (heading > 0.5) {
            bench.setMotor(0.5);
        }
        else {
            bench.setMotor(-0.5);
        }


    }
}

/*
1. return the heading in radians
2. When your heading is <0.5 and greater than -0.5, stop a motor. If it's less than -0.5, make your
motor positive, and if it's greater than 0.5, make your motor negative
 */