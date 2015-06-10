package code;

import lejos.nxt.MotorPort;
import lejos.nxt.NXTMotor;
import interfaces.IMotor;

public class Motor implements IMotor
{
	NXTMotor m1;
	NXTMotor m2;
	NXTMotor m3;
	
	public Motor()
	{
		this.m1 = new NXTMotor(MotorPort.A);
		this.m2 = new NXTMotor(MotorPort.B);
		this.m3 = new NXTMotor(MotorPort.C);
		hammerSwing();
	}
	
	@Override
	public void forward() 
	{
		setPower(90);
		m1.backward();
		m2.backward();
	}

	@Override
	public void backwards() 
	{
		setPower(90);
		m1.forward();
		m2.forward();
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
		setPower(720);
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
