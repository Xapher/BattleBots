package code;

import lejos.nxt.MotorPort;
import lejos.nxt.NXTMotor;
import interfaces.ILight;
import interfaces.IMotor;
import interfaces.ISight;
import interfaces.ITime;

public class Main 
{
	public static void main(String[] args)
	{
		IMotor m1 = (IMotor) new NXTMotor(MotorPort.A);
		IMotor m2 = (IMotor) new NXTMotor(MotorPort.B);
		IMotor m3 = (IMotor) new NXTMotor(MotorPort.C);
		
		ILight light = new Light();
		ISight sight = new Sight();
		ITime time = new Time();
		
		Fight fight = new Fight(new Motor(m1,m2,m3), light, sight, time);
		try 
		{
			fight.findOpponent();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}
