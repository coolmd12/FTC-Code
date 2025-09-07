/*
This program-an underutilized feature-will let our driver know with an alerting vibration for when it's time for the endgame,
without having to look at the timer, enabling them to stay focused on the game for the final push
 */

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class RumbleTest extends OpMode {
    double endGameStart;
    boolean isEndGame;

    @Override
    public void init() {

    }

    @Override
    public void start() {
        endGameStart = getRuntime() + 90;
    }

    @Override
    public void loop() {
        // end game check
        if (endGameStart >= getRuntime() && !isEndGame) {
            gamepad1.rumbleBlips(3);
            isEndGame = true;
        }

    }
}

/* An earlier basic code of the rumble feature
public class RumbleTest extends OpMode {
    boolean wasA, isA;

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        isA = gamepad1.a;
        if (isA && !wasA) {
            gamepad1.rumble(1.0, 0, 100);
        }
        wasA = isA;
    }
}
 */