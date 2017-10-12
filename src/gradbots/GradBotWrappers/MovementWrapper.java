package gradbots.GradBotWrappers;

import gradbots.GradBot;
import robocode.AdvancedRobot;

/**
 * This class exposes the following methods of GradBot
 *  - All 'get' methods
 *  - Movement-related 'set' methods
 *  
 *  This class forces use of
 *  - degrees (not radians)
 *  - turning right only (use negative values for left)
 *  - moving forward only (use negative values for back)
 * 
 * @author KAHX
 *
 */
public class MovementWrapper extends RobotInfoWrapper
{
	public MovementWrapper(GradBot r) 
	{
		super(r);
	}

	// expose movement specific methods
	
	/**
	 * @see AdvancedRobot#setAhead
	 */
	public void setAhead(double d) 
	{
		robot.setAhead(d);
	}
	
	/**
	 * @see AdvancedRobot#setMaxTurnRate
	 */
	public void setMaxTurnRate(double d) 
	{
		robot.setMaxTurnRate(d);
	}
	
	/**
	 * @see AdvancedRobot#setMaxVelocity
	 */
	public void setMaxVelocity(double d) 
	{
		robot.setMaxVelocity(d);
	}
	
	/**
	 * @see AdvancedRobot#setResume
	 */
	public void setResume() 
	{
		robot.setResume();
	}
	
	/**
	 * @see AdvancedRobot#setStop
	 */
	public void setStop() 
	{
		robot.setResume();
	}
	
	/**
	 * @see AdvancedRobot#setTurnRight
	 */
	public void setTurnRight(double degrees)
	{
		robot.setTurnRight(degrees);
	}

}
