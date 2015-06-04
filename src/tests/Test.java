package tests;

import static org.junit.Assert.*;
import dummyData.*;

public class Test {

	@org.junit.Test
	public void testMotor() 
	{
		FakeMotor fm = new FakeMotor();
		fm.forward();
		fm.backwards();
		fm.spin();
		fm.stop();
		fm.setPower(10);
	}

}
