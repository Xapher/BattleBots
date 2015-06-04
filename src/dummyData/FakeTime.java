package dummyData;

import interfaces.ITime;

public class FakeTime implements ITime
{
	public int value = 0;
	@Override
	public void start() 
	{
		System.out.println("Started");
	}

	@Override
	public int calculate() 
	{
		return value;
	}

}
