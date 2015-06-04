package dummyData;

import interfaces.ILight;

public class FakeLight implements ILight
{
	public int value = 0;
	@Override
	public int readValue() 
	{
		return value;
	}
}
