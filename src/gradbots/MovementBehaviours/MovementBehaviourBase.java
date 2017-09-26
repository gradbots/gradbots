package gradbots.MovementBehaviours;

import gradbots.GradBot;
import gradbots.Interfaces.IMovementBehaviour;
import robocode.BattleEndedEvent;
import robocode.BulletHitBulletEvent;
import robocode.BulletHitEvent;
import robocode.BulletMissedEvent;
import robocode.DeathEvent;
import robocode.HitByBulletEvent;
import robocode.HitRobotEvent;
import robocode.HitWallEvent;
import robocode.RobotDeathEvent;
import robocode.RoundEndedEvent;
import robocode.ScannedRobotEvent;
import robocode.SkippedTurnEvent;
import robocode.StatusEvent;
import robocode.WinEvent;

public class MovementBehaviourBase implements IMovementBehaviour
{
	protected GradBot robot;
	
	public MovementBehaviourBase(GradBot r)
	{
		robot = r;
	}
	
	public void doDefault()
	{
		robot.setAhead(100);
	}
	
	public void onBattleEnded(BattleEndedEvent e)
	{
		
	}
	
	public void onBulletHit(BulletHitEvent e)
	{
		
	}
	
	public void onBulletHitBullet(BulletHitBulletEvent e)
	{
		
	}
	
	public void onBulletMissed(BulletMissedEvent e)
	{
		
	}
	
	public void onDeath(DeathEvent e)
	{
		
	}
	
	public void onHitByBullet(HitByBulletEvent e)
	{
		
	}
	
	public void onHitRobot(HitRobotEvent e)
	{
		
	}
	
	public void onHitWall(HitWallEvent e)
	{
		
	}
	
	public void onRobotDeath(RobotDeathEvent e)
	{
		
	}
	
	public void onRoundEnded(RoundEndedEvent e)
	{
		
	}
	
	public void onScannedRobot(ScannedRobotEvent e)
	{
		
	}
	
	public void onStatus(StatusEvent e)
	{
		
	}
	
	public void onWin(WinEvent e)
	{
		
	}
	
	public void onSkippedTurn(SkippedTurnEvent e)
	{
		
	}
}
