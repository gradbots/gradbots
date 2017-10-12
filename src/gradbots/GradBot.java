package gradbots;

import java.awt.Color;

import gradbots.BehaviourManagement.BehaviourProfileManager;
import gradbots.Interfaces.IBehaviourProfile;
import robocode.AdvancedRobot;
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

public class GradBot extends AdvancedRobot 
{
	protected IBehaviourProfile profile;
	
	public void run()
	{
		setColors(Color.BLUE, Color.BLUE, Color.BLUE, Color.BLUE, Color.BLUE);
		
		// allow independent gun/radar/turn
		setAdjustGunForRobotTurn(true);
		setAdjustRadarForGunTurn(true);
				
		while(true){
			profile = BehaviourProfileManager.Choose(this);
			profile.doDefault();
			execute();
		}
	}
	
	// bubble events to profile to handle
	
	public void onBattleEnded(BattleEndedEvent e)
	{
		profile.onBattleEnded(e);
	}
	
	public void onBulletHit(BulletHitEvent e)
	{
		profile.onBulletHit(e);
	}
	
	public void onBulletHitBullet(BulletHitBulletEvent e)
	{
		profile.onBulletHitBullet(e);
	}
	
	public void onBulletMissed(BulletMissedEvent e)
	{
		profile.onBulletMissed(e);
	}
	
	public void onDeath(DeathEvent e)
	{
		profile.onDeath(e);
	}
	
	public void onHitByBullet(HitByBulletEvent e)
	{
		profile.onHitByBullet(e);
	}
	
	public void onHitRobot(HitRobotEvent e)
	{
		profile.onHitRobot(e);
	}
	
	public void onHitWall(HitWallEvent e)
	{
		profile.onHitWall(e);
	}
	
	public void onRobotDeath(RobotDeathEvent e)
	{
		profile.onRobotDeath(e);
	}
	
	public void onRoundEnded(RoundEndedEvent e)
	{
		profile.onRoundEnded(e);
	}
	
	public void onScannedRobot(ScannedRobotEvent e)
	{
		profile.onScannedRobot(e);
	}
	
	public void onStatus(StatusEvent e)
	{
		profile.onStatus(e);
	}
	
	public void onWin(WinEvent e)
	{
		profile.onWin(e);
	}
	
	public void onSkippedTurn(SkippedTurnEvent e)
	{
		profile.onSkippedTurn(e);
	}
}

