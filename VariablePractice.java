// In this program, I used variables and figured out how to print them in the telemetry

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class VariablePractice extends OpMode {
    @Override
    public  void init() {
        int teamNumber = 19862;
        double motorSpeed = 0.75;
        boolean clawClosed = true;
        String name = "Dhyanvi Mehta"; //Could be changed to "Mecha Mantises"
        int motorAngle = 90;

        telemetry.addData("Team Number",teamNumber);
        telemetry.addData("motor speed",motorSpeed);
        telemetry.addData("claw closed",clawClosed);
        telemetry.addData("Name",name);
        telemetry.addData("Motor Angle",motorAngle);
    }

    @Override
    public void loop() {
        /* Challenges:
        1. Change the String variable "name" to your team name.
        2. Create an integer called "motorAngle" and store an angle between 0-180. Display this in your init
         */
    }
}

/* Variable Examples:
package org.firstinspires.ftc.teamcode;

public class VariablesExamples {
    //data types
    int robotHeight;
    double motorSpeed;
    boolean clawClosed;
    robotHeight = 10;
    motorSpeed = 0.5;
    clawClosed = true;

}
 */
