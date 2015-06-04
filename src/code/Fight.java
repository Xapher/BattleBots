package code;

import interfaces.ILight;
import interfaces.IMotor;
import interfaces.ISight;
import interfaces.ITime;

public class Fight 
{
	IMotor motor;
	ILight light;
	ISight sight;
	ITime time;
	
	public Fight(IMotor motor, ILight light, ISight sight, ITime time)
	{
		this.motor = motor;
		this.light = light;
		this.sight = sight;
		this.time = time;
	}
	
	public void findOpponent() throws InterruptedException
	{
		time.start();
		boolean found = true;
		while(sight.scan() == null)
		{
			motor.spin();
			if(time.calculate() > 60)
			{
				motor.stop();
				found = false;
				break;
			}
		}
		if(found) goToOpponent();
	}
	
	public void goToOpponent() throws InterruptedException
	{
		time.start();
		boolean hitLine = true;
		while(light.readValue() <= 40)
		{
			motor.forward();
			if(time.calculate() > 60)
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
			findOpponent();
		}
	}
}
