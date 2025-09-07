// This code goes with DcMotorPractice.java and TestBench.java

/*
In these programs, I learnt how to run motors with and without encoders, how to read encoder
values for precise movement, and how to control the speed and direction of motors. I also learnt how to
program the motors to respond to both a gamepad and sensor.
 */

package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class TestBench1 {
    private DcMotor motor; // you could name this something more clear, like linearSlideMotorLeft
    private double ticksPerRev; //ticksPerRevolution

    public void init(HardwareMap hwMap) {
        //touch sensor code

        //DC motor
        motor = hwMap.get(DcMotor.class,"motor"); // the "motor" should actually exactly match the name inside the configuration file you created
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        ticksPerRev = motor.getMotorType().getTicksPerRev();
    }

    public void setMotorSpeed(double speed) {
        // accepts values from -1.0 through 1.0
        motor.setPower(speed);
    }

    public double getMotorRevs() {
        return motor.getCurrentPosition() / ticksPerRev; // normalizing ticks to revolutions
    }

}
