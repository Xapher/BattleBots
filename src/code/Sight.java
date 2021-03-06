package code;

import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.objectdetection.Feature;
import lejos.robotics.objectdetection.FeatureDetector;
import lejos.robotics.objectdetection.RangeFeatureDetector;
import interfaces.ISight;

public class Sight implements ISight
{
	int MAX_DISTANCE = 30;
	int PERIOD = 200;
	UltrasonicSensor us = new UltrasonicSensor(SensorPort.S4);
	FeatureDetector fd = new RangeFeatureDetector(us, MAX_DISTANCE, PERIOD);
	Feature result;
	
	@Override
	public Object scan() 
	{
		result = fd.scan();
		return result;
	}

	@Override
	public float getRange() 
	{
		return result.getRangeReading().getRange();
	}
	
}
