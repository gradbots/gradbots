package gradbots.MovementBehaviours;

import gradbots.GradBot;
import gradbots.GradBotWrappers.MovementWrapper;
import gradbots.Interfaces.IMovementBehaviour;
import robocode.ScannedRobotEvent;
import robocode.util.Utils;

/**
 * This movement behaviour is all about ramming the enemy that we are tracking
 * @author jyba
 *
 */
public class RamMovementBehaviour implements IMovementBehaviour 
{
	protected MovementWrapper movementWrapper;
	
	public RamMovementBehaviour(MovementWrapper mw)
	{
		movementWrapper = mw;
	}
	
	public void onScannedRobot(ScannedRobotEvent e)
	{
		double turn = Utils.normalRelativeAngleDegrees(e.getBearing());
		movementWrapper.setTurnRight(turn);
		
		movementWrapper.setAhead(100);
	}
	
	public void doDefault()
	{

	}
}
