// This code first goes with TouchSensorPractice.java, and later goes with TestBench1.java and DcMotorPractice.java

/*
In these programs, I learnt how to Program REV touch sensors, and I created a code to read its input
In later tutorials, I also learnt how to run motors with and without encoders, how to read encoder
values for precise movement, and how to control the speed and direction of motors. I also learnt how to
program the motors to respond to both a gamepad and sensor.
 */

package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class TestBench {
    private DigitalChannel touchSensor; // You can name it more descriptively, like touchSensorIntake
    private DcMotor motor;
    private double ticksPerRev;

    public void init(HardwareMap hwMap) {
        // Touch Sensor
        touchSensor = hwMap.get(DigitalChannel.class, "touch_sensor"); //the "touch_sensor" should actually exactly match the name inside the configuration file you created
        touchSensor.setMode(DigitalChannel.Mode.INPUT);
        // DC Motor
        motor = hwMap.get(DcMotor.class,"motor"); // //the "motor" should actually exactly match the name inside the configuration file you created
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        ticksPerRev = motor.getMotorType().getTicksPerRev();
        motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motor.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    // ----- Touch Sensor -----
    public boolean isTouchSensorPressed() {
        return !touchSensor.getState(); // the !touchSensor makes the Touch Sensor State be false when not pressed and true when pressed. If you don't add the not, it will be the opposite
    }
    public boolean isTouchSensorReleased() {
        return touchSensor.getState();
    }

    // ----- DC Motor -----
    public void setMotorSpeed(double speed) {
        // accepts values from -1.0 through 1.0
        motor.setPower(speed);
    }
    public double getMotorRevs() {
        return motor.getCurrentPosition() / ticksPerRev; // normalizing ticks to revolutions
    }
    public void setMotorZeroBehaviour(DcMotor.ZeroPowerBehavior zeroBehaviour) {
        motor.setZeroPowerBehavior(zeroBehaviour);
    }

}
