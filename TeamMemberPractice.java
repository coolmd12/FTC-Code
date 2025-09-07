// This code goes hand-and-hand with files RobotLocationPractice.java and UseRobotLocationOpMode.java

/*
In these 3 codes, I learned about class members and methods, how to use parameters and return
types to make code flexible, and what a constructor does. I also created my very first own custom
class, and then used it in an OpMode to control a robot mechanism.
 */

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class TeamMemberPractice extends OpMode {
    boolean initDone;

    @Override
    public void init() {
        telemetry.addData("Init",initDone);
        initDone = true;
    }

    double squareInputWithSign(double input) {
        double output = input * input;

        if (input < 0) {
            output *= -1;
        }
        return output;
    }

    @Override
    public void loop() {
        telemetry.addData("Init",initDone);

        double yAxis = gamepad1.left_stick_y;

        telemetry.addData("Left Stick Normal",yAxis);

        yAxis = squareInputWithSign(yAxis);
        telemetry.addData("Left Stick Modified",yAxis);
    }
}


/*
 @Override
    public void init() {
        double x;

        if (x > 0.5) {
            double y = 10;
        }

        double sum = x + y; //this line would not work because the y would only get created if the x is greater than 0.5
    }
 */
