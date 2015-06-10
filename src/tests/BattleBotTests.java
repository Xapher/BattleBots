package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import dummyData.FakeMotor;

public class BattleBotTests {

	@Test
	public void test() 
	{
		FakeMotor fm = new FakeMotor();
		fm.forward();
		fm.backwards();
		fm.spin();
		fm.stop();
		fm.hammerSwing();
		fm.setPower(12);
	}

}
