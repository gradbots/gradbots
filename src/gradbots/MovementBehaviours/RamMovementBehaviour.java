package gradbots.MovementBehaviours;

import gradbots.GradBot;
import gradbots.Interfaces.IMovementBehaviour;
import robocode.ScannedRobotEvent;

/**
 * This movement behaviour is all about raming the enemy that we are tracking
 * @author jyba
 *
 */
public class RamMovementBehaviour implements IMovementBehaviour {
	
	protected GradBot robot;
	private GradBot enemyRobot;
	private double enemyBearing = 360;
	
	public RamMovementBehaviour(GradBot r)
	{
		robot = r;
	}
	
	public void onScannedEvent(ScannedRobotEvent e)
	{
		enemyBearing = e.getBearing();
		robot.setTurnRight(enemyBearing);
	}
	
	public void doDefault()
	{
		if (robot.getHeading() != enemyBearing)
		{
			robot.setTurnRight(enemyBearing);
		}
		
		robot.setAhead(enemyBearing);
	}
}
