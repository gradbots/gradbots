package gradbots.MovementBehaviours;

import java.awt.geom.Rectangle2D;
import gradbots.GradBot;
import gradbots.GradBotWrappers.MovementWrapper;
import gradbots.Interfaces.IMovementBehaviour;
import robocode.HitWallEvent;
import robocode.ScannedRobotEvent;
import robocode.util.Utils;

public class RandomMovementBehaviour implements IMovementBehaviour
{
	private static final double changeDirThres = 0.3;

	private static final double wallMargin = 30;
	
	private static final double moveDist = 250;
	
	protected MovementWrapper robot;
	
	public static int dir = 1;
	    
	public RandomMovementBehaviour(MovementWrapper mw)
	{
		robot = mw;
	}
	
	public void doDefault() {
		// TODO Auto-generated method stub
		
	}
	
	public void onScannedRobot(ScannedRobotEvent e)
	{
		double heading = e.getBearing() + robot.getHeading() - 90 * dir;
 
		Rectangle2D wallBox = new Rectangle2D.Double(wallMargin, wallMargin, robot.getBattleFieldWidth() - wallMargin * 2, robot.getBattleFieldHeight() - wallMargin * 2);
 
		while (!wallBox.contains(robot.getX() + Math.sin(heading * Math.PI / 180) * wallMargin, robot.getY() + Math.cos(heading * Math.PI / 180) * wallMargin)) {
			heading += dir * 0.5;
		}
 
		double turnAmount = Utils.normalRelativeAngleDegrees(heading - robot.getHeading());
 
		if (Math.abs(turnAmount) > 90) {
			turnAmount = Utils.normalRelativeAngleDegrees(turnAmount + 180);
			robot.setAhead(-moveDist);
		} else {
			robot.setAhead(moveDist);
		}
		
		if (Math.random() < 0.5)
			robot.setTurnRight(turnAmount);
		else
			robot.setTurnRight(-turnAmount);
 
		if (Math.random() < changeDirThres)
			dir = -dir;
	}
 
	public void onHitWall(HitWallEvent e) 
	{
		robot.setAhead(-moveDist);
	}
	
	public void onHitRobot(HitWallEvent e) 
	{
		robot.setAhead(-moveDist);
	}
}
