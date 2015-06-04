package code;

import interfaces.ITime;
import lejos.util.Stopwatch;

public class Time implements ITime
{
	static Stopwatch sw = new Stopwatch();
	
	@Override
	public void start()
	{
		sw.reset();
	}
	
	@Override
	public int calculate()
	{
		//get milliseconds and convert it to seconds
		int seconds = sw.elapsed()/1000;
		return seconds;
	}
	
}
