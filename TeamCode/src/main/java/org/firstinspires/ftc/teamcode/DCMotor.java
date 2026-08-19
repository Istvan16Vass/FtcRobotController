package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.mechanisms.HowToUseDCMotor;

public class DCMotor extends OpMode {
    HowToUseDCMotor bench = new HowToUseDCMotor();

    @Override
    public void init() {
        bench.init(hardwareMap);
    }

    @Override
    public void loop() {
        bench.SetMotorSpeed(0.5);
        telemetry.addData("motor revs",bench.getMotorRevs());
    }
}
