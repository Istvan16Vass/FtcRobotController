package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.DCMotor;

public class TestBench {
    // Touch Sensor
    private DigitalChannel touchSensor;
    private DcMotor motor;
    private double ticksPerRev;

    public void init(HardwareMap hwMap){
        // Touch Sensor

    touchSensor = hwMap.get(DigitalChannel.class,"tuch_sensor");
    touchSensor.setMode(DigitalChannel.Mode.INPUT);

        // DC Motor

        motor = hwMap.get(DcMotor.class, "motor");
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        ticksPerRev = motor.getMotorType().getTicksPerRev();
        motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    //Touch Sensor

    public boolean getisTouchSensorReleased(){
        return !touchSensor.getState();
    }

    // DC Motor

    public void SetMotorSpeed(double speed) {
        if(touchSensor.getState())
        {motor.setPower(speed);}
    }
    public double getMotorRevs() {
        return motor.getCurrentPosition() / ticksPerRev;
    }
    public void setMotorZeroBehaviour(DcMotor.ZeroPowerBehavior zeroBehaviur) {
        motor.setZeroPowerBehavior(zeroBehaviur);
    }
}
