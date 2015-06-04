package code;

import lejos.nxt.NXTMotor;
import interfaces.IMotor;

public class Motor implements IMotor
{
	NXTMotor m1;
	NXTMotor m2;
	NXTMotor m3;
	
	public Motor(IMotor m1, IMotor m2, IMotor m3)
	{
		this.m1 = (NXTMotor) m1;
		this.m2 = (NXTMotor) m2;
		this.m3 = (NXTMotor) m3;
	}
	
	@Override
	public void forward() 
	{
		setPower(90);
		m1.forward();
		m2.forward();
	}

	@Override
	public void backwards() 
	{
		setPower(90);
		m1.backward();
		m2.backward();
	}

	@Override
	public void spin() 
	{
		setPower(40);
		m1.forward();
		m2.backward();
	}

	@Override
	public void stop() 
	{
		m1.stop();
		m2.stop();
	}

	@Override
	public void hammerSwing()
	{
		setPower(100);
		m3.forward();
	}
	
	@Override
	public void setPower(int power) 
	{
		m1.setPower(power);
		m2.setPower(power);
		m3.setPower(power);
	}
	
	
}
