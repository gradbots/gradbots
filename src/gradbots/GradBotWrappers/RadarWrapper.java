package gradbots.GradBotWrappers;

import gradbots.GradBot;
import robocode.AdvancedRobot;

/**
 * This class exposes the following methods of GradBot
 *  - All 'get' methods
 *  - Radar-related 'set' methods
 * 
 * @author KAHX
 *
 */
public class RadarWrapper extends RobotInfoWrapper
{

	public RadarWrapper(GradBot r) 
	{
		super(r);
	}

	// expose radar specific methods
	
	/**
	 * @see AdvancedRobot#setTurnRadarRight
	 */
	public void setTurnRadarRight(double degrees)
	{
		robot.setTurnRadarRight(degrees);
	}
}
