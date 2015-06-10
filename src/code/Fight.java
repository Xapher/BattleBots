package code;

import interfaces.ILight;
import interfaces.IMotor;
import interfaces.ISight;
import interfaces.ITime;

public class Fight 
{
	IMotor motor;
	ILight light;
	ITime time;
	
	public Fight(IMotor motor, ILight light, ITime time)
	{
		this.motor = motor;
		this.light = light;
		this.time = time;
	}
	
	public void goToOpponent() throws InterruptedException
	{
		System.out.println("moving");
		time.start();
		boolean hitLine = true;
		while(light.readValue() <= 40)
		{
			motor.forward();
			if(time.calculate() > 120)
			{
				motor.stop();
				hitLine = false;
				break;
			}
		}
		if(hitLine)
		{
			motor.stop();
			motor.backwards();
			Thread.sleep(1500);
			motor.spin();
			Thread.sleep(1000);
			goToOpponent();
		}
	}
}
