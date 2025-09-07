/*
In this program, I made code that can control the data flow using if, else, and else if
statements, and created more complex conditions using logical operators.
 */

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class IfPractice extends OpMode {

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        double motorSpeed = gamepad1.left_stick_y;

        if (!gamepad1.a) {
            motorSpeed *= 0.5; // the symbols motorSpeed*=0.5 means motorSpeed = motorSpeed * 0.5
        }

        telemetry.addData("Left Stick Value",motorSpeed);
}

}

/*
1. make a turbo button. If the a button is NOT pressed, multiply the motor speed by 0.5, otherwise
use the standard speed
 */

/*

AND - && if (leftY < 0.5 && leftY > 0) {
OR  || if (leftY < 0 || rightY < 0) {
NOT ! if (!clawClosed) {

 */



/*
@Override
    public void loop() {
        boolean aButton = gamepad1.a; //press TRUE, depress FALSE
// true or false
        if (aButton) {
            telemetry.addData("A Button", "Pressed!");
        }
        else{ //otherwise
            telemetry.addData("A Button","NOT Pressed");
        }
        telemetry.addData("A Button State", aButton);
}

}
*/



/*
@Override
    public void loop() {
        double leftY = gamepad1.left_stick_y;

        if (leftY < 0) {
            telemetry.addData("Left Stick","is Negative");
        }
        else if (leftY > 0.5){
            telemetry.addData("Left Stick","Greater than 50%");
        }
        else if (leftY > 0){
            telemetry.addData("Left Stick","Is greater than 0");
        }
        else {
            telemetry.addData("Left Stick","is Zero");
        }
        telemetry.addData("Left Stick Value",leftY);
}

}
 */

/*
 @Override
    public void loop() {
        double leftY = gamepad1.left_stick_y;

        if (leftY < 0.1 && leftY > -0.1) {
            telemetry.addData("Left Stick","In Dead Zone"); //dead zone refers to a portion of the FTC controller's joystick that a game or program will ignore, not taking any input despite slight movement
        }

        telemetry.addData("Left Stick Value",leftY);
}

}
 */
