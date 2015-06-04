package interfaces;

public interface IMotor 
{
	public void forward();
	
	public void backwards();
	
	public void spin();
	
	public void stop();
	
	public void hammerSwing();
	
	public void setPower(int power);
}
