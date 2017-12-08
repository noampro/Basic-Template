package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.modernrobotics.ModernRoboticsI2cColorSensor;
import com.qualcomm.hardware.modernrobotics.ModernRoboticsI2cColorSensor.Command;
import com.qualcomm.hardware.modernrobotics.ModernRoboticsI2cColorSensor.Register;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Calibrate a Modern Robotics I2C Color Sensor
 *
 * Written by AJ Foster in June 2017. This code was created for version 3.1 of the FTC App, and will
 * not work with versions 1.x or 2.x. Mileage may vary with versions after 3.1.
 *
 * This code allows a user -- with the help of a gamepad -- calibrate a Modern Robotics I2C sensor
 * sensor for both black and white states. Instructions for completing the calibration are included
 * in the driver's station telemetry.
 *
 * Although Modern Robotics recommends the calibration steps written in the instructions, this may
 * not be best for all uses. A team could choose, for example, to calibrate black as a slightly
 * illuminated dark grey floor tile and white as slightly illuminated white gaffer's tape. After
 * every calibration, it is a good idea to check the thresholds used in other OpModes to see if
 * they are still correct.
 *
 * Use this code at your own risk. You should always (1) use proper safety attire, (2) test your
 * code before using it in a situation that could harm someone, and (3) make sure you understand
 * what a piece of code (including this one) does before running it.
 */

@TeleOp(name = "Calibrate MR Color", group = "Utilities")
@Disabled
public class CalibrateColorSensor extends OpMode {

    // Color Sensor to calibrate. Require that it is a Modern Robotics sensor.
    private ModernRoboticsI2cColorSensor sensor;

    // Track whether a calibration was recently requested.


    /**
     * Initialize sensor sensor hardware.
     */

    public int command;

    public int init(int a) {
        // Change the value "sensor" to the name of your sensor sensor.
        sensor = hardwareMap.get(ModernRoboticsI2cColorSensor.class, "sensor");
    }

    /**
     * Respond to gamepad input to perform calibrations.
     *
     * As explained in the prompt, X will begin a black-level calibration, and Y will begin a
     * white-level calibration. We prevent calibrations from being triggered within one second
     * of one another using a timer.
     */
    @Override
    public void loop() {
    int mycolor = 0;
    int otherColor = 1;
    int current = sensor.getColor();
     if (otherColor == current) {
         // אם הגענו לפה אז החיישן שלנו מסתכל עכשיו על הצבע של היריב
     } else {
         // אחרת, מסתכלים כנראה על הצבע שלנו (או צבעים אחרים כי לא הגדרנו)
     }
    }
}

