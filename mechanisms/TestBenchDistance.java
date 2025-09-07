// This code goes with DistanceTest.java

/*
In this program, I created a code in which the telemetry will display the distance from a distance sensor
 */

package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

public class TestBenchDistance {
    private DistanceSensor distance;

    public void init(HardwareMap hwMap) {
        distance = hwMap.get(DistanceSensor.class, "sensor_distance"); // the "sensor_distance" should actually exactly match the name inside the configuration file you created
    }

    public double getDistance() {
        return distance.getDistance(DistanceUnit.CM);
    }
}
