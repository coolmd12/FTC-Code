/*
This code goes with TestBenchColor.java
This program will be able to sense 3 colors: red, green, and blue, and will display unknown when the
sensor doesn't seem to detect any of these three
 */

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.TestBenchColor;

@TeleOp
public class ColorSensorTest extends OpMode {
    TestBenchColor bench = new TestBenchColor();
    TestBenchColor.DetectedColor detectedColor;

    @Override
    public void init() {
        bench.init(hardwareMap);
    }

    @Override
    public void loop() {

        detectedColor = bench.getDetectedColor(telemetry);
        telemetry.addData("Color Detected",detectedColor);
    }
}
