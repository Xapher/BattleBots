package code;

import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;
import interfaces.ILight;

public class Light implements ILight
{
	LightSensor light = new LightSensor(SensorPort.S1);
	
	@Override
	public int readValue() 
	{
		return light.readValue();
	}
	
}
