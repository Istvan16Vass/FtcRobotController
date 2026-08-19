package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.mechanisms.TestBench;
@TeleOp
public class TouchSensorPractice extends OpMode {

    TestBench bench = new TestBench();
    @Override
    public void init() {
        bench.init(hardwareMap);
    }

    @Override
    public void loop() {
        String touchsensorstate = "not pressed";
        if(gamepad1.a) {
            bench.setMotorZeroBehaviour(DcMotor.ZeroPowerBehavior.BRAKE);
        }
        else if(gamepad1.b) {
            bench.setMotorZeroBehaviour(DcMotor.ZeroPowerBehavior.FLOAT);
        }
        if(bench.getisTouchSensorReleased())  {
            touchsensorstate = "pressed";

            bench.SetMotorSpeed(0.5);
        }
        else
            bench.SetMotorSpeed(0.0);
        telemetry.addData("motor revs",bench.getMotorRevs());
        telemetry.addData("Is Touch Sensor Released",touchsensorstate);

    }
}
