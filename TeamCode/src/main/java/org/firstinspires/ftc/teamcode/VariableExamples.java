package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class VariableExamples extends OpMode {
    @Override
    public void init() {
        int teamnumber=23014;
        double motorSpeed=0.75;
        boolean ClawClosed=true;
        telemetry.addData("Team Number",teamnumber);
        telemetry.addData("motor speed",motorSpeed);
        telemetry.addData("Clav State",ClawClosed);
    }


    @Override
    public void loop() {

    }
}
