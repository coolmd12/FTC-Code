package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.NormalizedColorSensor;
import com.qualcomm.robotcore.hardware.NormalizedRGBA;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class TestBenchColor {
    NormalizedColorSensor colorSensor;

    public enum DetectedColor {
        RED,
        BLUE,
        YELLOW,
        UNKNOWN
    }

    public void init(HardwareMap hwMap) {
        colorSensor = hwMap.get(NormalizedColorSensor.class,"sensor_color_distance"); //should put as exact name as the corresponding configuration file
        colorSensor.setGain(8);
    }

    public DetectedColor getDetectedColor(Telemetry telemetry) {
        NormalizedRGBA colors = colorSensor.getNormalizedColors(); //return 4 values

        float normRed, normGreen, normBlue;
        normRed = colors.red / colors.alpha;
        normGreen = colors.green / colors.alpha;
        normBlue = colors.blue / colors.alpha;

        telemetry.addData("red",normRed);
        telemetry.addData("green",normGreen);
        telemetry.addData("blue",normBlue);

        // TODO add if statements for specific colors added
        /*
        red, green, blue
        RED = >0.35, <0.3, <0.3
        YELLOW = >0.5, >0.9, <0.6
        BLUE = <0.2, <0.5, >0.5
         */

        if (normRed > 0.35 && normGreen < 0.3 && normBlue < 0.3 ) {
            return DetectedColor.RED;
        } else if (normRed > 0.5 && normGreen > 0.9 && normBlue < 0.6) {
            return DetectedColor.YELLOW;
        }
        else if (normRed < 0.2 && normGreen < 0.5 && normBlue > 0.5) {
            return DetectedColor.BLUE;
        }
        else {
            return DetectedColor.UNKNOWN;
        }

        return DetectedColor.UNKNOWN;

    }


}
