package dummyData;

import interfaces.ISight;

public class FakeSight implements ISight
{
	public Object ob;
	public float value = 0;
	
	public FakeSight(Object ob, float value)
	{
		this.ob = ob;
		this.value = value;
	}
	
	@Override
	public Object scan() 
	{
		return ob;
	}

	@Override
	public float getRange() 
	{
		return value;
	}
}
