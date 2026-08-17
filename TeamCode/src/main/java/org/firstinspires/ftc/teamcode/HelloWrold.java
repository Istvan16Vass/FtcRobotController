package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class HelloWrold extends OpMode {
    @Override
    public void init() {
        telemetry.addData("hello","Wrold");
    }
    @Override
    public void loop() {

    }
}

