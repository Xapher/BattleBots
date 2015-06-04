package dummyData;

import interfaces.IMotor;

public class FakeMotor implements IMotor
{
//	IMotor m1;
//	IMotor m2;
//	IMotor m3;
//	
//	public FakeMotor(IMotor m1, IMotor m2, IMotor m3)
//	{
//		this.m1 = m1;
//		this.m2 = m2;
//		this.m3 = m3;
//	}
	
	@Override
	public void forward()
	{
		System.out.println("Going forward");
	}

	@Override
	public void backwards() 
	{
		System.out.println("Going backwards");
	}

	@Override
	public void spin() 
	{
		System.out.println("Spinning");
	}

	@Override
	public void stop() 
	{
		System.out.println("Stopping");
	}

	@Override
	public void hammerSwing() 
	{
		System.out.println("Swinging Hammer!!");
	}

	@Override
	public void setPower(int power) 
	{
		System.out.println("power is set to " + power);
	}
}
