package gradbots.GradBotWrappers;

import gradbots.GradBot;
import robocode.AdvancedRobot;
import robocode.Bullet;

/**
 * This class exposes the following methods of GradBot
 *  - All 'get' methods
 *  - Gun-related 'set' methods
 *  
 *   This class forces use of
 *  - degrees (not radians)
 *  - turning gun right only (use negative values for left)
 *  
 * @author KAHX
 *
 */
public class GunWrapper extends RobotInfoWrapper
{
	public GunWrapper(GradBot r) 
	{
		super(r);
	}

	// expose gun-specific set methods
	
	/**
	 * @see AdvancedRobot#setFire
	 */
	public void setFire(double d) 
	{
		robot.setFire(d);
	}
	
	/**
	 * @see AdvancedRobot#setFireBullet
	 */
	public Bullet setFireBullet(double d) 
	{
		return robot.setFireBullet(d);
	}
	
	/**
	 * @see AdvancedRobot#setTurnGunRight
	 */
	public void setTurnGunRight(double degrees) 
	{
		robot.setFire(degrees);
	}
}
