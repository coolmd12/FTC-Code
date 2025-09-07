/*
This code goes with ImuPractice.java
These programs work to create a code that has a clean sensor class for the IMU, and also
helps us to get the robot's current heading.
 */

package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.IMU;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;

public class TestBenchIMU {
    private IMU imu;
    private DcMotor motor;

    public void init(HardwareMap hwMap) {
        imu = hwMap.get(IMU.class,"imu");
        motor = hwMap.get(DcMotor.class,"motor");

        RevHubOrientationOnRobot RevOrientation = new RevHubOrientationOnRobot(
                RevHubOrientationOnRobot.LogoFacingDirection.UP,
                RevHubOrientationOnRobot.UsbFacingDirection.FORWARD
        );

        imu.initialize(new IMU.Parameters(RevOrientation));

        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

    }

    public double getHeading(AngleUnit angleUnit) {
        return imu.getRobotYawPitchRollAngles().getYaw(angleUnit);
    }

    public void setMotor(double power) {
        motor.setPower(power);
    }

}
